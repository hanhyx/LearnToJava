package exam_createthread;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {

		/*
		 * ���� ������ ����� ��� 
		 * Runnable beepTask = new BeepTask(); 
		 * Thread thread = new Thread(beepTask); 
		 * thread.start();
		 */
		
		/* �͸� ��ü ���� ������� ������ ȣ����
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
		//*/

		//���ٽ� �̿��ϴ¹�� (java8 �̻�)
		Thread thread = new Thread ( () -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			
			for(int i=0; i<5; i++) {
				toolkit.beep();
				try {Thread.sleep(500);} catch (Exception e) {}
			}

		});
		
		
		
		
		thread.start();

		// "��" ���ڿ��� 5�� ����ϴ� �۾�
		for (int i = 0; i < 5; i++) {

			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}

	}

}
