package cn.heming.test;

import cn.heming.db.JDBCOption;
import cn.heming.db.SQLConstant;



public class TestSQL {

	public static void main(String[] args) {
				boolean	line=	JDBCOption.update(SQLConstant.AddMessage, null, "","1111111","111111111@qq.com") ;
				System.out.println("Ӱ�������:"+line);

//		List<?> list  =	JDBCOption.query(SQLConstant.GetAllMessage);
//		for (int i = 0; i < list.size(); i++) {	
//			HashMap hashMap=(HashMap) list.get(i);
//			System.out.println("�û�ID:"+ hashMap.get("id"));
//			System.out.println("�û���:"+ hashMap.get("username"));
//			System.out.println( "�û�����:"+hashMap.get("password"));
//			System.out.println("��������:"+hashMap.get("email"));
//		}				
	}
}

