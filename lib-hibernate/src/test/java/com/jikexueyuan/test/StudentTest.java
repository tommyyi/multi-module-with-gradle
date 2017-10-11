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
 */
public class StudentTest
{
    @Test
    public void createTable()
    {
        Configuration configuration = new Configuration().configure();
        SchemaExport schemaExport = new SchemaExport(configuration);
        schemaExport.create(true, true);
    }

    @Test
    public void add()
    {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        Student student = new Student();
        student.setName("wangwu12");
        student.setAge(20);
        try
        {
            session.save(student);
            transaction.commit();
        }
        catch (Exception ce)
        {
            transaction.rollback();
        }
        finally
        {
            session.close();
        }
    }

    @Test
    public void get()
    {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        try
        {
            Student student = (Student) session.get(Student.class, 1);
            System.out.println(student.getId() + student.getName() + student.getAge());
            transaction.commit();
        }
        catch (Exception ce)
        {
            transaction.rollback();
        }
        finally
        {
            session.close();
        }
    }

    private Session getSession()
    {
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());

        ServiceRegistry service = serviceRegistryBuilder.build();
        SessionFactory factory = configuration.buildSessionFactory(service);

        return factory.openSession();
    }
}
