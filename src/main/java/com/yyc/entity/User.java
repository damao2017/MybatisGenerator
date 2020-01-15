package com.yyc.entity;

import java.io.Serializable;

/**
* @description 数据表sys_user映射
* @author ntdm
* @date 2020-01-15 17:28:27
*/
public class User implements Serializable {
    /**
	* 字段注释：用户id
	* 列名:id 类型:INTEGER(10) 允许空:false 缺省值:null
	*/
    private Integer id;

    /**
	* 字段注释：用户姓名
	* 列名:name 类型:VARCHAR(50) 允许空:true 缺省值:null
	*/
    private String name;

    /**
	* 字段注释：用户年龄
	* 列名:user_age 类型:INTEGER(10) 允许空:true 缺省值:null
	*/
    private Integer userAge;

    private static final long serialVersionUID = 1L;

    public User(Integer id, String name, Integer userAge) {
        this.id = id;
        this.name = name;
        this.userAge = userAge;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", userAge=").append(userAge);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}