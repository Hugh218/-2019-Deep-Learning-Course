package Coin;

public class Coin {

	private int money;

	public void deposit(int inputMoney) {
		money += inputMoney;
	}

	public void withdraw(int outputMoney) {
		money -= outputMoney;
	}

	// return 과 syso의 차이가 있는가? 속도면 구조면에서,
	public int showMoney() {
		return money;
	}

}
