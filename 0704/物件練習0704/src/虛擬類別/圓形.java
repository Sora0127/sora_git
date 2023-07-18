package 虛擬類別;
import java.util.*;
class 圓形 extends 形狀{
	protected float 半徑;
	public void 設置半徑(float 半徑) {
		this.半徑=半徑;
		設置面積();
	}
	圓形(float 半徑){
		this.半徑 = 半徑;
		設置面積();
	}
	protected void 設置面積() {
		this.面積 = Math.pow(半徑, 2)*3.14;
	}
	
}
