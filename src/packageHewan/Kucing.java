
package packageHewan;

//interface bisa dipake lebih dari satu
public class Kucing implements InterfaceHewan, InterfaceKedua {
	@Override
	
	public void bergerak() {
		System.out.println("Kucing"+name+" berjalan");
	}
	
	public void test() {
		System.out.println("Hello");
	}
	
	public void foo() {
		
	}
}
