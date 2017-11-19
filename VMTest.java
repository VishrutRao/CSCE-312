import java.io.*;

public class VMTest {
	private static LineParser lp;
	private static VMStack vstk;
	
	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream("StackTest.vm"); 
			lp = new LineParser(file);
			vstk = new VMStack();
			
			PrintWriter pw = new PrintWriter("output.txt");
			
			while (true) {
				String[] ss = lp.parseNext();
				if (ss[0] == "EOF") {
					break;
				}
				String inst = vstk.handleInst(ss);
				System.out.print(inst);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}