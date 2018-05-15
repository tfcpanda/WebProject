package service;

import java.util.List;

import entity.Admin;

public interface AdminService {
	
	//登录方法
		public boolean login(Admin admin) throws Exception;
		//查询方法
		public List<Admin> show() throws Exception;
		//添加方法 
		public void insert(Admin admin) throws Exception;
		//删除方法
		public void delete(int id) throws Exception;
		//按ID查询单条记录
		public List edit(int id) throws Exception;
		//更新方法
		public void editdo(Admin admin)throws Exception;

}
