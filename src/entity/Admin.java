package entity;

public class Admin {
	/*
	 * 设置私有属性
	 */
	private int id;
	private String name;
	private String password;
	/*
	 * 设置get set方法
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	/*
	 * 设置ToString方法
	 */
	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	
}

