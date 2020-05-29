package com.company;

public class testRandom {
    public static void main(String[] args) {
        double num = Math.random();
        System.out.println((int)(num*100));
        int  a = (int )(num * 100);
        int arr[] = new int[a];
        int sum = 0;
        int n = 0;
        for (int i = 3; ; i+=3){
            arr[n] = i;
            n++;
            if(i % 9 == 0){
                sum+= i;
            };
            if(n > arr.length-1){
                break;
            }
        }
        for(int s:arr){
            System.out.println("  "+s);
        }
        System.out.println(sum);
    }
}
