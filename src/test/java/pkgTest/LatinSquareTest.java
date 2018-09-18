package pkgTest;

import pkgGame.LatinSquare;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class LatinSquareTest {

		
	@Test
	public void ContainsZeroTest() {
		int[][] mySquare = {{1,2,3},{2,3,1},{3,1,2}};
		LatinSquare ls = new LatinSquare(mySquare);
		assertEquals(false, ls.ContainsZero());
		mySquare[1][2] = 0;
		assertTrue(ls.ContainsZero());
}
	

	@Test
	public void hasDuplicatesTest1() {
		int [] arr= {1, 2, 3, 4, 5};
		LatinSquare lq=new LatinSquare (null);
		assertFalse(lq.hasDuplicates(arr));
	}
	

	@Test
	public void hasDuplicatesTest2() {
		int [] arr= {1, 2, 3, 1, 5};
		LatinSquare lq=new LatinSquare (null);
		assertTrue(lq.hasDuplicates(arr));
	}
	@Test
	public void hasAllValuesTest2() {
		int [] a = {1, 2, 3, 5};
		int [] b = {2, 3, 4, 1};
		LatinSquare la=new LatinSquare(null);
		assertFalse(la.hasAllValues( a, b));
	}
	@Test
	public void doesElementExistTest() {
		int [] a= {1, 2, 3, 4};
		int num=5;
		LatinSquare ls= new LatinSquare(null);
		assertFalse(ls.doesElementExist(a, num));
	}
	@Test
	public void doesElementExistTest2() {
		int [] a= {1, 2, 3, 4};
		int num=3;
		LatinSquare ls= new LatinSquare(null);
		assertTrue(ls.doesElementExist(a, num));
		assertEquals(true, ls.doesElementExist(a, num));
	}
	
	@Test
	public void GetColumTest() {
		int[][] Square ={{1,2,3},{2,3,1},{3,1,2}};
		int iCol = 1;
		LatinSquare ls = new LatinSquare(Square);
		int [] testArray = {2,3,1};
		assertTrue(Arrays.equals(testArray, ls.getColumn(iCol)));
	}
	
	@Test
	public void GetColumTest2() {
		int[][] Square ={{1,2,3},{2,4,1},{3,1,2}};
		int iCol = 1;
		LatinSquare ls = new LatinSquare(Square);
		int [] testArray = {2,3,1};
		assertTrue(Arrays.equals(testArray, ls.getColumn(iCol)));
	}
	
	@Test
	public void GetRowTest() {
		int[][] Square ={{1,2,3},{2,3,1},{3,1,2}};
		int iCol = 1;
		LatinSquare ls = new LatinSquare(Square);
		int [] testArray = {1,2,3};
		assertTrue(Arrays.equals(testArray, ls.getRow(iCol)));
	}
	
	@Test
	public void GetRowTest2() {
		int[][] Square ={{1,2,3},{2,3,1},{3,1,2}};
		int iCol = 2;
		LatinSquare ls = new LatinSquare(Square);
		int [] testArray = {3,1,2};
		assertTrue(Arrays.equals(testArray, ls.getRow(iCol)));
	}
	
	@Test
	public void GetRowTest3() {
		int[][] Square ={{1,2,3,4},{2,3,4,1},{3,4,1,2},{4,1,2,3}};
		int iCol = 3;
		LatinSquare ls = new LatinSquare(Square);
		int [] testArray = {4,1,2,3};
		assertTrue(Arrays.equals(testArray, ls.getRow(iCol)));
	}
	
	
	
	
	
	
	@Test
	public void getLatinSquareTest1() {
		int [][] square = {{1,2,3}, {2,3,1} , {3,1,2}};
		LatinSquare ls=new LatinSquare (square);
		int [][]tArray = {{1,5,3,}, {2,3,1}, {3,1,2}};
		assertFalse(Arrays.equals(tArray, ls.getLatinSquare()));		
	}

	@Test
	public void isLatinSquareTest1() {
		int [][] LSquare = {{1,2,3}, {2,3,1} , {3,1,2}};
		LatinSquare ls=new LatinSquare (LSquare);
		assertTrue(ls.isLatinSquare());		
	}

		
	@Test
	public void isLatinSquareTest2() {
		int [][] LatSquare = {{ 1, 4, 5}, { 4, 3, 1} , { 3, 1, 4}};
		LatinSquare ls=new LatinSquare (LatSquare);
		assertFalse(ls.isLatinSquare());		
		}
			
			
	@Test
	public void isLatinSquareTest3() {
		int [][] LatSquare = {{ 1, 4, 4}, { 4, 3, 1} , { 3, 1, 4}};
		LatinSquare ls=new LatinSquare (LatSquare);
		assertFalse(ls.isLatinSquare());		
				}
		
	@Test
	public void isLatinSquareTest4() {
		int [][] LatSquare = {{ 1, 4, 3}, { 4, 1, 3} , { 3, 1, 4}};
		LatinSquare ls=new LatinSquare (LatSquare);
		assertFalse(ls.isLatinSquare());		
				}
	
	@Test
	public void isLatinSquareTest5() {
		int [][] LatSquare = {{ 1, 3, 3}, { 4, 1, 3} , { 3, 1, 4}};
		LatinSquare ls=new LatinSquare (LatSquare);
		assertFalse(ls.isLatinSquare());		
				}
	@Test
	public void getSetTest() {
		int [][] mySquare= {{1,2,3,}, {2,3,1,},{3,1,2}};
		LatinSquare ls = new LatinSquare();
		ls.setLatinSquare(mySquare);
		int [][] newSquare= ls.getLatinSquare();
		assertTrue(Arrays.equals(mySquare,  newSquare));
	}
	
	@Test
	public void getSetTest2() {
		int [][] mySquare= {{1,2,3,}, {2,3,1,},{3,1,2}};
		LatinSquare ls = new LatinSquare();
		ls.setLatinSquare(mySquare);
		int [][] newSquare= ls.getLatinSquare();
		//int [][] otherSquare= {{2,3,1}, {3,1,2},{1,2,3}};
		assertTrue(Arrays.equals(mySquare,  newSquare));
	}		


@Test
public void DoesEleentExistTest() {
	int[][] myArray = {{1,2,3},{2,3,1},{3,1,2}};
	LatinSquare ls = new LatinSquare(myArray);
	int[] myIntArray = {1,2,3,4,5};
	int iValue = 4;
	assertTrue(ls.doesElementExist(myIntArray, iValue));
	int iValue2 = 6;
	assertFalse(ls.doesElementExist(myIntArray, iValue2));
}
}


