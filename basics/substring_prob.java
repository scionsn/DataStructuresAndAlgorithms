/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_algo;
import java.util.ArrayList;
/**
 * @author SCION
 to find the all possible substring of a given string say abc using recursion.
 */
public class substring_prob {
    //the below method returns an array list,and we add an empty string so
//    that the loop can atleast traverse the arraylist once.
    static ArrayList<String > subsequence(String str){
        if(str.length()==0){
            ArrayList<String> emptystring=new ArrayList<>();
            emptystring.add("");
            return emptystring;
        }
        char currentchar=str.charAt(0);
        String remainingstring=str.substring(1);
                    ArrayList<String> result=new ArrayList<>();
                                ArrayList<String> temp=subsequence(remainingstring);
                                //the for loop above loops around 7 times in total(1+2+4)
                                for(String s:temp){
                                    result.add(s);
                                    result.add(currentchar+s);
                                    System.out.println("run");
                                }
                                return result;
    }
    public static void main(String[] args) {
        String str="abc";
        System.out.println(subsequence(str));
//                System.out.println(subsequence(str).contains("abc"));

    }
   
}
