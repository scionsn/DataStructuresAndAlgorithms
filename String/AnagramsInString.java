

import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SCION
 */
public class AnagramsInString {
     static public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = null;
        int lil[]=new int[26];
        int big[]=new int[26];
        int small=p.length();
        int norm=s.length();
        for(int i=0;i<s.length();i++){
            
        }

        return list;
    }

    public static void main(String[] args) {
        String a="cbaebabacd";
   String  p= "abc";
   List<Integer> res=findAnagrams(a,p);
   for(int i:res){
       System.out.println(i);
   }
    }
}
