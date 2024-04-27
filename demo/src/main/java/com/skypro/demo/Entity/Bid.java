package com.skypro.demo.Entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.validation.constraints.NotBlank;

import java.io.Serializable;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@Entity
@Table(name = "bid")
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Bid implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "user_id")
    private Long userId;

    @NotNull
    @Column(name = "project_id")
    private Long projectId;

    @NotBlank
    private String bid_period;

    @NotBlank
    private String bid_amount;

    @NotBlank
    private String bid_status;

    public Bid(){

    }

    public Bid(Long id, @NotNull Long userId, @NotNull Long projectId, @NotBlank String bid_period, @NotBlank String bid_amount, @NotBlank String bid_status) {
        this.id = id;
        this.userId = userId;
        this.projectId = projectId;
        this.bid_period = bid_period;
        this.bid_amount = bid_amount;
        this.bid_status = bid_status;
    }


}
