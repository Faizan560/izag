package thread;

public class Demoov {

	public static void main(String[] args) {
		OddevenThread t1 = new OddevenThread();
		EvenoddThread t2 = new EvenoddThread();
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();

	}

}