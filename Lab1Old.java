class Lab1Helper implements Runnable{
	@Override
	public void run() {
		System.out.println("Lab1Hepler - Run method is invoked....");
	}
}
public class Lab1Old {
	public static void main(String[] args) {
		Lab1Helper helper = new Lab1Helper();
		Thread t1 = new Thread(helper);
		t1.start();
	}
}