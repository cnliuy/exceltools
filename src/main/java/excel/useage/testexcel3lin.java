package excel.useage;


import java.io.IOException;
import java.util.ArrayList;
import excel.utils.ExcelTools;
import excel.utils.ForFile;

public class testexcel3lin {
	 /**
	  * using
	  *   正在使用的。
	  *   linlin分类
	  *   
	  *   
	  * */
	public static void main(String[] args) {
		
		
		ArrayList<String> list ;
		//山西epg图片信息样例.xls
		String filepath = "E:\\手机版图片取237-2";		
		//注意
		//	excel的字段需要排序		
		filepath = "E:\\手机版图片取237-2.xls";
		
		
		//int[] intArray = {1,3,5,7,8,9,13};   
		//int[] intArray2 = {1,3,5,7,8,9,12};  
		//int[] intArray3 = {2,3,5,6,7,8,9};  
		
		int[] intArray = {1,2,3};  //0时id 不要
		/**
		    	图片ID					ACCESS_URL						图片类型	图片名称
		 	1001180000000000006844	201601/img2016012322303176420.png	0	img2016012322303176420.png
		 	1001180000000000006867	201601/img2016012402210534059.png	0	img2016012402210534059.png
		 	1001180000000000007515	201603/img201603010922300756.jpg	0	img201603010922300756.jpg
		 	1001180000000000007563	201603/img2016030118011975195.jpg	0	img2016030118011975195.jpg
                                           		要 							要        要
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
