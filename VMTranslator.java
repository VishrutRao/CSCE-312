import java.io.*;
import java.util.*;

public class VMTranslator {
	private static LineParser lp;
	private static VMStack vstk;
	
	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream(args[0]); 
			lp = new LineParser(file);
			vstk = new VMStack(args[0].substring(0, args[0].length() - 3));
			
			BufferedWriter out = new BufferedWriter(new FileWriter(args[0].substring(0, args[0].length() - 3) + ".asm"));
			
			while (true) {
				String[] ss = lp.parseNext();
				if (ss[0] == "EOF") {
					break;
				}
				String inst = vstk.handleInst(ss);
				out.write(inst);
			}
			out.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}