package crud;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CRUDFiles {
	File f = new File("D:/New folder (3)/NEW FILE.txt");

	public void createFile(PrintWriter out) {
		try {
			if (!f.exists()) {
				f.createNewFile();
				out.print("FILE SUCCESSFULLY CREATED");
			} else
				out.print("ALREADY EXISTS");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String readFile() {
		String content = "";
		try {
			content = Files.readString(Paths.get(f.toURI()));

		} catch (IOException e) {
			e.printStackTrace();
		}
		return content;
	}

	public void updateFile(String s) {
		try {
			FileWriter writeFile = new FileWriter(f);
			writeFile.write(s);
			writeFile.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void deleteFile(PrintWriter out) {
		if (f.delete())
			out.print("SUCCESSFULLY DELETED");
		else
			out.print("FAILED TO DELETE");

	}
}
