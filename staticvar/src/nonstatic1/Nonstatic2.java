package nonstatic1;

//packagename.classname
import nonstatic.NonstaticVar;

public class Nonstatic2 {

	public static void main(String[] args) {
		NonstaticVar n=new NonstaticVar();
		System.out.println(n.a-n.b);

	}

}
