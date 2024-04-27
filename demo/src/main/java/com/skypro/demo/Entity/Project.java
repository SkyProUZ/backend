package com.skypro.demo.Entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@Entity
@Table(name = "project")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt"},
        allowGetters = true)
@Getter
@Setter
public class Project implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "employer_id")
    private Long employerId;

    @Column(name = "freelancer_id")
    private Long freelancerId;

    @NotBlank
    private String title;

    @NotBlank
    private String description;

    @NotBlank
    @Column(name = "main_skill_id")
    private String skill;

    @NotBlank
    @Column(name = "budget_range")
    private String range;

    @NotBlank
    @Column(name = "budget_period")
    private String period;

    @Column(name = "date_posted",nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(name="end_date")
    private String endDate;

    private Long document_id;

    public Project(){

    }
    public Project(@NotNull Long employerId,@NotBlank String title, @NotBlank String description, @NotBlank String skill, @NotBlank String range, @NotBlank String period, @NotBlank Long document_id) {
        this.employerId = employerId;
        this.title = title;
        this.description = description;
        this.skill = skill;
        this.range = range;
        this.period = period;
        this.document_id = document_id;
    }

}
