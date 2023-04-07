package Test;

import java.util.*;

public class Test85 {
	public static void main(String[] args) {
		String[] participant = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] completion = { "josipa", "filipa", "marina", "nikola" };
		String answer = "";
		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList(participant));
		list.addAll(Arrays.asList(completion));
		Collections.sort(list);

		for (int j = 0; j < list.size(); j = j + 2) {
			if (j + 1 < list.size() && !list.get(j).equals(list.get(j + 1))) {
				answer = list.get(j);
			}
		}
		if(answer.equals("")) {
			answer = list.get(list.size()-1);
		}
		System.out.println(answer);
	}
		
}
