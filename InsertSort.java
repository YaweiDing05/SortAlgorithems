package Sort;

public class InsertSort {

	public static void main(String[] args){
		
		int[] myarray= {7,2,4,1,5,3};
		InsertSortTest(myarray);
		for(int i=0; i<myarray.length; i++){
			System.out.print(myarray[i]+" ");
		}
		System.out.print("\n");
	}
	
	
	public static void InsertSortTest(int[] A){
		
		for(int i=1; i<A.length;i++){
			
			int value= A[i];
			int hole=i;
			while(hole>0 && A[hole-1]>value){
				
				A[hole]=A[hole-1];
				hole=hole-1;
			}
			
			A[hole]=value;
			
			
			
		}
		
		
		
	}
	
	
}
