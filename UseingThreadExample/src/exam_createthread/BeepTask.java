package exam_createthread;

import java.awt.Toolkit;

public class BeepTask implements Runnable{

	@Override
	public void run() {
		
		//beep���� 5�� �ݺ��ؼ� �Ҹ����� �ϴ� �۾�
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {Thread.sleep(500);} catch (Exception e) {}
		}

		
	}

}
