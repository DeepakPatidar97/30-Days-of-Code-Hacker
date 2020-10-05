package com.hackthon;


import java.io.*;
import java.util.*;
class NodeList{
	int data;
	NodeList next;
	NodeList(int d){
        data=d;
        next=null;
    }
	
}
class Day_24
{

    public static NodeList removeDuplicates(NodeList head) {
       if (head == null || head.next == null){
        return head;
    }
    if (head.data == head.next.data){
        head.next = head.next.next;
        removeDuplicates(head);
    }else{
        removeDuplicates(head.next);
    }
    return head;

    }

    public static  NodeList insert(NodeList head,int data)
    {
        NodeList p=new NodeList(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            NodeList start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(NodeList head)
        {
              NodeList start=head;
              while(start!=null)
              {
                  System.out.print(start.data+" ");
                  start=start.next;
              }
        }
        public static void main(String args[])
        {
              Scanner sc=new Scanner(System.in);
              NodeList head=null;
              int T=sc.nextInt();
              while(T-->0){
                  int ele=sc.nextInt();
                  head=insert(head,ele);
              }
              head=removeDuplicates(head);
              display(head);

       }
    }