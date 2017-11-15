import java.util.ArrayList;
import java.io.*;

public class LineParser {
	
	InputStream file;
	
	public LineParser() {
		file = null;
	}
	
	public LineParser(FileInputStream in) {
		file = in;
	}
	
	public ArrayList<String> parseNext() {
		ArrayList<String> inst = new ArrayList<String>();
		
		// parse next line of file
		// store it as tokens in inst
		
		return inst;
	}
}