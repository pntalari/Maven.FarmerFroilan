package com.zipcodewilmington.froilansfarm.storage;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FieldTest {

    @Test
    public void singletonTest() {
        Field fieldObj1 = Field.getInstance();
        Field fieldObj2 = Field.getInstance();
        Assert.assertSame(fieldObj1,fieldObj2);
    }
}