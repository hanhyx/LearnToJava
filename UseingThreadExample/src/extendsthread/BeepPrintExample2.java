package extendsthread;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		
		//방법1 부모클래스 타입
		/*
		Thread thread = new BeepThread();
		thread.start();
		*/
		
		//방법2 익명객체 생성방법
		Thread thread = new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try {Thread.sleep(500);} catch (Exception e) {}
				}

			}
		};
		
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
