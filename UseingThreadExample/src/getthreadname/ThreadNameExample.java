package getthreadname;

public class ThreadNameExample {
	
	public static void main(String[] args) {
		
		Thread thread = Thread.currentThread();
		thread.getName();
		System.out.println("���α׷� ���� ������ �̸� : " + thread.getName());
		
		Thread threadA = new ThreadA();
		System.out.println("�۾� ������ �̸� : " + threadA.getName());		
		threadA.start();
		
		Thread threadB = new ThreadB();
		System.out.println("ThreadB�� ������ ������ : " + Thread.currentThread().getName());		
		threadB.start();
		
		
	}
	
	

}
