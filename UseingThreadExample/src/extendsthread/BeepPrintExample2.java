package extendsthread;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		
		//���1 �θ�Ŭ���� Ÿ��
		/*
		Thread thread = new BeepThread();
		thread.start();
		*/
		
		//���2 �͸�ü �������
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
