package com.hackthon;

import java.util.*;


class Day_8{
  public static void main(String []argh){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      Map<String, Integer> phonebook = new HashMap<>(); 
      for(int i = 0; i < n; i++){
          String name = in.next();
          int phone = in.nextInt();
          phonebook.put(name, phone);
          
      }
      while(in.hasNext()){
          String s = in.next();
          if(phonebook.get(s)!=null) {
          int phone = phonebook.get(s);
          System.out.println(s+"="+phone );
          }else
          System.out.println("Not found");
      }
      in.close();
  }
}