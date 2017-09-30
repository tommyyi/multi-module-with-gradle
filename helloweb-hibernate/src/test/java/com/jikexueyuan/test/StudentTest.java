/**
 * 
 */
package com.jikexueyuan.test;

import com.jikexueyuan.entity.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Test;

/**
 * @author slw
 *
 */
public class StudentTest {

	@Test
	public void createTable(){
		Configuration cfg=new Configuration().configure();
		SchemaExport se=new SchemaExport(cfg);
		se.create(true, true);
		
	}
	
	@Test
	public void add(){
		Configuration cfg=new Configuration().configure();
		//SessionFactory factory=cfg.buildSessionFactory();
		
		StandardServiceRegistryBuilder ssrb=new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
		
		ServiceRegistry service=ssrb.build();
		SessionFactory factory=cfg.buildSessionFactory(service);
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Student stu=new Student();
		stu.setName("zhangsan");
		stu.setAge(20);
		try{
			
			session.save(stu);
			tx.commit();
		}catch(Exception ce){
			tx.rollback();
		}finally{
			session.close();
		}
		
		
	}
	
	@Test
	public void get(){
		Configuration cfg=new Configuration().configure();
		//SessionFactory factory=cfg.buildSessionFactory();
		
		StandardServiceRegistryBuilder ssrb=new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
		
		ServiceRegistry service=ssrb.build();
		SessionFactory factory=cfg.buildSessionFactory(service);
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		try{
			Student stu=(Student)session.get(Student.class, 1);
			System.out.println(stu.getId()+stu.getName()+stu.getAge());
			tx.commit();
		}catch(Exception ce){
			tx.rollback();
		}finally{
			session.close();
		}
	}
}
