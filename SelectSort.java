package Sort;

public class SelectSort {

	public static void main(String[] args){
		
		int [] myarray={2,7,4,1,5,3};
		
		SelectSortTest(myarray);
		for(int i=0; i<myarray.length; i++){
			System.out.print(myarray[i]+" ");
		}
		System.out.print("\n");
		
	}
	
	public static void SelectSortTest(int[] A){
		
		//int nA= A.length;
		
		for (int i=0; i<A.length-1; i++){
			
			int iMin=i;
			
			for(int j=i+1; j<A.length; j++){
				
				if(A[iMin]>A[j]){
					
					iMin=j;
				}
				
			}
			
			int temp= A[i];
			A[i]=A[iMin];
			A[iMin]=temp;
		
		}
		
		
		
		
		
		
	}
	
	
	
}
