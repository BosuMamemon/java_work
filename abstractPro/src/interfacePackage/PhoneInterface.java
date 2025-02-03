package interfacePackage;

public interface PhoneInterface {

	public static final int timeout = 10000;
//	public static final은 생략 가능. (왜냐면 무조건 저거임)
	
	public abstract void sendCall();
	public abstract void receiveCall();
//	public abstract는 생략 가능. (왜냐면 무조건 저거임)
	
	public default void printLog() {
		System.out.println("***Phone***");
	}
	
}
