package ToyMachine;

public class Main {

	public static void main(String[] args) {
		
//		Butter[] butters = new Butter[5];
//		
//		for(int i=0; i<butters.length; i++) {
//			butters[i] = new Butter();
//		}
//	
//		//butters[0].butterPick();
//		
//		Machine m1 = new Machine(butters);
//		Butter doll =m1.run();
//		doll.butterPick();
//		
//		
//		Yado[] yados  = new Yado[3];
//		for(int i =0;i<yados.length; i++) {
//			yados[i]=new Yado();
//		}
//		
//		Machine m2 = new Machine(yados);
//		Yado doll2 = m2.run1();
//		doll2.yadoPick();
//		
		
		Toy[] toy = new Toy[3];
		
//		Toy toy1 = new Butter();
//		((Butter)toy1).pick();
//		
//		Toy toy2 = new Yado();
//		((Yado)toy2).pick();
//		
//		Toy toy3 = new Pizon();
//		((Pizon)toy3).pick();
	
		toy[0] = new Butter(); 
		toy[1] = new Yado();
		toy[2] = new Pizon();
		
		Machine m3 = new Machine(toy);
		Toy i = m3.run();
		i.pick();
		
	}

}
