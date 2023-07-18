package 介面與實作;

public class Main {
	public static void main(String[]args) {
		法師 a = new 法師("黑暗大法師");
		劍士 b = new 劍士("星爆狂戰士");
		a.攻擊();
		a.回血();
		b.攻擊();
		b.移動();
	}
}
