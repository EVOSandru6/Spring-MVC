package edu.project.springmvc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Пользователь
 */
@Entity
@Table(name = "users")
public class User {
    //Поля
    @Id
    @Column(name = "username", nullable = false,length = 64)
    private String username;

    @Column(name = "password",nullable = false,length = 64)
    private String password;

    @Column(name = "enabled",nullable = false)
    private boolean enabled;

    //Конструкторы
    public User() {}

    public User(String username, String password, boolean enabled) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
    }

    //Геттеры сеттеры
    public String getUsername() {return username;}
    public void setUsername(String username) {this.username = username;}
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
    public boolean isEnabled() {return enabled;}
    public void setEnabled(boolean enabled) {this.enabled = enabled;}
}
