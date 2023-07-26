package com.example.crmvaadin.user.dao.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "T_GENERATOR")
public class UserEntity extends BaseEntityId {
//    @Id
//    @TableGenerator(name="TABLE_GEN",table="T_GENERATOR", pkColumnName = "GEN_KEY", pkColumnValue = "userId", valueColumnName = "GEN_VALUE", initialValue = 1, allocationSize = 1 )
//    @GeneratedValue(strategy = GenerationType.TABLE, generator="TABLE_GEN")
//    private Long id;

    private String userName;

    private String password;
}
