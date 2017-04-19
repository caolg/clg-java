package com.clg.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListDemo {
	private static List<String> list=new ArrayList<String>();
	
	public static void main(String[] args) {
		for(;;){
			 Scanner input = new Scanner(System.in);
			 System.out.println("增加(1)\t查询(2)\t删除(3)\t退出(8)");
			 int inputNum=input.nextInt();
			 if(inputNum==1){
				 System.out.print("请输入用户名:");
				 String val=input.next();
				 list.add(val);
				 System.out.println("添加成功!");
				 continue;
			 }else if(inputNum==2){
				 System.out.println("list 信息如下:");
				 System.out.println("\t名称---------------------共"+list.size()+"条数据");
				 for(String str:list){
					 System.out.println("\t"+str);
				 }
				 System.out.println("--------------------------");
			 }else if(inputNum==3){
				 System.out.print("请输入要删除第条数据:");
				 int num=input.nextInt();
				 list.remove((num-1));
				 System.out.println("删除成功!");
				 continue;
			 }else if(inputNum==8){
				 System.out.println("退出成功");
				 input.close();
				 break;
			 }
			 
		}
		
		
	}

}
