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
		return null;
		
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


	
}
