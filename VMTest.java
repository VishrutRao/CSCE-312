import java.io.*;

public class VMTest {
	private static LineParser lp;
	private static VMStack vstk;
	
	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream("StackTest.vm"); 
			lp = new LineParser(file);
			vstk = new VMStack();
			
			
			while (true) {
				String[] ss = lp.parseNext();
				if (ss[0] == "EOF") {
					break;
				}
				vstk.handleInst(ss);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}