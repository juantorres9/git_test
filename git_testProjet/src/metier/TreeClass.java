package metier;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.TreeMap;

public class TreeClass {

	
	Map<String,Duration> durationTree = new TreeMap<String,Duration>();

	public Map<String, Duration> getDurationTree() {
		return durationTree;
	}

	public void setDurationTree(Map<String, Duration> durationTree) {
		this.durationTree = durationTree;
	}

	public LocalDateTime[] replisDateTree(){
		LocalDateTime dTableau []=new LocalDateTime[3];
		int[] sleepInt= {1000,2000,3000};
		LocalDateTime date= null;
		
		System.out.println("nombre the threads ="+Thread.activeCount());
		for(int i=0;i<dTableau.length;i++){
			dTableau[i]=date.now();
			try {
				Thread.sleep(sleepInt[i]);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}		
		}
		System.out.println("la liste de temps recuperrées vaut =");
		for(LocalDateTime dates:dTableau){
			System.out.println("le temps recuperée vaut "+dates);
		}
		
		return dTableau;
	}
	
}
