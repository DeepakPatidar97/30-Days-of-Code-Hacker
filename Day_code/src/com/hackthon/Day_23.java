package com.hackthon;


import java.io.*;
import java.util.*;
class NodeLavel{
    NodeLavel left,right;
    int data;
    NodeLavel(int data){
        this.data=data;
        left=right=null;
    }
}
class Day_23{

	static void levelOrder(NodeLavel root){
       Queue<NodeLavel> queue = new LinkedList();
    queue.add(root);
    
    while(!queue.isEmpty()){
        NodeLavel current = queue.remove();
        System.out.print(current.data+" ");
        if (current.left!=null) queue.add(current.left);
        if (current.right!=null) queue.add(current.right);
    }
      
    }

	public static NodeLavel insert(NodeLavel root,int data){
        if(root==null){
            return new NodeLavel(data);
        }
        else{
            NodeLavel cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            NodeLavel root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}