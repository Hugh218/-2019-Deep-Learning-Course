package ToyMachine;

import java.util.Random;

public class Machine<T> {
	Random rd = new Random();
	T[] toy;
	
	public Machine(Toy[] toy1) {
		this.toy = toy1;
	}


	public Toy run() {
		int cnt = rd.nextInt(toy.length);
		return toy[cnt];
	}
	
}
