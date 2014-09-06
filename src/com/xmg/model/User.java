package com.xmg.model;

import java.util.Date;

/*
 * @Description :登陆的用户
 * @FileName: User.java
 * @Author :WeiHui.Zhang
 * @Data : 2014年8月21日 下午9:20:31
 * @Version:1.0.0
 */
public class User {

	private Integer id;
	private String userName;// 用户名
	private String password;// 密码
	private Date signDate; // 注册日期
	private Date loginDate; // 登陆日期

	public User() {
		super();
	}

	public User(Integer id, String userName, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
	}

	public User(Integer id, String userName, String password, Date signDate,
			Date loginDate) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.signDate = signDate;
		this.loginDate = loginDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getSignDate() {
		return signDate;
	}

	public void setSignDate(Date signDate) {
		this.signDate = signDate;
	}

	public Date getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password="
				+ password + ", signDate=" + signDate + ", loginDate="
				+ loginDate + "]";
	}

}
