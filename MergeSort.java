
public class MergeSort {

	
	public static void main(String[] args){
		
		int[] myarray= {2,4,1,6,8,5,3,7};
		
		MergeSortTest(myarray);
		
		for(int i=0; i<myarray.length;i++){
			System.out.print(myarray[i]+" ");
		}
		System.out.print("\n");
	}
	
public static void MergeSortTest(int[] A){
	
	int nA= A.length;
	if(nA<2){
		return;
	}
	else{
		int midA= nA/2;
		int[] leftA= new int[midA];
		int[] rightA= new int[nA-midA];
		
		for(int i=0; i<midA; i++){
			
			leftA[i]=A[i];
		}
		
		for(int j=midA; j<nA; j++){
			rightA[j-midA]=A[j];
		}
		
		
		MergeSortTest(leftA);
		MergeSortTest(rightA);
		MergeArrayList(leftA,rightA, A);
				
		
	}
	
	
	
	
	
}
	
public static void MergeArrayList(int[] left, int[] right, int[] A){
	
	int nL=left.length;
	int nR=right.length;
    int i=0;
    int j=0;
    int k=0;
    
    while(i<nL && j<nR){
    	
    	if(left[i]<right[j]){
    		
    		A[k]=left[i];
    		i++;
    		
    	}else{
    		
    		A[k]=right[j];
    		j++;
    	}
    	
    	k++;
    }
    
    while(i<nL){
    	A[k]=left[i];
    	k++;
    	i++;
    }
    while(j<nR){
    	A[k]=right[j];
    	k++;
    	j++;
    }
	
    
    
	
}

	
	
	
}
