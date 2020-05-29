package com.company;

public class testOne {
    public static void main(String[] args) {
        /*int a=0; int c=0;
        do {
            --c;
            a=a-1;
        } while (a>0);
        System.out.println(c);*/

        /*int index= 1;
        String [] test=new String[3];
        String foo=test[index];
        System.out.println(foo);*/

        /*int a = 1;
        int b = 2;
        int d = 0;
        try{
            d = a+b ;
            return d;
        } finally{
            d=a-b;
        }*/


        /*testOne t= new testOne();
        int a=3;
        t.test1(a);
        System.out.println(" main方法中的a="+a);*/


       /* int n=2;
        int a[] = new int[n];
        for (int  k=0;k < n; k++ ){
            a[k] = 0;
        }
        int i  =  0, call_n  =  0,  out_n = 0;
        while (true) {
            if (a[i] == 0){
                if (out_n == (n -1))
                    break;
                call_n++;
                call_n %=3;
                if (call_n == 0) {
                    a[i] = 1;
                    call_n++;
                }
            }
            i++;
            i %= n;
        }
        System.out.println( i + 1);
*/

        String s1=new String(" abc");
        String s2= new String("abe" );
        boolean b1=s1 .equals(s2);
        boolean b2=(s1==s2);
        System.out.println(b1+" "+b2);


    }
   /* private void test1(int a){
        a=5;
        System.out.println("test1 方法中的a="+a);
    }*/

}
