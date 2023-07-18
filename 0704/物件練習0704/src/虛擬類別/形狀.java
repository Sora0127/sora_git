package 虛擬類別;

public abstract class 形狀 {
	protected double 面積 = 0;
	protected String 名稱 = "形狀";
	public void 設置名稱(String 名稱) {
		this.名稱=名稱;
	}
	protected abstract void 設置面積();
	public void 顯示() {
		System.out.println(this.名稱+"-->"+this.面積);
	}
}
