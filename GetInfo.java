
public class Person {
		private String name;
		private int age;
		
	public Person() {
		name = "Laila";
		age = 21;
	}
	public Person(String newName, int newAge) {
		name = newName;
		age= newAge;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
		Person get1 = new GetInfo(); //calling default constructor
		Person get2 = new GetInfo("Lulu", 22); //calling overloaded constructor
		System.out.println("The first name was: " + get1.getName());
		System.out.println("The first age was: " + get1.getAge());
		System.out.println("The second name was: " + get2.getName());
		System.out.println("The second age was: " + get2.getAge());
		
	}
	
	
}
