class Calc1
{
	public int add(int i, int j){
		return i +j;
	}
	public int sub(int i, int j){
		return i -j;
	}
	public int mult(int i, int j){
		return i *j;
	}
	public int divide(int i, int j){
		return i /j;
	}

}
public class Lab2Old {
	public static void main(String[] args) {
		Calc1 c1 = new Calc1();
		System.out.println("Sum = " + c1.add(10, 30));
		System.out.println("Sub = " + c1.sub(10, 30));
		System.out.println("Mult = " + c1.mult(10, 30));
		System.out.println("Divide = " + c1.divide(100, 30));
	}
	
}
