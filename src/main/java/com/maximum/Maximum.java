package com.maximum;

public class Maximum <S extends Comparable<S>>{
    S i,j,k;
    public Maximum(S i,S j, S k){
        this.i=i;
        this.j=j;
        this.k=k;
    }
    public S testMaximum(){
        return Maximum.testMaximum(i,j,k);
    }
    public static void main(String[] args) {
        System.out.println("Find Maximum problem");
        new Maximum(95,96,100).testMaximum();
        new Maximum(252.5f,2563.5f,456.2f).testMaximum();
        new Maximum("Batman","IronMan","Thor").testMaximum();
    }

    public static <S extends Comparable<S>> S testMaximum(S i, S j, S k){
        S max = i;
        if(j.compareTo(max)>0){
            max=j;
        }
        if(k.compareTo(max)>0){
            max=k;
        }
        System.out.println(max);
        return max;
    }

}
