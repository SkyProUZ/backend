package com.skypro.demo.Entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@Entity
@Table(name = "user")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt"},
        allowGetters = true)
@Getter
@Setter
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String email;



    @NotBlank
    private String password;


    private Long phone;
    private String about;
    private Long profile_id;
    private String skills;

    @Column(name = "registration",nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

//    @Column(nullable = false)
//    @Temporal(TemporalType.TIMESTAMP)
//    @LastModifiedDate
//    private Date updatedAt;

    public User() {
    }

    public User(String name, String email, String password) {

        this.name = name;
        this.email = email;
        this.password = password;
    }

    public User(String name, String email, String password, long phone, String about, String skills) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.about = about;
        this.skills = skills;
    }
}
