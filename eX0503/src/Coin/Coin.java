package Coin;

public class Coin {

	private int money;

	public void deposit(int inputMoney) {
		money += inputMoney;
	}

	public void withdraw(int outputMoney) {
		money -= outputMoney;
	}

	// return �� syso�� ���̰� �ִ°�? �ӵ��� �����鿡��,
	public int showMoney() {
		return money;
	}

}
