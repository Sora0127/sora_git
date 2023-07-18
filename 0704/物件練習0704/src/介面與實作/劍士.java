package 介面與實作;

public class 劍士 implements 角色{
	String 名稱 = "";
	劍士(String 名稱){
		this.名稱=名稱;
	}
	public void 移動() {
		System.out.println(名稱+":加速200秒");
	}
	public void 攻擊() {
		System.out.println(名稱+":短範圍攻擊+傷害加成40%");
	}
}
