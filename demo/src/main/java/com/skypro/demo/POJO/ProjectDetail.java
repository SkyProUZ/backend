package com.skypro.demo.POJO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProjectDetail {
    private String freelancerName;
    private String employerName;
    private Long freelancerId;
    private Long employerId;
    private String projectTitle;
    private Long projectId;
    private String projectDescription;
    private String projectSkill;
    private String projectPeriod;
    private String projectBudget;
    private Long bidCount;
    private Double averageBid;
    private String documentPath;
    private Long documentId;
    private String endDate;
    private String bidAmount;
    private String bidStatus;
}
