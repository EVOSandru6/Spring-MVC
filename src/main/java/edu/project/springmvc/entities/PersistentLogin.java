package edu.project.springmvc.entities;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Запомнить меня
 */
@Entity
@Table(name = "persistent_logins")
public class PersistentLogin {
    //Поля
    @Column(name = "username",nullable = false,length = 50)
    private String username;

    @Id
    @Column(name = "series",nullable = false,length = 50)
    private String series;

    @Column(name = "token",nullable = false,length = 50)
    private String token;

    @Column(name = "last_used")
    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    private Date lastUsed;

    //Коснтрукторы
    public PersistentLogin() {}

    public PersistentLogin(String username, String series, String token, Date lastUsed) {
        this.username = username;
        this.series = series;
        this.token = token;
        this.lastUsed = lastUsed;
    }

    //Геттеры сеттеры
    public String getUsername() {return username;}
    public void setUsername(String username) {this.username = username;}
    public String getSeries() {return series;}
    public void setSeries(String series) {this.series = series;}
    public String getToken() {return token;}
    public void setToken(String token) {this.token = token;}
    public Date getLastUsed() {return lastUsed;}
    public void setLastUsed(Date lastUsed) {this.lastUsed = lastUsed;}
}
