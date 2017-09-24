package edu.project.springmvc.entities;

import javax.persistence.*;

/**
 * Принадлежность пользователя к группе ролей
 */
@Entity
@Table(name = "group_members")
public class GroupMember {
    //Поля
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    //Пользователь
    @ManyToOne
    @JoinColumn(name = "username",nullable = false)
    private User user;

    //Группа ролей
    @ManyToOne
    @JoinColumn(name = "group_id",nullable = false)
    private Group group;

    //Конструкторы
    public GroupMember() {}
    public GroupMember(User user, Group group) {
        this.user = user;
        this.group = group;
    }

    //Геттеры и сеттеры
    public long getId() {return id;}
    public void setId(long id) {this.id = id;}
    public User getUser() {return user;}
    public void setUser(User user) {this.user = user;}
    public Group getGroup() {return group;}
    public void setGroup(Group group) {this.group = group;}
}
