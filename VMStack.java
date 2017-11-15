import java.util.Stack;
import java.util.ArrayList;
import java.io.*;

public class VMStack {
	
	Stack<Double> stk;
	
	OutputStream out;
	
	public VMStack() {
		stk = new Stack<Double>();
		out = null;
	}
	
	public VMStack(FileOutputStream o) {
		stk = new Stack<Double>();
		out = o;
	}
	
	public void handleInst(String[] line) {
		if (line[0].equals("push")) {
			stk.push(Double.valueOf(line[2]));
		}
		else if (line[0].equals("add")) {
			stk.push(stk.pop() + stk.pop());
			System.out.println(stk.peek());
		}
		else if (line[0].equals("sub")) {
			stk.push(stk.pop() - stk.pop());
			System.out.println(stk.peek());
		}
		else if (line[0].equals("neg")) {
			stk.push(Double.valueOf(-1*stk.pop()));
			System.out.println(stk.peek());
		}
		else if (line[0].equals("and")) {
			Number res = stk.pop() + stk.pop();
			if (res.equals(2.0)) {
				stk.push(1.0);
			} else {
				stk.push(0.0);
			}
			System.out.println(stk.peek());
		}
		else if (line[0].equals("or")) {
			Number res = stk.pop() + stk.pop();
			if (res.equals(1.0) || res.equals(2.0)) {
				stk.push(1.0);
			} else {
				stk.push(0.0);
			}
			System.out.println(stk.peek());
		}
		else if (line[0].equals("not")) {
			Number res = stk.pop();
			if (res.equals(0.0)) {
				stk.push(1.0);
			} else {
				stk.push(0.0);
			}
			System.out.println(stk.peek());
		}
		else if (line[0].equals("eq")) {
			Boolean res = stk.pop().equals(stk.pop());
			if (res) {
				stk.push(1.0);
			} else {
				stk.push(0.0);
			}
			System.out.println(stk.peek());
		}
		else if (line[0].equals("lt")) {
			Boolean res = stk.pop() < stk.pop();
			if (res) {
				stk.push(1.0);
			} else {
				stk.push(0.0);
			}
			System.out.println(stk.peek());
		}
		else if (line[0].equals("gt")) {
			Boolean res = stk.pop() > stk.pop();
			if (res) {
				stk.push(1.0);
			} else {
				stk.push(0.0);
			}
			System.out.println(stk.peek());
		}
	}
}