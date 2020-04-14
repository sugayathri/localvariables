package localvar;

import org.eclipse.jdt.internal.compiler.batch.Main;

public class LocalVariablles {
	public static void a1()
	{
		//local variables
		int a=10,b=20;
		System.out.println(a+b);
	}
	public static void b1()
	{
		//local variables
		String a="entry level ";
	String b="covid19";
	System.out.println(a.concat(b));
	}
	public static void c1()
	{
		//local variables
		String a="exit level ";
		String b="virus dead";
		System.out.println(a.concat(b));
	}
public static void main(String[] args) {
	a1();
	b1();
	c1();
}
}
