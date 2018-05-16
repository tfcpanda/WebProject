package action;

import com.opensymphony.xwork2.ActionSupport;

import entity.Admin;
import service.impl.AdminServiceImpl;

public class AdminAction extends ActionSupport {
	/*
	 * 创建实体类对象，服务类对象，idֵ
	 */
	private int AdminId;
	private Admin entityAdmin = new Admin();
	private AdminServiceImpl adm = new AdminServiceImpl();

	/*
	 * get set方法
	 */
	public int getAdminId() {
		return AdminId;
	}

	public void setAdminId(int adminId) {
		AdminId = adminId;
	}

	public Admin getEntityAdmin() {
		return entityAdmin;
	}

	public void setEntityAdmin(Admin entityAdmin) {
		this.entityAdmin = entityAdmin;
	}

	public AdminServiceImpl getAdm() {
		return adm;
	}

	public void setAdm(AdminServiceImpl adm) {
		this.adm = adm;
	}

	public String login() {
		try {
			if (adm.login(entityAdmin)) {
				return "success";
			} else {
				return "input";
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}

}
