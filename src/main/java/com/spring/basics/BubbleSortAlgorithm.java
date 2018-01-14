package com.spring.basics;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgorithm implements SortAlgorithmn {
	public int[] sort(int[] numbers){
		//logic for bubble sort here
		return numbers;
	}
}
