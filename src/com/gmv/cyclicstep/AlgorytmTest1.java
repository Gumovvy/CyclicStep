package com.gmv.cyclicstep;

import junit.framework.TestCase;

public class AlgorytmTest1 extends TestCase {
    RequiredMethods test = new RequiredMethods();

    public void testDystansBiegu() throws Exception {
        assertEquals("Musi wyjsc 100", 100f, test.getTimeToBeat(100f));

    }
}