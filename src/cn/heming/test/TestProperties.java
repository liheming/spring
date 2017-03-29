package cn.heming.test;

import cn.heming.db.JDBCOption;
import cn.heming.db.SQLConstant;

import java.util.HashMap;
import java.util.List;

public class TestProperties {

	private static String url;
	private static String name;

	public static void main(String[] args) {
        List<?> list=  JDBCOption.query(SQLConstant.getUserByName, 123);
            HashMap hashMap = (HashMap) list.get(0);
            String  password = (String) hashMap.get("password");
            System.out.println("密码是："+password);
    }


}
