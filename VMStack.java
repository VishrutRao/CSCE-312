import java.util.Stack;
import java.util.ArrayList;
import java.io.*;

public class VMStack {
	static int next;
	
	public VMStack() {
		next = 0;
	}
	
	private int nextLabel() {
		return next++;
	}
	
	public String handleInst(String[] line) {
		if (line[0].equals("push")) {
			if (line[1].equals("constant")) {
				return "@" + line[2] + "\n" +
					   "D = A\n" +
					   "@SP\n" +
					   "A = M\n" +
					   "M = D\n" +
					   "@SP\n" +
					   "M = M+1\n";
			}
			else if (line[1].equals("local")) {
				return "@LCL\n" +
					   "D = M\n" +
					   "@" + line[2] + "\n" +
					   "A = D+A\n" +
					   "D = M\n" +
					   "@SP\n" +
					   "A = M\n" +
					   "M = D\n" +
					   "@SP\n" +
					   "M = M+1\n";
			}
			else if (line[1].equals("argument")) {
				return "@ARG\n" +
					   "D = M\n" +
					   "@" + line[2] + "\n" +
					   "A = D+A\n" +
					   "D = M\n" +
					   "@SP\n" +
					   "A = M\n" +
					   "M = D\n" +
					   "@SP\n" +
					   "M = M+1\n";
			}
			else if (line[1].equals("this")) {
				return "@THIS\n" +
					   "D = M\n" +
					   "@" + line[2] + "\n" +
					   "A = D+A\n" +
					   "D = M\n" +
					   "@SP\n" +
					   "A = M\n" +
					   "M = D\n" +
					   "@SP\n" +
					   "M = M+1\n";
			}
			else if (line[1].equals("that")) {
				return "@THAT\n" +
					   "D = M\n" +
					   "@" + line[2] + "\n" +
					   "A = D+A\n" +
					   "D = M\n" +
					   "@SP\n" +
					   "A = M\n" +
					   "M = D\n" +
					   "@SP\n" +
					   "M = M+1\n";
			}
			else if (line[1].equals("pointer")) {
				return "@POINTER\n" +
					   "D = M\n" +
					   "@" + line[2] + "\n" +
					   "A = D+A\n" +
					   "D = M\n" +
					   "@SP\n" +
					   "A = M\n" +
					   "M = D\n" +
					   "@SP\n" +
					   "M = M+1\n";
			}
			else if (line[1].equals("static")) {
				return "@STATIC\n" +
					   "D = M\n" +
					   "@" + line[2] + "\n" +
					   "A = D+A\n" +
					   "D = M\n" +
					   "@SP\n" +
					   "A = M\n" +
					   "M = D\n" +
					   "@SP\n" +
					   "M = M+1\n";
			}
			else if (line[1].equals("this")) {
				return "@THIS\n" +
					   "D = M\n" +
					   "@" + line[2] + "\n" +
					   "A = D+A\n" +
					   "D = M\n" +
					   "@SP\n" +
					   "A = M\n" +
					   "M = D\n" +
					   "@SP\n" +
					   "M = M+1\n";
			}
			else if (line[1].equals("temp")) {
				return "@R5\n" +
					   "D = A\n" +
					   "@" + line[2] + "\n" +
					   "A = D+A\n" +
					   "D = M\n" +
					   "@SP\n" +
					   "A = M\n" +
					   "M = D\n" +
					   "@SP\n" +
					   "M = M+1\n";
			}
			return "error";
		}
		else if (line[0].equals("add")) {
			return "@SP\n" +
				   "AM = M-1\n" +
				   "D = M\n" +
				   "A = A-1\n" +
				   "M = D+M\n";
		}
		else if (line[0].equals("sub")) {
			return "@SP\n" +
				   "AM = M-1\n" +
				   "D = M\n" +
				   "A = A-1\n" +
				   "M = M-D\n";
		}
		else if (line[0].equals("neg")) {
			return "@SP\n" +
				   "A = M-1\n" +
				   "M = !M\n";
		}
		else if (line[0].equals("and")) {
			return "@SP\n" +
				   "AM = M-1\n" +
				   "D = M\n" +
				   "A = A-1\n" +
				   "M = D&M\n";
		}
		else if (line[0].equals("or")) {
			return "@SP\n" +
				   "AM = M-1\n" +
				   "D = M\n" +
				   "A = A-1\n" +
				   "M = D|M\n";
		}
		else if (line[0].equals("not")) {
			return "@SP\n" +
				   "A = M-1\n" +
				   "M = !M\n";
		}
		else if (line[0].equals("eq")) {
			int n = nextLabel();
			return "@SP\n" +
				   "AM = M-1\n" +
				   "D = M\n" +
				   "A = A-1\n" +
				   "D = D-M\n" +
				   "@EQ." + n + "\n" +
				   "D;JEQ\n" +
				   "@NEQ." + n + "\n" +
				   "0;JMP\n" +
				   "(EQ." + n + ")\n" +
				   "@SP\n" +
				   "A = A-1\n" +
				   "M = 1\n" +
				   "(NEQ." + n + ")\n" +
				   "@SP\n" +
				   "A = A-1\n" +
				   "M = 0\n";
		}
		else if (line[0].equals("lt")) {
			int n = nextLabel();
			return "@SP\n" +
				   "AM = M-1\n" +
				   "D = M\n" +
				   "A = A-1\n" +
				   "D = M-D\n" +
				   "@LT." + n + "\n" +
				   "D;JLT\n" +
				   "@NLT." + n + "\n" +
				   "0;JMP\n" +
				   "(LT." + n + ")\n" +
				   "@SP\n" +
				   "A = A-1\n" +
				   "M = 1\n" +
				   "(NLT." + n + ")\n" +
				   "@SP\n" +
				   "A = A-1\n" +
				   "M = 0\n";
		}
		else if (line[0].equals("gt")) {
			int n = nextLabel();
			return "@SP\n" +
				   "AM = M-1\n" +
				   "D = M\n" +
				   "A = A-1\n" +
				   "D = M-D\n" +
				   "@GT." + n + "\n" +
				   "D;JGT\n" +
				   "@NGT." + n + "\n" +
				   "0;JMP\n" +
				   "(GT." + n + ")\n" +
				   "@SP\n" +
				   "A = A-1\n" +
				   "M = 1\n" +
				   "(NGT." + n + ")\n" +
				   "@SP\n" +
				   "A = A-1\n" +
				   "M = 0\n";
		}
		return "error";
	}
}