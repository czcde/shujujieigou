package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.tomcat.util.codec.binary.StringUtils;


/**
 * У�鹤����
 * @author CZC
 *
 */
public class CheckUtils {
	/*
	 * 1.�绰�����У��
	 */
	public static boolean isMobileNO(String mobiles) {
		boolean flag = false;
		try {
		Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9])|(17[7-9]))\\d{8}$");
		Matcher m = p.matcher(mobiles);
		flag = m.matches();
		}catch(Exception e){
			flag = false;
		}
		return flag;
	}
	/*
	 * 2.18λ���֤�ŵ�У��
	 */
	public static boolean isIdNO(String idnums) {
		boolean flag = false;
		try {
		Pattern p = Pattern.compile("^[1-9]\\d{5}(18|19|([23]\\d))\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$");
		Matcher m = p.matcher(idnums);
		flag = m.matches();
		}catch(Exception e){
			flag = false;
		}
		return flag;
	}
	/*
	 * 3.����У��
	 */
	public static boolean isEmailNO(String emails) {
		boolean flag = false;
		try {
			Pattern p = Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])");
			Matcher m = p.matcher(emails);
			flag = m.matches();
		}catch(Exception e) {
			
		}
		return flag;
	}
	/*
	 * ����ǿ�ȵ�У��
	 */
	public static int password(String password) {
		//ֻ������
		Pattern p = Pattern.compile("[0-9]+");
		Matcher m = p.matcher(password);
		if(m.matches()) {
			return 1;
		}
		//ֻ����ĸ
		Pattern p1 = Pattern.compile("[a-zA-Z]+");
		Matcher m1 = p1.matcher(password);
		if(m1.matches()) {
			return 1;
		}
		//ֻ�������ַ�
		//try {
			Pattern p2 = Pattern.compile("[!@#;',.%&*]+");
			Matcher m2 = p2.matcher(password);
			if(m2.matches()) {
				return 1;
			}
		//}catch(Exception e){
			//System.out.println(escapeExprSpecialWord(password));
		//}
		
		//�����ֺ���ĸ��
		Pattern p3 = Pattern.compile("[a-zA-Z0-9]+");
		Matcher m3 = p3.matcher(password);
		if(m3.matches()) {
			return 2;
		}
		//�����ֺ������ַ���
		Pattern p4 = Pattern.compile("[!@#;',.%&*0-9]+");
		Matcher m4 = p4.matcher(password);
		if(m4.matches()) {
			return 2;
		}
//		//����ĸ�������ַ���
//		Pattern p5 = Pattern.compile("[-a-zA-Z`=\\[];',./~!@#$%^&*()_+|{}:\"<>?]*[a-zA-Z]+[-`=\\[];',./~!@#$%^&*()_+|{}:\"<>?]+[-a-zA-Z`=\\[];',./~!@#$%^&*()_+|{}:\"<>?]* ");
//		Matcher m5 = p5.matcher(password);
//		if(m5.matches()) {
//			return 2;
//		}
//		//���ֶ��е�
//		Pattern p6 = Pattern.compile("[-da-zA-Z`=\\[];',./~!@#$%^&*()_+|{}:\"<>?]*(\n" + 
//				"\n" + 
//				"(d+[a-zA-Z]+[-`=\\[];',./~!@#$%^&*()_+|{}:\"<>?]+) #���ֿ�ͷ\n" + 
//				"\n" + 
//				"|(d+[-`=\\[];',./~!@#$%^&*()_+|{}:\"<>?]+[a-zA-Z]+) #���ֿ�ͷ\n" + 
//				"\n" + 
//				"|([a-zA-Z]+d+[-`=\\[];',./~!@#$%^&*()_+|{}:\"<>?]+) #��ĸ��ͷ\n" + 
//				"\n" + 
//				"|([a-zA-Z]+[-`=\\[];',./~!@#$%^&*()_+|{}:\"<>?]+d+) #��ĸ��ͷ\n" + 
//				"\n" + 
//				"|([-`=\\[];',./~!@#$%^&*()_+|{}:\"<>?]+d+[a-zA-Z]+) #�����ַ���ͷ\n" + 
//				"\n" + 
//				"|([-`=\\[];',./~!@#$%^&*()_+|{}:\"<>?]+[a-zA-Z]+d+) #�����ַ���ͷ\n" + 
//				"\n" + 
//				")\n" + 
//				"\n" + 
//				"[-da-zA-Z`=\\[];',./~!@#$%^&*()_+|{}:\"<>?]* ");
//		Matcher m6 = p6.matcher(password);
//		if(m6.matches()) {
//			return 3;
//		}
		return 0;
	}
	//У��Ƿ��ַ��ķ���
	public static String escapeExprSpecialWord(String keyword) {
		 String[] fbsArr = { "\\", "$", "(", ")", "+", "[", "]", "?", "^", "{", "}", "|" };
		 for (String key : fbsArr) {
		 if (keyword.contains(key)) {
		 keyword = "���зǷ��ַ�";
		 }
		 }
		 return keyword;
		}

}
