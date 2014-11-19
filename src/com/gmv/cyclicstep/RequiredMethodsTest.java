package com.gmv.cyclicstep;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class RequiredMethodsTest extends TestCase {
    RequiredMethods req = new RequiredMethods();

    @Test
    public void testMockedreadTimetoBeat() throws Exception {
        assertEquals("Must be 50:  ", 50f, req.MockedreadTimetoBeat(0,50f));

    }

    @Test
    public void testFinalTime() throws Exception {

    }

    @Test
    public void testCountOfStep() throws Exception {

    }

    @Test
    public void testStepsPerSeconds() throws Exception {

    }

    @Test
    public void testAmountStepsPerSeconds() throws Exception {

    }

    @Test
    public void testMOCKEDfunkcjaGlowna() throws Exception {

    }
}