import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SetTest {

	int[] isnumsetempty;
	int[] numset= new int[] {1,2,3,5,6,2,3,5,4,1,2,3,4,5,8,7,2,-1,-2,-1,4,100};
	int[] numsetA= new int[] {-4, 6, 7, 8, 9} ;
	int[] numsetB= new int[] {8,6,7,-4,9};




	@Test 
	public void checkEmptySet() throws Exception { 

		assertNotNull(new TestClass().isempty(numset));

	}

	@Test
	public void checkUniqueSet() throws Exception {
		int[] expectedArray=new int[] {1,2,3,5,6,4,8,7,-1,-2,100,-1};


		assertArrayEquals(expectedArray,new TestClass().unique(numset));

	}


	@Test
	public void checkCompareSet() throws Exception {
		Assert.assertEquals(true, new TestClass().compare(numsetA, numsetB));
	}

	@Test
	public void setSubset() throws Exception{
		boolean result=new TestClass().issetSubset(numsetA, numsetB,numsetA.length, numsetB.length);
		Assert.assertEquals(true, result);

	}
}
