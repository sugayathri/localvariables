package nonstatic;

public class NonstaticVar {
	public int a=40;
	public int b=30;
	public static void main(String[] args) {
		//for nonstatic variables create object to access
		NonstaticVar n=new NonstaticVar();
		System.out.println(n.a+n.b);
	}

}
