package com.collection.streamapi;

import java.util.stream.Stream;

public class StreamToArray {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("c", "b", "a");
        String[] stringArray = stream.toArray(c -> new String[c]);
		System.out.println(stringArray[3]);
	}

}
