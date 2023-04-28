package Test;

import java.util.*;

public class Test107 {
	public static void main(String[] args) {
		int cacheSize = 3;
		String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        int answer = 0;
        List<String> list = new ArrayList<>();
        for(int i = 0; i < cities.length; i++) {
            if(list.size() >= cacheSize && list.contains(cities[i])) {
            	list.
                list.add(0, cities[i]);
            }
            list.add(cities[i]);
        }
	}
}
