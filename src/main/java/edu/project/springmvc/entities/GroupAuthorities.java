package edu.project.springmvc.entities;

import javax.persistence.*;

/**
 * Права для каждой группы ролей
 */
@Entity
@Table(name = "group_authorities")
public class GroupAuthorities {
    //Поля
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //Группа
    @ManyToOne
    @JoinColumn(name = "group_id",nullable = false)
    private Group group;

    //Роль для группы (ROLE_ADMIN, ROLE_USER)
    @Column(name = "authority")
    private String authority;

    //Конструкторы
    public GroupAuthorities() {}

    public GroupAuthorities(Group group, String authority) {
        this.group = group;
        this.authority = authority;
    }

    //Геттеры и сеттеры
    public long getId() {return id;}
    public Group getGroup() { return group; }
    public void setGroup(Group groupID) {this.group = groupID;}
    public String getAuthority() {return authority;}
    public void setAuthority(String authority) {this.authority = authority;}
}
