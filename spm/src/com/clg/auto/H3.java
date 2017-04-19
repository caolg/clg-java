package com.clg.auto;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class H3 {
	public static void main(String[] args) throws ParseException {
		List<String> resList=new ArrayList<String>();
		for(int i=0;i<1000;i++){
			String str="";
			if(i<10){
				str+="00"+i;
			}else if(i<100){
				str+="0"+i;				
			}else {
				str+=""+i;
			}
//			System.out.print(str+" ");
			if(i%50==0){
//				System.out.println();
			} 
			int a=Integer.parseInt(str.substring(0, 1));
			int b=Integer.parseInt(str.substring(1, 2));
			int c=Integer.parseInt(str.substring(2, 3));
			if((a<6&&b<6&&c<6)||(a>3&&b>3&&c>3)||(b==c)||(b-1==c||b+1==c)||(a==b)||(a-1==b||a+1==b)){
				continue;
			}
			resList.add(str);
		}
		
		System.out.println(resList.size());
		for(int i=0;i<resList.size();i++){
			
			System.out.print(resList.get(i)+" ");
			if((i+1)%50==0){
				System.out.println();
			} 
		}
//		String format="yyyy-MM-dd HH:mm:ss";
//		SimpleDateFormat sdf = new SimpleDateFormat(format);  
//		String date_str="2016-09-30 15:48:02";
//		String date_str1="2017-09-30 16:48:02";
//		String vv = String.valueOf(sdf.parse(date_str).getTime());  
//		String vv1 = String.valueOf(sdf.parse(date_str1).getTime());  
//		System.out.println(vv);
//		System.out.println(vv1);
	}

}
