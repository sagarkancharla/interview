package org.cc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest
{
    @Test
    public void testGetMessage()
    {
        Assertions.assertEquals(App.getMessage(), "Hello World!");
    }
}
