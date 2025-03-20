public class MultiThreadTest {
	public static void main(String[] args) {
		var a = new Thread(() -> multiPrint("A"));
		var b = new Thread(() -> multiPrint("B"));
		a.start();
		b.start();
		System.out.println("main finished");
	}

	static void multiPrint(String label) {
		for (int i = 0; i < 10; i++) {
			System.out.println(label + ": " + i);
		}
	}
}
