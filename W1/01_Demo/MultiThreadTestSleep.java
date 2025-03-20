public class MultiThreadTestSleep {
	public static void main(String[] args) {
		var a = new Thread(() -> multiPrint("A"));
		var b = new Thread(() -> multiPrint("B"));
		a.start();
		b.start();
		System.out.println("main finished");
	}

	static void multiPrint(String label) {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(label + ": " + i);
				Thread.sleep((int) Math.random() * 100);
			}
		} catch (InterruptedException e) {
			throw new AssertionError(e);
		}
	}
}
