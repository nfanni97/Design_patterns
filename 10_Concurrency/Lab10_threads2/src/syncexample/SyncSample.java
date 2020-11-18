package syncexample;

public class SyncSample extends Thread
{
	private static long i=0L; // Mi történik, ha i volatile?
	private static Object monitor = new Object();
	@SuppressWarnings("unused")
	private int id ;
	
	public void run(){
		// Melyik működik a négy közül, melyik nem és miért?
		//"this" never works, because we're syncing on the current thread object, instead of something associated with "i"
		// outher monitor doesn't work because then one thread will hog the resources -> no concurrency
		// synchronized (this)
		//  synchronized (monitor)
		{
			while(true){
				// synchronized (this) 
				 synchronized (monitor)
				{
					// System.out.println(id);
					i++;
					i++;		
				}
			}
		}
	}

	public SyncSample(int id)
	{
		this.id = id;		
	}
	
	public static void main(String[] args) {
		System.out.println("Kezdődhet a teszt.");
		
		// Készítünk tíz szálat, mindegyik ismeri az azonosítóját
		for (int it = 0; it<10; it++)
		{
			(new SyncSample(it)).start();
		}
		
		do {
			synchronized (monitor) {
				if (SyncSample.i % 2 != 0)
				{
					//Ha páratlan
					System.out.println("Valami gond van. Ez bizony páratlan...");
				}
			}
		} while(true);
	}

}
