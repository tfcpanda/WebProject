package service.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import HibernateSessionFactory.HibernateSessionFactory;
import entity.Admin;
import service.AdminService;

public class AdminServiceImpl implements AdminService {

	@Override
	public boolean login(Admin admin) throws Exception {
		Session session = HibernateSessionFactory.getSession();
		// 设置一个记号flag;
		boolean flag = false;
		String hql = "FROM Admin WHERE id=? AND  password=?";
		Query query = session.createQuery(hql);
		query.setInteger(0, admin.getId());
		query.setString(1, admin.getPassword());
		List<Admin> list = query.list();
		if (!list.isEmpty()) {
			flag = true;
		}
		HibernateSessionFactory.closeSession();
		return flag;
	}

	@Override
	public List<Admin> show() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Admin admin) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public List edit(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editdo(Admin admin) throws Exception {
		// TODO Auto-generated method stub

	}

}
