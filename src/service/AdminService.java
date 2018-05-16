package service;

import java.util.List;

import entity.Admin;

public interface AdminService {

	// 登录方法
	public boolean login(Admin admin) throws Exception;

	// 查询全部
	public List<Admin> show() throws Exception;

	// 添加方法
	public void insert(Admin admin) throws Exception;

	// 删除方法
	public void delete(int id) throws Exception;

	// 根据ID查询方法
	public List edit(int id) throws Exception;

	// 编辑方法
	public void editdo(Admin admin) throws Exception;

}
