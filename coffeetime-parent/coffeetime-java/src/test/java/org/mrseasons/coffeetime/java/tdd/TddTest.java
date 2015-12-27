package org.mrseasons.coffeetime.java.tdd;

import org.junit.Test;
import org.mrseasons.coffeetime.java.tdd.bean.Price;
import org.mrseasons.coffeetime.java.tdd.bean.StubPrice;
import org.mrseasons.coffeetime.java.tdd.bean.Ticket;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by mrseasons on 3/2/15.
 */
public class TddTest {

    @Test
    public void testNominal() {
        //nominal object
        //not related to test logic, only make code run normally
        String dummyName = "Normal";
        Ticket ticket = new Ticket(dummyName, 10);
        assertEquals(9, ticket.getDisountPrice(), 0.01);
    }

    @Test
    public void testStub() {
        //stub object
        //can make same response
        Price price = new StubPrice();
        Ticket ticket = new Ticket(price);
        assertEquals(9, ticket.getDisountPrice(), 0.01);
    }

    //substitute
    //can make a similar response, for example, use memory db insteadof relational db temporarily

    @Test
    public void testMock() {
        //mock object
        //can specify different response
        Price price = mock(Price.class);
        when(price.getInitialPrice()).thenReturn(100);
        Ticket ticket = new Ticket(price);
        assertEquals(90, ticket.getDisountPrice(), 0.01);

        verify(price).getInitialPrice();
    }
}
