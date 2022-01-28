package packageHewan;

public interface InterfaceHewan {
	public final String name = "Ini hewan";
	public void bergerak();
	default public void test() {
		System.out.println("test");
	}
}
