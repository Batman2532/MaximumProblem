package com.maximum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumTest {
    Maximum max = new Maximum();

    //Test cases for Integer type
    @Test
    public void firstNumberIsMaxInteger(){
      Integer maxNo =  max.checkMax(9,5,3);
        Assertions.assertEquals(9,maxNo);
    }

    @Test
    public void secondNumberIsMaxInteger(){
        Integer maxNo =  max.checkMax(9,12,3);
        Assertions.assertEquals(12,maxNo);
    }

    @Test
    public void thirdNumberIsMaxInteger(){
        Integer maxNo =  max.checkMax(9,5,11);
        Assertions.assertEquals(11,maxNo);
    }

    //Test cases for Float type
    @Test
    public void firstNumberIsMaxFloat(){
        Float maxNo =  max.checkMax(2873.5f,1873.8f,964.7f);
        Assertions.assertEquals(2873.5f,maxNo);
    }

    @Test
    public void secondNumberIsMaxFloat(){
        Float maxNo =  max.checkMax(946.5f,2589.5f,1598.5f);
        Assertions.assertEquals(2589.5f,maxNo);
    }

    @Test
    public void thirdNumberIsMaxFloat(){
        Float maxNo =  max.checkMax(1268.4f,951.6f,2587.3f);
        Assertions.assertEquals(2587.3f,maxNo);
    }

    //Test cases for String
    @Test
    public void firstStringIsMax(){
        String maxString =  max.checkMax("Zebra","Banana","Mango");
        Assertions.assertEquals("Zebra",maxString);
    }

    @Test
    public void secondStringIsMax(){
        String maxString =  max.checkMax("Banana","Zebra","Mango");
        Assertions.assertEquals("Zebra",maxString);
    }

    @Test
    public void thirdStringIsMax(){
        String maxString =  max.checkMax("Banana","Mango","Zebra");
        Assertions.assertEquals("Zebra",maxString);
    }
}
