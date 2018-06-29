package org.ms.maven.web;

import org.ms.maven.service.MavenService;

public class MavenWebTest {
	
	public static void main(String[] args) {
		MavenService service=new MavenService();
		service.mavenServiceTest();
		System.out.println("测试git1修改！");
	}

}
