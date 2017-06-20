
public class Assign_3 {
	public void swap(int a,int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping");
		System.out.println("a =" + " "+a);
		System.out.println("b =" + " "+b);
	}
	public static void main(String[] args) {
    Assign_3 obj= new Assign_3();
	int a=10;
	int b=4;
	System.out.println("Before Swapping");
	System.out.println("a =" + " "+a);
	System.out.println("b =" + " "+b);
    obj.swap(a,b);
	}
}
