import java.io.*;
import java.util.*;


public class grt {

	public static Scanner read = new Scanner(System.in);

	void solve() {

	}

	public static void main(String[] args) {

		if (System.getProperty("ONLINE_JUDGE") == null) {
			try {
				System.setOut(new PrintStream(
				                  new FileOutputStream("output1.txt")));

				read = new Scanner(new File("input1.txt"));
			}

			catch (Exception e) {
			}
		}

		long t;
		grt g = new grt();

		t = read.nextLong();
		while (t-- > 0) {
			g.solve();
		}
		read.close();
	}


}
