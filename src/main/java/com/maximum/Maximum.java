package com.maximum;

public class Maximum {
    public static void main(String[] args) {
        System.out.println("Find Maximum problem");
    }

    public <S extends Comparable> S checkMax(S i, S j, S k) {
        S max = i;
        if(j.compareTo(max)>0){
            max=j;
        }
        if(k.compareTo(max)>0){
            max=k;
        }
        return max;
    }
}
