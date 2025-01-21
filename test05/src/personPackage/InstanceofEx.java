package personPackage;

public class InstanceofEx {
	
	public static void main(String[] args) {
		Person jee = new Student();
		Person kim = new Professor();
		Person lee = new Researcher();
		
		System.out.println(jee instanceof Person);
		System.out.println(jee instanceof Student);
		System.out.println(kim instanceof Student);
		System.out.println(kim instanceof Professor);
		System.out.println(kim instanceof Researcher);
		System.out.println(lee instanceof Professor);
//		System.out.println(3 instanceof int);
		System.out.println("Java" instanceof String);
	}

}
