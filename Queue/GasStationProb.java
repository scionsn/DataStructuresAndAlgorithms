/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SCION
 * there are n gas stations along a circular route,and the amount of gas at station i 
 * is given by gas[i],it costs  cost[i] gas to travel from station i to i+1. u begin the 
 * journey with an empty tank at one of the gas stations.return the starting gas stations index
 * but if there isn't any station then return -1.
 */
public class GasStationProb {
    static int station(int gas[],int cost[]){
        int sum=0,deficit=0,start=0;
        for(int i=0;i<gas.length;i++){
           sum=sum+gas[i]-cost[i];
            if(sum<0){
                start=i+1;
                deficit=deficit+sum;
                sum=0;
            }
        }
        return sum>=0?start:-1;
    } 
     public static void main(String[] args) {
//        int gas[]={1,2,3,4,5};
        int gas[]={1,2,3,4,3,2,4,1,5,3,2,4};
//        int cost[]={3,4,5,1,2};
        int cost[]={1,1,1,3,2,4,3,6,7,4,3,1};

      int res=  station(gas,cost);
         System.out.println(res);
    }
}