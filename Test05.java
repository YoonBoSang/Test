package Test;

public class Test05 {
	public static void main(String[] args) {
		String grade = "B";
		
		int score1 = switch (grade) {
			case "A" -> 100;
			case "B" -> 80;
			default -> 60;
		};
	}
}
