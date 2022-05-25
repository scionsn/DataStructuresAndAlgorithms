public class longestAlternOddEvenSubarr {
    static int longestAltLength(int arr[]){
        int longestlen=0;
        int count=0;
for(int i=0;i<arr.length-1;i++)
{
    if((arr[i]+arr[i+1])%2==1)
    {
count++;
    }
    else{
      longestlen=  Math.max(longestlen,count);
      // again begin the count for alternating odd even sub array
      count=0;
    }

}
if(longestlen==0)
return 0;
return longestlen+1;// the lrngth will be 1 greater than count

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,7,9};
       System.out.println(longestAltLength(arr));;
        }
    }

