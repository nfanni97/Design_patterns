package singleton;

public class TestSingleton {
	public static void foo()
	{
	  // Initialization on first use
	  GlobalClass.Instance().set_value(1);
	  System.out.println("foo: global_ptr is " + GlobalClass.Instance().get_value() + ", and the instance is: "+GlobalClass.Instance() + "\n");
	}
	
	public static void bar()
	{
	  // Initialization on first use
	  GlobalClass.Instance().set_value(2);
	  System.out.println("bar: global_ptr is " + GlobalClass.Instance().get_value() + ", and the instance is: "+GlobalClass.Instance() + "\n");
	}
	
	public static void main(String[] args) {
		System.out.println("main: global_ptr is " + GlobalClass.Instance().get_value() + ", and the instance is: "+GlobalClass.Instance() + "\n");
		foo();
		bar();
	}
	
}
