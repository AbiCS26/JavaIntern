package readcalculator;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileReaderCal {

	public static void main(String args[]) {
		FileReaderCal f = new FileReaderCal();
		System.out.println(f.readFile());
	}

	public ArrayList<String> readFile() {
		ArrayList<String> al = new ArrayList<>();
		String s = "";
		File dir = new File("E:/New folder (3)");
		File[] files = dir.listFiles();
		for (File file : files) {
			if (file.isFile()) {
				try {
					s = Files.readString(Paths.get(file.toURI()));
				} catch (IOException e) {
					System.out.println("File not Found");
				}
				al.add(s);
			}
		}
		return al;
	}
}
