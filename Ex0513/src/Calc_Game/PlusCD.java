package Calc_Game;

public class PlusCD implements CD {
	private int max;
	private String[] ErrMsg;
	private int life;
	private String oper;
	private int num1;
	private int num2;

	public PlusCD(int max, String[] errMsg, int life) {

		this.max = max;
		this.ErrMsg = errMsg;
		this.life = life;
	//	this.oper = oper;
	}

	public PlusCD() {
	}

	public String[] getErrMsg() {
//		ErrMsg = { "어휴..", "에휴..", "???...", "한번만 더..", "GameOver!" };
		return ErrMsg;
	}

	public int getlife() {
		return life;

	}

	public void makeNum() {
		this.num1 = (int) (Math.random() * max);
		this.num2 = (int) (Math.random() * max);
	}

	public String getMsg() {

		return num1 + "+" + num2 + "=";
	}

	public boolean isChecked(int input) {

		return num1 + num2 == input;

	}

}
