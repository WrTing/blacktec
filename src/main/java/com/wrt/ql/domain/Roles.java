package com.wrt.ql.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="T_ROLES")
public class Roles {
    @Id
    @Column(name="ROLE_ID")
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid",strategy = "uuid")
    private String id;
    @Column(name="ROLE_NAMES")
    private String names;

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }
}
