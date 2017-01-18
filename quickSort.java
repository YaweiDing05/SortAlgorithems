package sort;

import java.util.Random;

public class quickSort {

	public static void main(String[] args){
		int [] myarray={ 7,2,1,8,6,5,3,4};
		for(int i=0; i<myarray.length; i++){
		System.out.print(myarray[i]+" ");
		}
		System.out.print("\n");
		
		QuickSortArray(myarray,0,myarray.length-1);
		
		for(int i=0; i<myarray.length; i++){
		System.out.print(myarray[i]+" ");
		}
		
		System.out.print("\n");
		
	}
	
   public static void QuickSortArray(int[] A, int start, int end){
	   if(start<end){
	  
	  // int partitionIndex = Partition(A,start, end);
		   
	// use Random pivot
		   
	   int partitionIndex= RandomPartition(A, start, end);
	   QuickSortArray(A,start, partitionIndex-1);
	   
	   QuickSortArray(A,partitionIndex+1, end);
	   
	   }
   }
	public static int RandomPartition(int[] A, int start, int end){
		int partitionIndex=0;
		int pIndex=0;
		Random numIndex = new Random();
		
		
		//new Random().netInt(max - min) + min;
		// nextInt(5) generates Five numbers from 0,1,2,3,4 //
	
		partitionIndex= numIndex.nextInt(end-start)+start+1;
		
		
	
		swap(A,partitionIndex, end);
	
		
		pIndex=Partition(A,start,end);
	
		return pIndex;
	}
	public static int Partition(int[] A, int start, int end){
		
		
		int partitionIndex=0;
		int pivot = A[end];
		
		partitionIndex=start;
		
		for(int i=start; i<end; i++){
			
			if(A[i]<=pivot){
				swap(A,partitionIndex,i);
				partitionIndex++;
			}
			
			
			
		}
		
		swap(A,partitionIndex,end);
		
	
		return partitionIndex;
	}
	
	public static  void swap(int[] A, int n, int m){
		
		int temp=0;
		temp=A[n];
		A[n]=A[m];
		A[m]=temp;
				
		
	}
	
	

	
}
