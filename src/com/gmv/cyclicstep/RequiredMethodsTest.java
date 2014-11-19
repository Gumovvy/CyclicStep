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
        assertEquals("Must be 50:  ", 80, req.finalTime(1,20));
    }

    @Test
    public void testCountOfStep() throws Exception {
        assertEquals("Must be 50:  ", 2f, req.countOfStep(100,50f));

    }

    @Test
    public void testStepsPerSeconds() throws Exception {
        assertEquals("Must be 50:  ", 5f, req.stepsPerSeconds(10f,50f));

    }

    @Test
    public void testAmountStepsPerSeconds() throws Exception {
        assertEquals("Must be 50:  ", 2000.0, req.amountStepsPerSeconds(100.0,50f));

    }
    
}