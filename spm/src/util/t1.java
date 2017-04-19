package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class t1 {
	public static void main(String[] args) {
		//String regEx = "${capt(+[0-9]+[,]+[0-9]+)}";
		String regEx = "[\\$][\\{][capt]+[a]+[p]+[t]+[\\(]+[\\-]{0,}+\\d+[\\,]+[\\-]{0,}+\\d+[\\)]+[\\}]";
		String rep   = "[\\$][\\{][capt]+[a]+[p]+[t]+[\\(]+\\d+[\\,]+\\d+[\\)]+[\\}]";
		String str="fff${capt(55,96)}ddsdfdsf${capt(55,99)}";
		Pattern p=Pattern.compile(regEx);
		Matcher m=p.matcher(str);
		String stemp="";
		ArrayList<String> list=new ArrayList<String>();
		if(m.find()){
			/*System.out.println(m.start()+"=="+m.end());
			stemp=str.substring(m.start(),m.end());
			System.out.println(str.substring(m.start(),m.end()));
			int x= Integer.valueOf(stemp.substring(stemp.indexOf("capt")+5,stemp.indexOf(",")));
			int y= Integer.valueOf(stemp.substring(stemp.indexOf(",")+1,stemp.lastIndexOf(")")));
			System.out.println(x+"=="+y);
			System.out.println(m.groupCount());
			*/
			list.add(m.group());
			
/*			for (int i=0;i<m.groupCount();i++) {
				stemp=m.group(i);
				int x= Integer.valueOf(stemp.substring(stemp.indexOf("capt")+5,stemp.indexOf(",")));
				int y= Integer.valueOf(stemp.substring(stemp.indexOf(",")+1,stemp.lastIndexOf(")")));
				System.out.println(x+"=="+y);
			}
*/
		}
		for (String s:list) {
			System.out.println(s);
			
		}
	}
	public static void main2333(String[] args) throws IOException {
		//FileInputStream is = new FileInputStream("D:/18_ItoaSource/Source/XW/vjsp.webapp/WebContent/WEB-INF/templates/cms/analytics/tsAnalyLog/list.ftl");
		BufferedReader bufReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("D:/18_ItoaSource/Source/XW/vjsp.webapp/WebContent/WEB-INF/templates/cms/analytics/tsAnalyLog/list.ftl"))));//数据流读取文件
		StringBuffer strBuffer = new StringBuffer();
		String empty = "";
		String tihuan = "";
		String stemp="";
		int x,y;
		String regEx = "[\\$][\\{][capt]+[a]+[p]+[t]+[\\(]+\\d+[\\,]+\\d+[\\)]+[\\}]";
		Pattern p=Pattern.compile(regEx);
		for (String temp = null; (temp = bufReader.readLine()) != null; temp = null) {
			Matcher m=p.matcher(temp);
			if(m.find()){
				stemp=temp.substring(m.start(),m.end());
				x= Integer.valueOf(stemp.substring(stemp.indexOf("capt")+4,stemp.indexOf(",")));
				y= Integer.valueOf(stemp.substring(stemp.indexOf(",")+1,stemp.lastIndexOf(")")));
			}
			/**
				tihuan = temp.substring(0, 10);
				temp = temp.replace(tihuan, empty);//
			 * */
			strBuffer.append(temp);
			strBuffer.append(System.getProperty("line.separator"));
		}
		bufReader.close();
		PrintWriter printWriter = new PrintWriter("d:/new.txt");
		printWriter.write(strBuffer.toString().toCharArray());
		printWriter.flush();
		printWriter.close();

	}
}
