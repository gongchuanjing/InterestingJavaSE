package tk.chuanjing.stage1.chapter03;

public class TestSwitch {

	public static void main(String[] args) {
		testSwitch(0);
	}

	private static void testSwitch(int key) {
		int a = 0;
		switch (key) {
		default:
			a++;
			
		case 1:
			a++;
			
		case 2:
			a++;
		}
		
		System.out.println("a = " + a);
	}
}