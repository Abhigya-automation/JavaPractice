package lambdaexpression;

public class ThreadDemoUsingLambda {

	public static void main(String[] args) {

		Runnable r = () -> {

			for (int i = 1; i <= 10; i++) {
				System.out.println("Child Thread");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Thread t = new Thread(r);
		t.start();
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("main thread");
		}

	}

}
