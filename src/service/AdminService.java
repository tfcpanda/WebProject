package service;

import java.util.List;

import entity.Admin;

public interface AdminService {
	
	//��¼����
		public boolean login(Admin admin) throws Exception;
		//��ѯ����
		public List<Admin> show() throws Exception;
		//��ӷ��� 
		public void insert(Admin admin) throws Exception;
		//ɾ������
		public void delete(int id) throws Exception;
		//��ID��ѯ������¼
		public List edit(int id) throws Exception;
		//���·���
		public void editdo(Admin admin)throws Exception;

}
