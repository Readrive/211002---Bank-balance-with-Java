import java.util.Scanner;

public class Bank {
	//계좌
	//잔액 == 필드
	//예금, 인출, 잔액확인 == 메소드
	
	int balance;
	int id;
	
	public Bank() {
		balance = 0;
		id = 99;
	}
	
	public int ido(int a) {
		a = 11;
		id -= a;
		return id;
	}
	
	public int deposit(int amount) { //입금
		balance += amount;
		return balance;
	}
	
	public int withdraw(int amount) { //출금
		balance -= amount;
		return balance;
	}
	
	public int bLance() {
		return balance;
	}	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int id;
		System.out.println("원하는 숫자를 입력해주세요: ");
		id = in.nextInt();
		
		int depoosit;
		System.out.println("얼마를 입금하시겠습니까?");
		depoosit = in.nextInt();
		
		System.out.println(id + "님의 잔액은 " + depoosit + "원입니다.");	
	}
}