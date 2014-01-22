package org.zz.zjdb.example.test;

import org.zz.zjdb.example.model.MyUser;
import org.zz.zjdb.service.LoadClassProperties;

/**
 * 测试类
 * @author zz
 */
public class MyUserTest {

	public static void main(String[] args) {
		LoadClassProperties.getInstance().load(MyUser.class);
	}

}
