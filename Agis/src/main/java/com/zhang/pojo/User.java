/**
 * 
 */
package com.zhang.pojo;

/**
 * @author AndyBerg
 *
 */
public class User {
	
	private String user_password;
	private String user_name;
	private int user_power;
	private String user_QQ;
	public User(String user_password, String user_name, int user_power,String user_QQ) {
		super();
		this.user_password = user_password;
		this.user_name = user_name;
		this.user_power = user_power;
		this.user_QQ = user_QQ;
	}
	public String getUser_QQ() {
		return user_QQ;
	}
	public void setUser_QQ(String user_QQ) {
		this.user_QQ = user_QQ;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public int getUser_power() {
		return user_power;
	}
	public void setUser_power(int user_power) {
		this.user_power = user_power;
	}
	@Override
	public String toString() {
		return "User [user_password=" + user_password + ", user_name="
				+ user_name + ", user_power=" + user_power + "]";
	}
	

}
