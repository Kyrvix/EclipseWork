package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Collection {

	public void createArrayList() {
		List<Integer> numArrayList = new ArrayList<Integer>();
		for (int i = 100; i < 1000; i++) {
			numArrayList.add(i);
		}
		numArrayList = numArrayList.stream().map(x -> x * 10).collect(Collectors.toList());
		System.out.println(numArrayList);
	}
}