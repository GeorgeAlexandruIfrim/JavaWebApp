package org.test;
import org.example.Animal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void test(){

        Animal girafe = new Animal("Giraffe");

        assertEquals(girafe, new Animal("Giraffe"));
    }
}
