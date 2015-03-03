package org.mrseasons.coffeetime.java.guava;

import com.google.common.collect.Lists;
import com.google.common.util.concurrent.AbstractIdleService;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.Service;
import junit.framework.TestCase;
import sun.jvm.hotspot.utilities.Assert;

import java.util.List;
import java.util.concurrent.Executor;

/**
 * Created by mrseasons on 3/3/15.
 */
public class ServiceTest extends TestCase {

    class DefaultService extends AbstractIdleService {

        @Override
        protected void startUp() throws Exception {
            System.out.println("startUp");
        }

        @Override
        protected void shutDown() throws Exception {
            System.out.println("shutDown");
        }
    }

    class TestService extends AbstractIdleService {
        int startUpCalled = 0;
        int shutDownCalled = 0;
        final List<State> transitionStates = Lists.newArrayList();

        @Override
        protected void startUp() throws Exception {
            assertEquals(0, startUpCalled);
            assertEquals(0, shutDownCalled);
            startUpCalled++;
            assertEquals(State.STARTING, state());
        }

        @Override
        protected void shutDown() throws Exception {
            assertEquals(1, startUpCalled);
            assertEquals(0, shutDownCalled);
            shutDownCalled++;
            assertEquals(State.STOPPING, state());
        }

        @Override
        protected Executor executor() {
            transitionStates.add(state());
            return MoreExecutors.sameThreadExecutor();
        }
    }


    public void testServiceStartStop() throws Exception {
        AbstractIdleService service = new DefaultService();
        service.startAsync().awaitRunning();

        assertEquals(Service.State.RUNNING, service.state());
        service.stopAsync().awaitTerminated();

        assertEquals(Service.State.TERMINATED, service.state());
    }

    public void testStart_failed() throws Exception {
        final Exception exception = new Exception("deliberate");
        AbstractIdleService service = new DefaultService() {
            @Override
            protected void startUp() throws Exception {
                throw exception;
            }
        };
        try {
            service.startAsync().awaitRunning();
            fail();
        } catch (RuntimeException e) {
            assertSame(exception, e.getCause());
        }
        assertEquals(Service.State.FAILED, service.state());
    }

    public void testStart() {
        TestService service = new TestService();
        assertEquals(0, service.startUpCalled);
        service.startAsync().awaitRunning();
        assertEquals(1, service.startUpCalled);
        assertEquals(Service.State.RUNNING, service.state());
//        Assert.that(service.transitionStates).has().exactly(Service.State.STARTING).inOrder();
    }

}
