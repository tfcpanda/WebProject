package test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Embeddable;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mysql.jdbc.PreparedStatement;

import HibernateSessionFactory.HibernateSessionFactory;
import entity.Admin;

public class HiberateTest {

	SessionFactory sessionFactory = null;
	Transaction transaction = null;
	Session session = null;

	@Before
	public void init() {
		// 1.创建
		Configuration configuration = new Configuration().configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
				.buildServiceRegistry();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		// 2.开启sessioon
		session = sessionFactory.openSession();
		// 3.开启事务
		transaction = session.beginTransaction();
	}

	@After
	public void distory() {
		transaction.commit();
		// 6.关闭Session
		session.close();
		// 7.关闭工厂
		sessionFactory.close();
	}

	@Test
	public void testSessionCache() {
		Session session = HibernateSessionFactory.getSession();
		String hql = "FROM Admin WHERE id=? AND  password=?";
		Query query = session.createQuery(hql);
		query.setInteger(0, 222);
		query.setString(1, "222");
		List list = query.list();
		System.out.println(list);
	}

	@Test
	public void test22() {

	}

	@Test
	public void test1() {
		Session session = HibernateSessionFactory.getSession();
		String hql = "from Admin";
		Query query = session.createQuery(hql);
		List<Admin> admin = query.list();
		System.out.println(admin);
	}

	@Test
	public void test2() {
		Session session = HibernateSessionFactory.getSession();
		String hql = "FROM Admin WHERE Id=? AND  password=?";
		Admin admin = new Admin();
		Query query = session.createQuery(hql);
		query.setParameter(0, admin.getId());
		query.setParameter(1, admin.getPassword());
		List list = query.list();
		// List list = (List) session.createQuery(hql).setInteger(0, admin.getId())
		// .setString(1, admin.getPassword()).list();
		System.out.println(list);
	}

	@Test
	public void test4() throws SQLException {
		String hql = "FROM Admin a" + " WHERE a.id = ?";
		Query query = session.createQuery(hql);
		// 2.绑定参数
	}

}
