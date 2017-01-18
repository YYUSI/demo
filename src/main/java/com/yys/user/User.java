package com.yys.user;

public class User {
    private long id =0L;
    private String username="";
    private String  wechatid="";
    private String email="";
     
   public User(String name){
     this.username=name;	 
   }

@Override
public String toString() {
	return "user [id=" + id + ", username=" + username + ", wechatid=" + wechatid + ", email=" + email + "]";
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getWechatid() {
	return wechatid;
}

public void setWechatid(String wechatid) {
	this.wechatid = wechatid;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}
   
   
}