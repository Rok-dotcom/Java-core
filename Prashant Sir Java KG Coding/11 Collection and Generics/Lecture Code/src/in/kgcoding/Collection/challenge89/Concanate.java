package in.kgcoding.Collection.challenge89;

import java.util.Scanner;

public class Concanate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your Strings ");
//        String st = sc.next();
        String conStr = StrStore("ramesh ", " is ", " hardworking men ");
        System.out.println("your concatenated String is :"+conStr);

    }
    public static String StrStore(String... word1){
        String store = "";
        for(String c : word1) {
            System.out.println(" ");
            store += c;
        }
        return store;
    }
}
