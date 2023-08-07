package Week7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Assignment5 {
	public static void main(String[] args) {
		try {
			InputStreamReader sc = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(sc);
			String na = br.readLine();
			int a = Integer.parseInt(na);
			System.out.println(a * a);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
