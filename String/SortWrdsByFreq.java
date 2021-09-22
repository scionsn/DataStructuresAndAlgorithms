package ds_algo;


import java.util.ArrayList;
import java.util.HashMap;
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
public class SortWrdsByFreq {
    public static String meth(String arr[],int k){
                       HashMap<String,Integer> mp=new HashMap<>();

        for(String s:arr){
            mp.put(s,mp.getOrDefault(s,0)+1);
        }
        List<String>[] list=new List[arr.length+1];
        for(String s:mp.keySet()){
            int freq=mp.get(s);
            if(list[freq]==null){
                list[freq]=new ArrayList<>();
            }
            list[freq].add(s);
            
        }
        String array[]=new String[mp.size()+1];

        for(int i=array.length-1;i>=0;i--){
            if(list[i]!=null){
                for(String s:list[i]){
                    for(int j=0;j<mp.size();j++){
                        array[mp.get(s)]=s;
                    }
                }
            }
        }
        if(k<=arr.length)
        return array[array.length-k];
        else return "cant display value as val doesnt exist";
//      for(String s:array){
//          System.out.println(s);
//      }
        
        
        
    }
    public static void main(String[] args) {
       String arr[]={"geeks","for","geeks"};
        System.out.println(meth(arr,2));
//meth(arr,1);
    }
}
