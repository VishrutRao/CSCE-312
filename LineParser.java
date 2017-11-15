import java.util.ArrayList;
import java.io.*;

public class LineParser {
	
	BufferedReader reader;
	
	public LineParser() {
		reader = null;
	}
	
	public LineParser(FileInputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
	}
	
	public String[] parseNext() throws IOException {
		String line = reader.readLine();
		if (line == null) { 
			return new String[] { "EOF" };
		}
		
		line = line.trim();
		while (line.length() == 0 || (line.charAt(0) == '/' && line.charAt(1) == '/')) {
			line = reader.readLine().trim();
		}
		
		String[] inst = line.split(" ");
		return inst;
	}
}