import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 int arr[]={5,1,4,3,2};
	 
	Next_Permutation(arr);
	 
	}
    
    public static void Next_Permutation(int arr[]){
        int pivot=-1;
        // find pivot 
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i]<arr[i+1]){
                pivot=i;
                break;
            }
        }
        
        if(pivot==-1){
            reverse(arr,0,arr.length-1);
        }
        
        for(int i=arr.length-1; i>=pivot; i++){
            if(arr[i]>arr[pivot]){
                swap(arr,i,pivot);
                break;
            }
        }
        
        reverse(arr,pivot+1,arr.length-1);
        
        System.out.println("Answer : "+Arrays.toString(arr));
    }
    
    
    public static void swap(int arr[], int index1 , int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    
    public static void reverse(int arr[],int left, int right){
        while(left<right){
            swap(arr,left,right);
            left++;
            right--;
        }
    }
}
