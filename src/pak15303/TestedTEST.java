package pak15303;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestedTEST {
    	Tested15303 t = new Tested15303();
	int[] TESTArray = {5,3,1000,1000,452,86,45,};
	int[] TESTArrayZeros = {0,0,0,0,0,0,0,0};
	int[] TESTArrayNeg = {-9,-0,-8,4};
	
	//regular array with two identical numbers sum
	@Test
	 void returnSumI2() {
		assertEquals(t.returnSum(TESTArray), (5+3+1000+1000+452+86+45));
	}
	
	//array of zeros sum
	@Test
	void returnSumZeros() {
		assertEquals(t.returnSum(TESTArrayZeros), 0);
	}
	
	//array with negatives including negative 0 and a positive integer sum
	@Test
	void returnSumNegative() {
		assertEquals(t.returnSum(TESTArrayNeg), ((-9)+(-0)+(-8)+(4)));
	}
	
	//Regular array max with two identical numbers, each not at end of array
	@Test
    	void returnMaxIdentical() {
		assertEquals(t.returnMax(TESTArray), 1000);
	}
	
	// max of array with zeros
	@Test
	void returnMaxZeros() {
		assertEquals(t.returnMax(TESTArrayZeros), 0);
	}
	
	//as above with negatives and a positive
	@Test
	void returnMaxNeg() {
		assertEquals(t.returnMax(TESTArrayNeg), 4);
	}
	
	//minimum of array 
	@Test
	void returnMin() {
		assertEquals(t.returnMin(TESTArray),3);
	}
	
	//same with zeros
	@Test
	void returnMinZeros() {
		assertEquals(t.returnMin(TESTArrayZeros),0);
	}
	
	//same with negatives and positive
	@Test
	void returnMinNeg() {
		assertEquals(t.returnMin(TESTArrayNeg),-9);
	}
	
	//range of array with the highest appearing twice
	@Test
	void returnRangeH2() {
	    assertEquals(t.returnRange(TESTArray),(1000-3+1));
	}
	
	//range of zeros
	@Test
	void returnRangeZeros() {
		assertEquals(t.returnRange(TESTArrayZeros),1);
	}
	
	//range of negatives and a positive
	@Test
	void returnRange() {
		assertEquals(t.returnRange(TESTArrayNeg),(4-(-9)+1));
	}
}
