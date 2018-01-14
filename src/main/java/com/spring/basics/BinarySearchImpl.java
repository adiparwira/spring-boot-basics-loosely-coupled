package com.spring.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired
	private SortAlgorithmn sortAlgorithmn;

	public BinarySearchImpl(SortAlgorithmn sortAlgorithmn) {
		super();
		this.sortAlgorithmn = sortAlgorithmn;
	}
	
	/*public void setSortAlgorithmn(SortAlgorithmn sortAlgorithmn) {
		this.sortAlgorithmn = sortAlgorithmn;
	}*/

	
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		int[] sortedNumbers = sortAlgorithmn.sort(numbers);
		System.out.println(sortAlgorithmn);		
		return 3;
	}

	
}
