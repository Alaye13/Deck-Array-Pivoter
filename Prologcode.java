package prologcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Survey 3 
 * @author ifennaekwenem 
 *
 */

public class Prologcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] initial , end;

        initial = new int[]{11,12,13,14,15,16,17};
        end = new int[]{15,16,17,14,11,12,13};
        System.out.println("Check to see both values resulting to: " + arrayReverse(initial, end));
	}
	static int arrayalpha[];
	static int arraybet[];

	/**
	 * This splits the array into two types 
	 * @param array1
	 * @param array2
	 * @return
	 */
	public static boolean arrayReverse(int arrayone[], int arraytwo[]) {
		int index1 = 0;
		int index2 = arraytwo.length / 2 + arrayone.length % 2;
		for (int i = 0; i < arrayone.length/2; i++) {
			if(arrayone[index1] != arraytwo[index2]) {
				return false;
			}
			index1++;
			index2++;
		}
		return true;

	}

	/**
	 * THis method swaps the code 
	 * @param arrayfinal
	 * @return
	 */
	public static int[] arrayMethod(int arrayfinal[]){

	int arraytemp[] = new int[arrayfinal.length];
	int index1 = 0;
	int index2 = arrayfinal.length / 2 + arrayfinal.length % 2;
	for (int i = 0; i < arrayfinal.length/2; i++) {
		arraytemp[index1] = arrayfinal[index2];
			index1++;
			index2++;
		}
		
	 index2 = 0;
	 index1 = arrayfinal.length / 2 + arrayfinal.length % 2;
	for (int i = 0; i < arrayfinal.length/2; i++) {
		arraytemp[index2] = arrayfinal[index1];
			index1++;
			index2++;
		}
	
		return arrayfinal;

	}
}
