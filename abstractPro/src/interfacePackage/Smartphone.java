package interfacePackage;

public class Smartphone extends PDA implements MusicPhoneInterface, MP3Interface {

	@Override
	public void sendSMS() {
		System.out.println("sendSMS");
	}
	@Override
	public void receiveSMS() {
		System.out.println("receiveSMS");
	}
	@Override
	public void sendCall() {
		System.out.println("sendCall");
	}
	@Override
	public void receiveCall() {
		System.out.println("receiveCall");
	}
	@Override
	public void play() {
		System.out.println("play");
	}
	@Override
	public void stop() {
		System.out.println("stop");
	}
	@Override
	public void MP3Ringtone() {
		System.out.println("MP3Ringtone");
	}
	public void schedule() {
		System.out.println("일정 관리합니다.");
	}

}
