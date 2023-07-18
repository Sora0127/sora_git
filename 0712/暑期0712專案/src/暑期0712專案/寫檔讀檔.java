package 暑期0712專案;
import java.io.File;


import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class 寫檔讀檔 {
	public static void main(String[]args) {
//		try {
//			File 文件 = new File("./書籍.csv");
//			Scanner 輸入 = new Scanner(文件);
//			
//			
//			while(輸入.hasNextLine()) {
//				String 資料列 = 輸入.nextLine();
//				String []儲存格 = 資料列.split(",");
//				for(int i=0;i<儲存格.length;i++) {
//					System.out.print(儲存格[i]);
//				}
//				System.out.print("\n");
//			}
//			輸入.close();
//		}catch(FileNotFoundException e) {
//			System.out.println("讀檔失敗!!");
//		}
//		System.out.print("結束");
		
		try {
			File 文件 = new File("./書籍.csv");
			Scanner 輸入 = new Scanner(文件);
			FileWriter 寫檔 = new FileWriter("書籍_折扣.csv");
			
			String 標題列=輸入.nextLine();
			System.out.println(標題列+",折扣");
			寫檔.write(標題列+",折扣\n");
			while(輸入.hasNextLine()) {
				String 資料列 = 輸入.nextLine();
				String []儲存格 = 資料列.split(",");
				int 打折=0;
				for(int i=0;i<儲存格.length;i++) {
					寫檔.write(儲存格[i]+",");
					System.out.print(儲存格[i]+"|");
					if(i==儲存格.length-1) {
						打折 = Integer.parseInt(儲存格[儲存格.length-1]);
						打折*=0.8;
						System.out.print(打折);
						寫檔.write(String.valueOf(打折));
					}
				}
				寫檔.write("\n");
				System.out.print("\n");
			}
			輸入.close();
			寫檔.close();
		}catch(IOException e) {
			System.out.println("讀檔失敗!!");
		}
	}
}
