public class MultiThreadTestJoin {
	public static void main(String[] args) throws InterruptedException {
		var a = new Thread(() -> multiPrint("A"));
		var b = new Thread(() -> multiPrint("B"));
		System.out.println("Threads start");
		a.start();
		b.start();
		a.join(); //wartet hier bis Thread a fertig ist
		b.join(); //wartet hier bis Thread b fertig ist
		System.out.println("Threads joined");
	}

	static void multiPrint(String label) {
		for (int i = 0; i < 10; i++) {
			System.out.println(label + ": " + i);
		}
	}
}
