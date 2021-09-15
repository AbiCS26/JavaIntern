package demo;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {

		File f = new File("E:\\New folder (3)\\new.txt");
		try {
			f.createNewFile();
			FileWriter fwrite = new FileWriter("E:\\New folder (3)\\new.txt");
			fwrite.write("Hello");
			fwrite.close();
			Scanner fread = new Scanner(f);
			String fileData = fread.nextLine();
			System.out.println(fileData);
			fread.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (f.exists()) {
			System.out.println(f.getName());

			System.out.println(f.getAbsolutePath());

			System.out.println(f.canWrite());

			System.out.println(f.canRead());

			System.out.println(f.length());
		} else
			System.out.println("The file does not exist.");

	}
}
