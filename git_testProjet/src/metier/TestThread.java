package metier;

public class TestThread extends  Thread {
public TestThread(String name){
	super(name);
}
public TestThread(){
	super();
}
public void run(){
	for(int i =0;i<10;i++){
		System.out.println("le nom du getName est "+this.getName());
	}
}
}
