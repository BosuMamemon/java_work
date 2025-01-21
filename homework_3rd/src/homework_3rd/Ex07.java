package homework_3rd;

// 은행 계좌를 나타내는 BankAccount 클래스를 작성하라. 
// (1) 필드는 계좌번호(accountNumber), 오너(owner), 잔액(balance)를 가지며, 클래스 전용 필드이다. 
// (2) 메소드는 입급(deposit), 출금(withdraw), 잔액조회(getBalance) 함수를 가진다.
// 	단 출금함수는 잔액보다 출금액이 크지 않아야 한다.
// (3) 계좌 이체함수는 다음과 같이 추가하라. 
// // 현재 객체의 잔액에서 amount만큼을 otherAccount 계좌로 송금한다. 
// public int transfer(int amount, BankAccount otherAccount)   
// {
// ...
// }
// (4)  입금, 출금, 잔액 조회, 계좌 이체를 테스트하는 메인을 작성하라.

class BankAccount {
	
//	필드
	private int accountNumber;
	private String owner;
	private int balance;
//	생성자
	public BankAccount() {
		super(); 
	}
	public BankAccount(int accountNumber, String owner, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.balance = balance;
	}
//	메소드
//		getter, setter
	public int getAccountNumber() {
		return accountNumber;
	}
	public String getOwner() {
		return owner;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
//		입금(deposit)
	public void deposit(int deposit) {
		this.balance += deposit;
	}
//		출금(withdraw)
	public void withdraw(int withdraw) {
		this.balance -= withdraw;
	}
//		잔액조회(getBalance)(getter)
	public int getBalance() {
		return balance;
	}
//		계좌이체(transfer)
	public int transfer(int amount, BankAccount otherAccount) {
		this.balance -= amount;
		otherAccount.balance += amount;
		return this.balance;
	}
	
}

public class Ex07 {
//	메인 메소드
	public static void main(String[] args) {
//		계좌 생성
		BankAccount a = new BankAccount(1, "a", 10000);
		BankAccount b = new BankAccount(2, "b", 0);
//		메소드 테스트
		a.deposit(10000);
		System.out.println(a.getBalance());
		
		a.withdraw(5000);
		System.out.println(a.getBalance());
		
		System.out.println(a.transfer(10000, b));
		System.out.println(b.getBalance());
	}
}
