import java.util.Arrays;


public class TestClass {


	public int[] isempty(int[] isnumsetempty) {
		
		return isnumsetempty;
	}
	
	
	 public int[] unique(int[] numset) {
		
		int i,j; 
		for ( i=0;i<numset.length;i++) {

			for( j=0;j<i;j++) 
				if(numset[i]==numset[j])
					break; 
			if(i==j)
				System.out.print(numset[i]+ " ");
				
		}
		return numset;
	}
	 
	
	public boolean compare(int[] numsetA, int[] numsetB) {
		Arrays.sort(numsetA);
		Arrays.sort(numsetB);
		if(Arrays.equals(numsetA, numsetB)) {
			return true ;
		}else {

			return false;
		}

	}
	
	public boolean issetSubset(int numsetA[],int numsetB[], int m ,int n) {
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
				if(numsetB[i]==numsetA[j])
					break;
			if(j==m)
				return false;
		}
		return true;
	}


	public boolean deleteSet(int[] numsetA) {
		
		String originalArrayLength=Arrays.toString(numsetA);
		
		int removeindex=3;
		
		for(int i=removeindex;i<numsetA.length-1;i++) {
			numsetA[i]=numsetA[i+1];
		}
		String afterRemoveArrayLenght=Arrays.toString(numsetA);
		
		if(originalArrayLength.equals(afterRemoveArrayLenght)) {
			return true ;
		}else {
			return false;
		}

	}
	
	
	@SuppressWarnings("unused")
	public boolean findSet(int[] numsetB) {
		boolean found=false;
		int findElements=8;
		
		for(int i=0; i < numsetB.length ; i++) {
			if(numsetB[i]==findElements) {
				found=true;
				break;
			}
		}
		return found;
		
	}
	
}
