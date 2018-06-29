package org.ms.maven.service;

import com.zgs.test.maven_dao.MavenDao;

public class MavenService {

	public void mavenServiceTest() {
		MavenDao dao=new MavenDao();
		System.out.println("mavenService test++>> "+dao.getStrTest());
	}
}
