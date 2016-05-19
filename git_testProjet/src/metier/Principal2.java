package metier;

public class Principal2 {

	public static void main(String[] args) {
	Thread tt= new Thread();

	TestThread2 t= new TestThread2("A");
	//TestThread2 t2= new TestThread2("B");
	//TestThread2 t3= new TestThread2("C");
	TestThread2 t4= new TestThread2("D",t);
    System.out.println("******************************************************");
    try{
    	Thread.sleep(1000);
    }catch(InterruptedException e){
    	e.printStackTrace();
    }
    System.out.println("statut du Thread ContructeurMain t = "+t.getName()+" égal à ="+t.getState());
    System.out.println("statut du Thread ContructeurMain t4= "+t4.getName()+" égal à ="+t4.getState());
    /** TEST 2
    t.setThread(t2);
    t.run();
    **/
	}

}
