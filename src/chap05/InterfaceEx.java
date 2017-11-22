package chap05;

interface PhoneInterface { 								// �������̽� �ۼ�
	int BUTTONS = 20; 									// ��� �ʵ� ����. public static final int BUTTONS = 20;�� ����.
	void sendCall();
	void receiveCall();
}
interface MobilePhoneInterface extends PhoneInterface {	// �������̽� ���
	void sendSMS();
	void receiveSMS();
}
interface MP3Interface {								// �������̽� �ۼ�
	public void play();
	public void stop();
}
class PDA {
	public int calculate(int x, int y) { return x + y; }
}

// SmartPhone Ŭ������ PDA�� ��ӹް�,
// MobilePhoneInterface�� MP3Interface �Ӥ��������̽��� ����� �޼ҵ带 ��� �����Ѵ�.

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {
	public void sendCall() { System.out.println("��ȭ �ɱ�"); }
	public void receiveCall() { System.out.println("���� �ޱ�"); }
	public void sendSMS() { System.out.println("SMS ������"); }
	public void receiveSMS() { System.out.println("SMS �ޱ�"); }
	
	public void play() { System.out.println("���� ���"); }
	public void stop() { System.out.println("��� ����"); }
	
	public void schedule() { System.out.println("���� ����"); }
}

public class InterfaceEx {
	public static void main(String[] args) {
		SmartPhone p = new SmartPhone();
		p.sendCall();
		p.play();
		System.out.println(p.calculate(3,5));
		p.schedule();
	}
}
