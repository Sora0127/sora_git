package 物件與繼承;

public class Main {
	public static void main(String[]args) {
		Animal d = new Animal(100,"Dog");
		Fish f = new Fish(200,"Fish","pa");
		System.out.println(d.getName()+":"+d.getSpeed()); 
		f.print(); 
	}
}
