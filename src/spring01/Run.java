package spring01;

public class Run {
	private String  address;
	private Person person;
	
	public Run(String address, Person person) {
		super();
		this.address = address;
		this.person = person;
	}

	public Run() {
		// TODO Auto-generated constructor stub
	}
	public void run() {
		for (String name : person.getName()) {
			System.out.println(name+"ΤΪ"+address+"Εά²½");
		}
		
	}
}
