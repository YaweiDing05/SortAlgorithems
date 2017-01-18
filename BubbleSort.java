package Sort;

public class BubbleSort {

	
	public static void main (String[] args){
		
		
		int [] myarray= {2,7,4,1,5,3};
		
		BubbleSortTest(myarray);
		for(int i=0; i<myarray.length;i++){
			System.out.print(myarray[i]+" ");
		}
		System.out.print("\n");
	}
	
	public static void BubbleSortTest(int[] A){
		
		int nA= A.length;
		
		for(int i=0; i<nA-1;i++){
			
			for(int j=0; j<nA-i-1; j++){
				
				if(A[j]>A[j+1]){
					int temp=A[j];
					A[j]=A[j+1];
					A[j+1]=temp;
				}
				
			}
		}
		
		
		
		
		
	}
}
