/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_algo;

/**
 *
 * @author SCION
 * implement a stack using q.
 * this can be done by using two q's.
 */
public class StackUsingQueue {
   static int q1[]=new int[5];
    static int q2[]=new int[q1.length];
    static int f1=-1,f2=-1,count=0;
    static int r1=-1,r2=-1;
    static void enq1(int data){
        if(r1==q1.length-1){
            System.out.println("q1 overflow");
        }
        else if(f1==-1&&r1==-1){
            f1=r1=0;
            q1[r1]=data;
            
        }
        else{
            r1++;
            q1[r1]=data;
            
        }
        
    }
    static void enq2(int data){
        if(f2==-1&&r2==-1){
            f2=r2=0;
            q2[r2]=data;
            
        }
        else if(r2==q2.length-1){
            
            System.out.println("q2 overflow"); 
    }
        else
        {
           r2++;
           q2[r2]=data;
        }
    }
    static int dq1(){
      if(f1==r1){
          f1=r1=-1;
      }
        return q1[f1++];
    }
    static int dq2(){
        if(f2==r2){
            f2=r2=-1;
        }
        
        return q2[f2++]; 
    }
    static void push(int data){
        enq1(data);
        count++;
    }   
    static void pop(){
        
        for(int i=0;i<count-1;i++){
          int res1= dq1();
          enq2(res1);
        }
        int r=dq1();
        System.out.println("the dqd elem is:-"+r);
        count--;
        for(int i=0;i<count-1;i++){
           int r2= dq2();
           enq1(r2);
        }
        int r3=dq2();
                System.out.println("the dqd elem is:-"+r3);

    }
    static void display(){
        for(int i=f1;i<=r1;i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        pop();
        push(4);
pop();
display();
    }
}
