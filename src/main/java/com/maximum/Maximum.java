package com.maximum;

public class Maximum {
    public static void main(String[] args) {
        System.out.println("Find Maximum problem");
    }

    public Integer maxInteger(Integer i, Integer j, Integer k) {
        Integer max = i;
        if(j.compareTo(max)>0){
            max=j;
        }
        if(k.compareTo(max)>0){
            max=k;
        }
        return max;
    }

    public Float maxFloat(Float i, Float j, Float k) {
        Float max = i;
        if(j.compareTo(max)>0){
            max=j;
        }
        if(k.compareTo(max)>0){
            max=k;
        }
        return max;
    }
}
