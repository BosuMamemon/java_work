package interfacePackage;

public class InterfaceEx {
	
	public static void main(String[] args) {
		
//		PhoneInterface pi = new PhoneInterface();
//		인터페이스는 추상 클래스의 일종이라서 인스턴스를 가질 수 없음
		SamsungPhone p1 = new SamsungPhone();
		System.out.println();
		p1.printLog();
		p1.sendCall();
		p1.receiveCall();
		p1.flash();
		System.out.println(PhoneInterface.timeout);
		
		Smartphone sp1 = new Smartphone();
		System.out.println();
		sp1.printLog();
		sp1.MP3Ringtone();
		sp1.play();
		sp1.stop();
		sp1.sendSMS();
		sp1.receiveSMS();
		sp1.sendCall();
		sp1.receiveCall();
		System.out.println(sp1.calculate(1, 2));
		sp1.schedule();
		
	}

}
