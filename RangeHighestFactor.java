import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		System.out.println("Answer : "+RangeHighestFactor(10,15));

	}
	public static int RangeHighestFactor(int a, int b){
	    int maxExp=-1, ans=0;
	    for(int i=a; i<=b; i++){
	       int num=i,count=0;
	       while(num%2==0){
	           count++;
	           num/=2;
	       }
	       
	       if(count>maxExp){
	           maxExp=count;
	           ans=i;
	       }
	    }
	    return ans;
	}
}
