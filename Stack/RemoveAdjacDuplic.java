package ds_algo;


import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SCION
 *remove adjacent duplicates from a string.
*/

public class RemoveAdjacDuplic{
    public static void main(String[] args) {
        String s="abbaca";
        int j=0;
        Stack<Character> stack=new Stack<>();
        for(int i=1;i<s.length()&&j<s.length();i++){
          if(s.charAt(j)!=s.charAt(i)){
               j++;
               j=s.charAt(i);
          }
         
        }
        for(int i:stack){
            System.out.println(i);
        }
    }
}
