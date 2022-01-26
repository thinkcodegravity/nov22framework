package com.strut;

import java.util.ArrayList;

public class LoginStrutAction {
	public String pwd;
	public String userid;
	public String userAvailable() {
		ArrayList<String> registeredNames=new ArrayList<String> ();
		registeredNames.add("john");
		registeredNames.add("jane");
		if(registeredNames.contains(userid))
			return "bad";
		else
			return "good";
	}
	public String checkUser() {
		if(userid.equals("john") && pwd.equals("john1!"))
			return "good";
		else
			return "bad";
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
