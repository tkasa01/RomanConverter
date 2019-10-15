package com.example.udemiPackChallenge;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static String print(int[] ar, String one, String five, String ten){
        int th = ar[0];
        int hun = ar[1];
        int tens = ar[2];
        int unit = ar[3];
        String n = "";
        if(th <= 3){
            n += one;
        }else if(th == 4) {
            n += one+five;
        } else if(th == 5){
            n += five;
        }else {
            n += five+one;
        }
        System.out.println(n);
        return n;
    }
}
