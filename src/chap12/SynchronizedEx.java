package chap12;

public class SynchronizedEx {
	public static void main(String[] args) {
		SharedPrinter p = new SharedPrinter(); // ���� ������ ����
		String[] engText = { "Wise men say, ",
							 "Only fools rush in",
							 "But I can't help, ",
							 "falling in love with you",
							 "Shall I stay? ",
							 "Would it be a sin?",
							 "If I can't help, ",
							 "falling in love with you" };
		String[] korText = { "���ع��� ��λ��� ������ �⵵��, ",
				 "�ϴ����� �����ϻ� �츮 ���� ����",
				 "����ȭ ��õ�� ȭ������, ",
				 "���� ��� �������� ���� �����ϼ�",
				 "���� ���� �� �ҳ���, ö���� �θ� ��",
				 "�ٶ����� �Һ����� �츮 ����ϼ�.",
				 "����ȭ ��õ�� ȭ������, ",
				 "���� ��� �������� ���� �����ϼ�" };
		
		// ������ ������ ���� �������� �ּҸ� �˷��ش�. �� ������� ���� ������ p�� ���ÿ� �����Ѵ�.
		Thread th1 = new WorkerThread(p, engText); 	// ���� ��� ������
		Thread th2 = new WorkerThread(p, korText);	// ���� ��� ������
		
		// �� �����带 �����Ų��.
		th1.start(); th2.start();
		}
	}

class SharedPrinter { 	// �� WorkerThread �����忡 ���� ���� ���ٵǴ� ���� ������
	// synchronized�� �����ϸ� �ѱ۰� ��� �� �ٿ� ���� ��µǴ� ��찡 �߻��Ѵ�.
	synchronized void print(String text) { 	// synchronized�� �����ϸ� print() �޼ҵ��� ���� ���� �浹 �߻�
		// Thread.yeild();
		for(int i=0; i<text.length(); i++)
			System.out.print(text.charAt(i));
		System.out.println();
	}
}

class WorkerThread extends Thread { // ������ Ŭ����
	SharedPrinter p; 	// ���� ������ �ּ�
	String [] text;
	
	WorkerThread(SharedPrinter p, String[] text) { // ���� ������ �ּҿ� �ؽ�Ʈ ���� ����
		this.p = p; this.text = text;
	}
	// ������� �ݺ������� ���� �����Ϳ� 10�� �����Ͽ� text[]�� ����Ѵ�.
	public void run() {
		for (int i=0; i<text.length; i++) // �� �پ� ���
			p.print(text[i]);
	}
}
