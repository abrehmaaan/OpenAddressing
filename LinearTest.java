package openAddressing;

public class LinearTest {
	public static void main(String arg[]) {
		LinearProbingHashTable<Student> t = new LinearProbingHashTable<Student>(10);
		System.out.println("====== Linear Probing ======\n");
		t.insert(50, new Student(50, "Ali"));
		t.insert(20, new Student(20, "Khalid"));
		t.insert(70, new Student(70, "Nasser"));

	
	}
}
