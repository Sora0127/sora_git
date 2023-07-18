package 物件與繼承;

public class Fish extends Animal{
	String area;
	
	public Fish(int speed,String name) {
		super(speed,name);
		//用上層呼叫super 叫上層的建構子
	}
	
	public Fish(int speed,String name,String area) {
		super(speed,name);
		this.area = area;
	}
	
	public void print() {
		System.out.print("->speed:"+getSpeed()+"->name:"+getName()+"->area:"+this.area);
	}
}
