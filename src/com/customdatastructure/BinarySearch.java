package com.customdatastructure;

import java.util.Arrays;

public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6,7};
		System.out.println(binarySearch(a,0,a.length,5));
		System.out.println(binarySearchDivideAndConcuer(a,5));
	}
	// recuresiev O(log(n))
	private static int binarySearch(int[]  inputArray,int start,int end,int searchElement){
		int mid = start+((end-start)/2);
		if(searchElement==inputArray[mid])
			return mid;
		else if (searchElement<inputArray[mid]){
			return binarySearch(inputArray, start,mid, searchElement);
		}else{
			return binarySearch(inputArray,mid+1, end, searchElement);
		}
		
		
	}
	private static int binarySearchDivideAndConcuer(int[]  inputArray,int searchElement){
		int start =0;
		int end=inputArray.length-1;
		
		while(start<=end){
			int mid =(start+end)/2;
			if(searchElement==inputArray[mid])
				return mid;
			else if(searchElement<inputArray[mid]){
				end =mid-1;
			}else{
				start=mid+1;
			}
		}
		return -1;
		
		
	}
}
