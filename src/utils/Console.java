package utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Console {

	public static Console console;
	
	public static Console instance() {
		if (Console.console == null) {
			Console.console = new Console();
		}
		return Console.console;
	}
	
	private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	public String readString(String line) {
		String input = null;
		this.write(line);
		try {
			input = this.bufferedReader.readLine();
		} catch (Exception ex) {}
		return input;
	}

	public int readInt() {
		int input = 0;
		try {
			input = Integer.parseInt(this.bufferedReader.readLine());
		} catch (Exception ex) {}
		return input;
	}

	public void writeln() {
		System.out.println();
	}

	public void write(String string) {
		System.out.print(string);
	}

	public void writeln(String string) {
		System.out.println(string);
	}

	public void write(int num) {
		System.out.print(num);
	}

	public void writeln(int num) {
		System.out.println(num);
	}
}
