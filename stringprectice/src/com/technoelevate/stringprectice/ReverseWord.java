package com.technoelevate.stringprectice;


import java.util.Scanner;

 class ReverseWord {
     public static String reverseWord(String str){
         String words[]=str.split("\\s");
         String reverseWord="";
         for(String w:words){
             StringBuilder sb=new StringBuilder(w);
             sb.reverse();
             reverseWord+=sb.toString()+" ";
         }
         return reverseWord.trim();
     }

     public static void main(String[] args) {
         String temp = "";
         Scanner sc = new Scanner(System.in);
         String str = sc.nextLine();
         String str1 = sc.nextLine();
         String concat = str.concat(" " + str1);
         System.out.println(reverseWord(concat));
     }


    }

