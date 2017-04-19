package snippet;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Snippet {
//	public static void main(String[] args) {
//		String line = "2016年$capt()10月11日我们去哪里玩近期我们近日，次年，同年等等，10月，2019年，3月4日"  ;
//		Pattern datePattern = Pattern.compile("capt");  
//		Matcher dateMatcher = datePattern.matcher(line);  
//		int dateCount = 0;  
//		dateMatcher.find()
//	}
	
	public static void main(String[] args) {
	    // 要验证的字符串
//	    String str = "$capt()://dsdf.c";
//	    String str = "sdfsdfsdf${capt(2)}dfdf${capt(3)}";
//	    String str = "${capt(2)}dfdf${capt(4)}ddd${capt(1)}";
	    // 邮箱验证规则
//	    String regEx = "[a-zA-Z_]{1,}[0-9]{0,}@(([a-zA-z0-9]-*){1,}\\.){1,3}[a-zA-z\\-]{1,}";
//	    String regEx = "^((\\$capt\\(\\))://)?([\\w-]+\\.)+[\\w-]+(/[\\w-./?%&=]*)?$";
//	    String regEx = ".*((\\$\\{capt\\([\\w(0-9)]\\)\\})).*";
//	    String regEx = "\\$\\{capt\\([\\w(0-9)]\\)\\}";
	    
	    
	    
	    
	    
	    
	    
	    String regEx = "[\\$][\\{][capt]+[a]+[p]+[t]+[\\(]+[\\-]{0,}+\\d+[\\,]+[\\-]{0,}+\\d+[\\)]+[\\}]";
//		String rep   = "[\\$][\\{][capt]+[a]+[p]+[t]+[\\(]+\\d+[\\,]+\\d+[\\)]+[\\}]";
		String str="fff${capt(55,96)}ddsdfdsf${capt(55,99)}";
	    
	    
	    
	    // 编译正则表达式
	    Pattern pattern = Pattern.compile(regEx);
	    // 忽略大小写的写法
	    // Pattern pat = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(str);
	    
	    
	    // 字符串是否与正则表达式相匹配
//	    boolean rs = matcher.matches();
//	    System.out.println(rs);
	    ArrayList<String> strs = new ArrayList<String>();
        while (matcher.find()) {
            strs.add(matcher.group());            
        } 
        for (String s : strs){
            System.out.println(s);
        }        
	    
	    
//	    getStrings();
	}
	
	
	
	private static void getStrings() {
        String str = "rrwerqq84461376qqasfdasdfrrwerqq84461377qqasfdasdaa654645aafrrwerqq84461378qqasfdaa654646aaasdfrrwerqq84461379qqasfdasdfrrwerqq84461376qqasfdasdf";
        Pattern p = Pattern.compile("qq(.*?)qq");
        Matcher m = p.matcher(str);
        ArrayList<String> strs = new ArrayList<String>();
        while (m.find()) {
            strs.add(m.group(1));            
        } 
        for (String s : strs){
            System.out.println(s);
        }        
    }
}

