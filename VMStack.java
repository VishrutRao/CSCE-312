import java.util.Stack;
import java.util.ArrayList;
import java.io.*;

public class VMStack {
	
	Stack<Number> stk;
	OutputStream out;
	
	public VMStack() {
		stk = new Stack<Number>();
		out = null;
	}
	
	public VMStack(FileOutputStream o) {
		stk = new Stack<Number>();
		out = o;
	}
	
	public void handleLine(ArrayList<String> line) {
		// handle instructions from string by hashing
	}
	
	public static void main(String[] args) {
		
	}
}