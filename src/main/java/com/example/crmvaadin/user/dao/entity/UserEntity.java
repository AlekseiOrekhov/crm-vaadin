package com.example.crmvaadin.user.dao.entity;
import lombok.*;

import javax.persistence.*;


@Data
@Entity
@RequiredArgsConstructor
public class UserEntity  {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String userName;

    private String password;
}
