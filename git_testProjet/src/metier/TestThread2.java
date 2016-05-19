package metier;

public class TestThread2 extends Thread{
//Creation de variable Thread 
	Thread t ;
	
	/**CONSTRUCTEUR 1**/
	public TestThread2(String  name){
		//Creation d'un Thread  avec le nom "name " 
		super(name);
		System.out.println("statut du Thread Contructeur = "+this.getName()+" égal à ="+this.getState());
		//Demarrage du thread:
		this.start();
		//Affichage du statut apres demarrage du thread:
		System.out.println("statut du Thread Contructeur = "+this.getName()+" égal à ="+this.getState());
	}
	/**CONSTRUCTEUR 2**/
	public TestThread2(String name, Thread t){
		super(name);
		this.t=t;
		//Creation d'un Thread  avec le nom "name " 
		System.out.println("statut du Thread Constructeur= "+this.getName()+" égal à ="+this.getState());
		System.out.println("statut du Thread VariableClass= "+this.t.getName()+" égal à ="+this.t.getState());
		
		//Demarrage du thread:
		this.start();
		System.out.println("statut du Thread  Constructeur = "+this.getName()+" égal à ="+this.getState());
		System.out.println("statut du Thread Variable Class= "+this.t.getName()+" égal à ="+this.t.getState());
	}
	/**SETTER METHOD **/
	public void setThread(Thread t){
		this.t=t;
	}
	/**METHOD RUN**/
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("le statut du Thread Instancié ="+this.getName()+" égal à ="+this.getState());
		//Etat de Thread  "this.t"  variable de class
			if(t !=null){
				System.out.println("le statut du Thread Variable de Class ="+this.t.getName()+ " égal à ="+this.t.getName() +" PENDANT  que le Thread ="+this.getName()+" égal à ="+this.getState());
			}
			
		}
	}
	}
		


