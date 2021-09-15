import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {
	File f = new File("E:\\New folder (3)\\new1.txt");

	public void createFile() {

		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void writeFile(String x) {
		try {
			FileWriter writeFile = new FileWriter(f);
			writeFile.write(x);
			writeFile.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readFile() {
		Scanner read;
		try {
			read = new Scanner(f);
			while (read.hasNextLine()) {
				String data = read.nextLine();
				System.out.println(data);
			}
			read.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
