import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class SetTest {

	int[] isnumsetempty;
	int[] numset= new int[] {1,2,3,5,6,2,3,5,4,1,2,3,4,5,8,7,2,-1,-2,-1,4,100};
	int[] numsetA= new int[] {-4, 6, 7, 8, 9} ;
	int[] numsetB= new int[] {8,6,7,-4,9};




	@Test 
	public void isEmpty() { 
		// assertNotNull(isnumsetempty);
		assertNotNull(numset); 
	}


	@Test 
	public void isSetUnique() { 
		int j; 
		for (int i=0;i<numset.length;i++) {

			for( j=0;j<i;j++) 
				if(numset[i]==numset[j])
					break; 
			if(i==j)
				
				System.out.print(numset[i]+ " "); 
		}
	}


	@Test 
	public void isSetCompare() {

		Arrays.sort(numsetA);
		Arrays.sort(numsetB);
		if(Arrays.equals(numsetA, numsetB)) {

			System.out.println("Strings are same");
		}else {

			System.out.println("Strings are not same");
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

	@Test
	public void setSubset() {
		if(issetSubset(numsetA, numsetB, numsetA.length, numsetB.length))
			System.out.println("Numset B is subset of Num Set A");
		else
			System.out.println("Numset B is not subset of Num Set A");
	}
	
}
