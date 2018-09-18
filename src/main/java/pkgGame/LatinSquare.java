package pkgGame;

import java.util.Arrays;

public class LatinSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private int[][] LatinSquare;
	
	public LatinSquare() {
	}
	
	public LatinSquare(int [][] puzzle) {
		LatinSquare=puzzle;
	}
	
	public boolean ContainsZero() {
		for(int y=0; y<3; y++) {
			for(int x=0; x<3; x++) {
				if (LatinSquare [y][x] == 0) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean doesElementExist(int[] arr, int iValue) {
		for(int x=0; x<3; x++) {
			if (arr[x] ==iValue){
				return true;
			}
		}
		
		return false; 
	}
	public int[] getColumn(int iCol) {
		int[] aCol = new int[this.LatinSquare.length];
		for(int y=0; y<LatinSquare.length; y++) {
			aCol[y] = LatinSquare[y][iCol];
	
		}
		return aCol;
				
	}
	public int [][] getLatinSquare(){
		return LatinSquare;
	}
	
	public int [] getRow(int iRow) {
		return LatinSquare[iRow];
			}
	
	public boolean hasAllValues(int[] arr1, int[] arr2) {
		boolean found = false;
		for(int i=0; i<arr2.length; i++) {
			found = false;
			for(int j=0; j<arr1.length; j++) {
				if (arr1[j]==arr2[i]) {
					found = true;
					
					break;
				}
			}
		}
		
		return found;
	}
	
	public boolean hasDuplicates(int[] arr) {
		boolean hasDuplicates=false;
		Arrays.sort(arr);
		for (int i=0; i<arr.length -1; i++)
		{
			if (arr[i]==arr[i+1])
			{
				hasDuplicates = true;
				break;
			}
	}
	return hasDuplicates;
}
 
	public boolean isLatinSquare () {
		for (int i=0; i<  LatinSquare.length; i++) {
			if (hasDuplicates (getRow(i))) {
				return false;
			}
		}
		
		for (int j=0; j< LatinSquare.length; j++) {
			if (hasDuplicates (getColumn(j))) {
				return false;
			}
			
		}
			
		for (int i=1; i< LatinSquare.length; i++) {
			if (hasAllValues (getRow (0), getRow(i))); {
				return false;
			}
		}
		
	return isLatinSquare();
	}
	
	public void setLatinSquare (int[][] latinSquare) {
		this.LatinSquare = latinSquare;
	}
	
}


