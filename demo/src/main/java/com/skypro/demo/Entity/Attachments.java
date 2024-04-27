package com.skypro.demo.Entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@Entity
@Table(name = "attachments")
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Attachments implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String link;


    public Attachments(String link) {
        this.link = link;
    }
}
