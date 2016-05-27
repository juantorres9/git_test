package metier2;

public class Principal2  {
	public Principal2()throws InterruptedException {
		//Creation de Thread
		Unthread thread1= new Unthread();
		//Demarrage  du Thread 
		thread1.start();
		while(thread1.isAlive()){
			System.out.println("Je suis un Thread qui s'appelle="+ thread1.getName()+" et Priorité="+thread1.getPriority());
			
			thread1.sleep(800);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		try{
			Principal2 p = new Principal2();
		}catch(InterruptedException e){
			e.getMessage();
			
		}
	
		}




}
