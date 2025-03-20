package Task1;

import java.io.Console;

public class ConsoleTicker {
	private static void periodTicker(char sign, int intervallMillis) throws InterruptedException {
		while (true) {
			System.out.print(sign);
			Thread.sleep(intervallMillis);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		var a = new Thread(() -> {
			try {
				periodTicker('.', 10);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		});

		var b = new Thread(() -> {
			try {
				periodTicker('A', 50);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		});

		var c = new Thread(() -> {
			try {
				periodTicker('N', 100);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		});
		a.start();
		b.start();
		c.start();
		System.out.println("main finished");
		// TODO: Concurrent periodTicker('*', 20);
	}
}
