package com.maximum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumTest {
    Maximum max = new Maximum();

    @Test
    public void firstNumberIsMax(){
      Integer maxNo =  max.findMax(9,5,3);
        Assertions.assertEquals(9,maxNo);
    }

    @Test
    public void secondNumberIsMax(){
        Integer maxNo =  max.findMax(9,12,3);
        Assertions.assertEquals(12,maxNo);
    }

    @Test
    public void thirdNumberIsMax(){
        Integer maxNo =  max.findMax(9,5,11);
        Assertions.assertEquals(11,maxNo);
    }
}
