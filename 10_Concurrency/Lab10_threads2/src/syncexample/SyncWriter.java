package syncexample;

public class SyncWriter extends Thread{
	private Object o;
	public SyncWriter(Object o) {
		this.o = o;
	}
	//Miért nem segít a synchronized?
	public void run(){
		synchronized (System.out.getClass()) {
			for (int i = 0; i < 10; i++) {
				System.out.println("Edward király, angol király");
				System.out.println("Léptet fakó lován:");
				System.out.println("Hadd látom, úgymond, mennyit ér");
				System.out.println("A velszi tartomány.");
				System.out.println("");
				System.out.println("Van-e ott folyó és földje jó?");
				System.out.println("Legelőin fű kövér?");
				System.out.println("Használt-e a megöntözés:");
				System.out.println("A pártos honfivér?");
				System.out.println("");
			}
		}
	}
	
	public static void main(String[] args){
		Object o = new Object();
		for (int i=0; i<10; i++){
			(new SyncWriter(o)).start();
		}
	}
}
