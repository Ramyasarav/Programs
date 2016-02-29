package com.main.arrays;

public class MissingNumberArray {
	
int a[] = {1,2,3,4,5,7,8,9};

public int missingNumber(){
	for (int i = 0; i < a.length; i++) {
		if(a[i] != (i + 1)){
			return i+1;
		}
	}
	
	return -1;
}
}
