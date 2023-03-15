package com.example.crmvaadin.orders.dao.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class OrderEntity {
    @Id
    @TableGenerator(name="TABLE_GEN",table="T_GENERATOR", pkColumnName = "GEN_KEY", pkColumnValue = "orderId", valueColumnName = "GEN_VALUE", initialValue = 1, allocationSize = 1 )
    @GeneratedValue(strategy = GenerationType.TABLE, generator="TABLE_GEN")
    private Long id;

    private String name;

    private Date createdAt;

    private Date updatedAt;
}
