import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BringHimHome {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String input = br.readLine().toString();
			char c = 0;
			for (int i = 0; i < input.length(); i += 2) {
				String sub = input.substring(i, i + 2);//48
				c = (char) Integer.parseInt(sub, 16);//
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
