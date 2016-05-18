package metier2;

public class Unthread extends Thread {
public  void run (){
	long start =System.currentTimeMillis();
	while(System.currentTimeMillis()<(start+(1000*6))){
		System.out.println("Ligne affiché par une Thread");
		try{
		 Thread.sleep(600);
		
  }		catch(InterruptedException e){	  
  }
 }
}
}