package 物件與繼承;

public class Animal {
	private int speed;
	private String name;
	
	public Animal(int speed,String name) {
		this.speed = speed;
		this.name = name;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public String getName() {
		return name;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.print(this.name+"->speed:"+this.speed);
	}
}

