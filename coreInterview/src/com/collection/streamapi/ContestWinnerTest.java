
package com.collection.streamapi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ContestWinnerTest {

	public static void main(String[] args) {

		List<ContestWinner> l = new ArrayList<ContestWinner>();

		l.add(new ContestWinner("tt", "7686979685"));
		l.add(new ContestWinner("eeee", "4444444444"));
		l.add(new ContestWinner("yyyy", "8475984657"));
		l.add(new ContestWinner("aaaaa", "8576094657"));
		l.stream().map(e -> (e.getName() + " " + e.getPhoneNo())).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), c -> {
					Collections.shuffle(c);
					return c.stream();
				})).limit(2).forEach(c -> System.out.println(c));

	}

}
