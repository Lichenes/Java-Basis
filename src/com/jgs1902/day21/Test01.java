package com.jgs1902.day21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test01 {
	public static void main(String[] args) {
		Map<Character, List<Team>> map = new HashMap<>();
		char id='A';
		for (int i = 0; i < 8; i++) {
			List<Team> listi = new ArrayList<Team>();
			listi.add(new Team("球员1"));
			listi.add(new Team("球员2"));
			listi.add(new Team("球员3"));
			listi.add(new Team("球员4"));
			map.put(id,listi);
			id += 1;
		}
		Set<Entry<Character, List<Team>>> entrys = map.entrySet();
		for (Entry<Character, List<Team>> entry : entrys) {
			Character key = entry.getKey();
			List<Team> value = entry.getValue();
			System.out.println(key+"<->"+value);
		}
	}
}
