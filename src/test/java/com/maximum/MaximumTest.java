package com.maximum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumTest {

    //Test cases for Integer type
    @Test
    public void firstNumberIsMaxInteger() {
        Integer maxNo = (Integer) new Maximum(12, 9, 5,2,1).testMaximum();
        Assertions.assertEquals(12, maxNo);
    }

    @Test
    public void secondNumberIsMaxInteger(){
        Integer maxNo = (Integer) new Maximum(9,12,3,8,5).testMaximum();
        Assertions.assertEquals(12,maxNo);
    }

    @Test
    public void thirdNumberIsMaxInteger(){
        Integer maxNo = (Integer) new Maximum(9,5,11,6,7).testMaximum();
        Assertions.assertEquals(11,maxNo);
    }

    //Test cases for Float type
    @Test
    public void firstNumberIsMaxFloat(){
        Float maxNo = (Float) new Maximum(2873.5f,1873.8f,964.7f,25.2f,36.4f).testMaximum();
        Assertions.assertEquals(2873.5f,maxNo);
    }

    @Test
    public void secondNumberIsMaxFloat(){
        Float maxNo = (Float) new Maximum(946.5f,2589.5f,1598.5f,964.7f,25.2f).testMaximum();
        Assertions.assertEquals(2589.5f,maxNo);
    }

    @Test
    public void thirdNumberIsMaxFloat(){
        Float maxNo = (Float) new Maximum(1268.4f,951.6f,2587.3f,1873.8f,964.7f).testMaximum();
        Assertions.assertEquals(2587.3f,maxNo);
    }

    //Test cases for String
    @Test
    public void firstStringIsMax(){
        String maxString = (String) new Maximum("Zebra","Banana","Mango","Kiwi","Pineapple").testMaximum();
        Assertions.assertEquals("Zebra",maxString);
    }

    @Test
    public void secondStringIsMax(){
        String maxString = (String) new Maximum("Banana","Zebra","Mango","Samsung","Blackberry").testMaximum();
        Assertions.assertEquals("Zebra",maxString);
    }

    @Test
    public void thirdStringIsMax(){
        String maxString = (String) new Maximum("Banana","Mango","Zebra","TATA","KIA").testMaximum();
        Assertions.assertEquals("Zebra",maxString);
    }
}
