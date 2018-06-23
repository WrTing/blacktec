package com.wrt.ql.domain;

import org.apache.ibatis.type.Alias;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="T_USER")
public class User implements Serializable {
    @Id
    @Column(name="USER_ID")
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid",strategy="uuid")
    private String user_id;
    @Column(name="USER_NAME")
    private String username;
    @Column(name="PASSWORD")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
