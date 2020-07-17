package exam_createthread;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {

		/*
		 * 정석 쓰레드 만들기 방법 Runnable beepTask = new BeepTask(); Thread thread = new
		 * Thread(beepTask); thread.start();
		 */

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {

				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (Exception e) {
					}
				}
			}
		});
		thread.start();

		// "띵" 문자열을 5번 출력하는 작업
		for (int i = 0; i < 5; i++) {

			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}

	}

}
