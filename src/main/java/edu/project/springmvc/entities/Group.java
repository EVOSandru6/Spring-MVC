package edu.project.springmvc.entities;

import javax.persistence.*;

/**
 * Группа ролей
 */
@Entity
@Table(name = "groups")
public class Group {
    //Поля
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "group_name",nullable = false,length = 50)
    private String groupName;

    //Конструкторы
    public Group() {}
    public Group(String groupName) {this.groupName = groupName;}

    //Геттеры и сеттеры
    public long getId() {return id;}
    public void setId(long id) {this.id = id;}
    public String getGroupName() {return groupName;}
    public void setGroupName(String groupName) {this.groupName = groupName;}
}
