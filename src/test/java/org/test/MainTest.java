package org.test;
import org.example.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testMessageWhenMorning(){
        String msg = Main.helloWorld(true);

        assertEquals(msg, "Good Morning");
    }
    @Test
    public void testMessageWhenNotMorning(){
        String msg = Main.helloWorld(false);

        assertEquals(msg, "Not Morning");
    }
}
