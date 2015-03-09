package org.mrseasons.coffeetime.java.scope;

import junit.framework.TestCase;

/**
 * Created by mrseasons on 2015/3/8.
 */
public class ScopeTest extends TestCase{

    public void testBlockScope(){
        for(int i=0;i<100;i++){
            new A(i);
            System.gc();
        }
    }

    class A{

        private int value;

        public A(int value){
            this.value=value;
        }
        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            System.out.println("finalize "+value);
        }
    }
}
