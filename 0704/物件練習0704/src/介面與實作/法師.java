package 介面與實作;

public class 法師 implements 角色{
	String 名稱 = "";
	法師(String 名稱){
		this.名稱=名稱;
	}
	public void 回血() {
		System.out.println(名稱+":團體回復200點血量");
	}
	public void 攻擊() {
		System.out.println(名稱+":遠程攻擊+加成傷害30%");
	}
}
