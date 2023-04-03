package Test;

public class Test34 {
	public static void main(String[] args) {
		int[] array = {7, 77, 17};
        int answer = 0;
        String[] arr1 = new String[array.length];
        for(int i = 0; i < array.length; i++) {
        	String[] arr2 = new String[arr1.length];
        	arr1[i] = String.valueOf(array[i]);
            arr2 = arr1[i].split("");
            for(int j = 0; j<arr2.length; j++) {
                if(arr2[j].matches("7")) {
                    answer++;
                }
            }
        }
	}
}
