package com.idoescode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    App app = new App();

    @Test
    public void shouldReturnFive()
    {
        assertEquals(app.returnFive(), 5);
    }

    @Test
    public void shouldReturnFiveOrSix()
    {
        assertEquals(app.returnFiveOrSix(5), 5);
        assertEquals(app.returnFiveOrSix(6), 6);
    }

    @Test
    public void shouldReturnNumberOrWordsStartingWithS()
    {
        assertEquals(app.numWords(""), 0);
        assertEquals(app.numWords("spagetti"), 1);
        assertEquals(app.numWords(" "), 0);
        assertEquals(app.numWords("super spagetti"), 2);
        assertEquals(app.numWords("super spagetti basil"), 2);
        assertEquals(app.numWords("super Spagetti basil"), 2);
    }
}
