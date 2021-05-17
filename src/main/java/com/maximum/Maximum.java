package com.maximum;

public class Maximum <S extends Comparable<S>>{
    S i,j,k,l,m;
    public Maximum(S i,S j, S k, S l, S m){
        this.i=i;
        this.j=j;
        this.k=k;
        this.l=l;
        this.m=m;
    }
    public S testMaximum(){
        return Maximum.testMaximum(i,j,k,l,m);
    }
    public static void main(String[] args) {
        System.out.println("Find Maximum problem");
        new Maximum(95,96,100,123,258).testMaximum();
        new Maximum(252.5f,2563.5f,456.2f,369.3f,174.1f).testMaximum();
        new Maximum("Batman","IronMan","Thor","Spiderman","Shaktiman").testMaximum();
    }

    public static <S> void printMax(S max){
        System.out.println("Maximum is "+max);
    }
    public static <S extends Comparable<S>> S testMaximum(S i, S j, S k,S l, S m){
        S max = i;
        if(j.compareTo(max)>0){
            max=j;
        }
        if(k.compareTo(max)>0){
            max=k;
        }
        if(l.compareTo(max)>0){
            max=l;
        }
        if(m.compareTo(max)>0){
            max=m;
        }
        printMax(max);
        return max;
    }

}
