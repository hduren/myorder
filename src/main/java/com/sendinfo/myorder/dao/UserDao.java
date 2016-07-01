package com.sendinfo.myorder.dao;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;




import com.sendinfo.myorder.model.Student;
import com.sendinfo.myorder.model.User;
import com.sendinfo.myorder.model.UserGroup;
@Repository
public class UserDao extends SqlMapClientDaoSupport {
	public int addUser(User user){
		UserGroup userGroup=new UserGroup();
		userGroup.setCode("nihao1");
		userGroup.setName("shouji1");
		Student student= (Student)getSqlMapClientTemplate().queryForObject("queryStudentById", "ph"); 
System.out.println(student.getName());
		
			Object obj=	getSqlMapClientTemplate().insert("insertUserGroup",userGroup);
			System.out.println(obj);
		return 1;
	}

}
