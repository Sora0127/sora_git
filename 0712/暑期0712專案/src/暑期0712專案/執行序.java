package 暑期0712專案;

import java.util.concurrent.CompletableFuture;

public class 執行序 {
	public static void main(String[]args) {
		long start;
		long end;
		start = System.currentTimeMillis();
		CompletableFuture<String> r = doSynchronousProcessing();
		end = System.currentTimeMillis();
		System.out.println("總秒:"+(end-start)+"毫秒");
		
		
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				CompletableFuture<String> r = doSynchronousProcessing();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("總秒:"+(System.currentTimeMillis()-start)+"毫秒");
				
			}
		
		});
		
		t.start();
		
	}

	private static CompletableFuture<String> doSynchronousProcessing() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
