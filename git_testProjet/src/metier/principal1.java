package metier;

public class principal1 {

	public static void main(String[] args) {
		System.out.println("Le nom du thread principal est " + Thread.currentThread().getName());
        //HAUT VAUT1 ;
		TestThread t= new TestThread("A");
		TestThread t2 =new TestThread("B");
		TestThread t3 =new TestThread("C");
		TestThread t4 = new TestThread();
		//HAUT VAUT2 ;
		t.start();
		t2.start();
		t3.start();
		t4.start();
		//HAUT VAUT3 ;	
		
		//HAUT VAUT4 ; 
		
	}

}