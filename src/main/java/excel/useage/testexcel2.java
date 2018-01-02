package excel.useage;


import java.io.IOException;
import java.util.ArrayList;
import excel.utils.ExcelTools;
import excel.utils.ForFile;

public class testexcel2 {

	public static void main(String[] args) {
		
		
		ArrayList<String> list ;
		//山西epg图片信息样例.xls
		String filepath = "E:\\山西epg图片信息样例.xls";
		//int[] intArray = {1,3,5,7,8,9,13};   
		//int[] intArray2 = {1,3,5,7,8,9,12};  
		//int[] intArray3 = {2,3,5,6,7,8,9};  
		
		int[] intArray = {1,2,3};  //0时id 不要
		/**
		 * 图片ID							ACCESS_URL						图片名称					       图片类型
		 * 1001180000000000011163	201611/img2016111314313538294.jpg	img2016111314313538294.jpg	0
		 * 1001180000000000052720	201702/img2017021715554618367.jpg	img2017021715554618367.jpg	0
		 * 1001180000000000137705	201706/img2017060916214127986.jpg	img2017060916214127986.jpg	0
		 * 1001180000000000137467	201706/img2017060915384486394.jpg	img2017060915384486394.jpg	1
		 * 
		 * 
		 * */

 
		
		/**
		 * ---------------------------------------------------
		 *   上面为分别打印到 system.out中
		 *   
		 *   下面代码为 凑成一个大list后 ，打印到一个文件中
		 * 
		 * ---------------------------------------------------
		 * */
		
		
		ArrayList<String> newlisttotxtall  = new ArrayList<String>();
		ArrayList<String> listtotxt = new ArrayList<String>();
		try {			
			listtotxt  = ExcelTools.readExcelSpecial(filepath, intArray); 
			for(int i=0; i<listtotxt.size(); i++)    {   
			     String a = listtotxt.get(i); 
			     newlisttotxtall.add(a);
			     System.out.println(a );
			} 			
		} catch (Exception e) {			
			e.printStackTrace();
		}		
		System.out.println("---------------------------------");
		
		//写到txt文件中
		//生成到 E:\临时txt文件 的文件夹下
		try {
			ForFile.writeFileContinu_Chixu(newlisttotxtall);
		} catch (IOException e) {
			e.printStackTrace();
		}

		

	}

}
