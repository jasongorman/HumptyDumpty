package com.codemanship.humptydumpty;

import static com.codemanship.humptydumpty.All.all;
import static com.codemanship.humptydumpty.Put.put;
import static com.codemanship.humptydumpty.Together.couldnt;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class HumptyDumptyTest {

	private final Humpty humpty = new Humpty();
	private static final String on = "on";
	private final String a = "a";
	private final String wall = "wall";
	private static final String great = "great";
	private static final String fall = "fall";
	private static final String again = "again";
	private final The the = new The();
	private final List<? extends Asset> horses = new ArrayList<Horse>();
	private final List<? extends Asset> men = new ArrayList<Man>();

	@Test
	public void rhyme() {
		humpty.dumpty.sat(on, a, wall);
		humpty.dumpty.had(a, great, fall);
		all(the.kings(horses)).and(all(the.kings(men)));
		couldnt(put(humpty).together(again));
	}

}
