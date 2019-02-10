import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String str[] = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = input.next();
		}
		input.close();
		for (String s : str) {
			int ok = 0;
			int result = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == 'O') {
					ok++;
					result += ok;
				} else {
					ok = 0;
				}
			}
			System.out.println(result);
		}

	}
}
