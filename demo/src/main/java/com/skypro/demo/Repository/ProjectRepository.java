package com.skypro.demo.Repository;


import com.skypro.demo.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

    @Query(value = "select c.name,sub1.* from (select a.id,a.freelancer_id,a.employer_id,a.title,a.main_skill_id,a.budget_range," +
            "a.budget_period,COALESCE(avg(b.bid_amount),0) as average ,count(b.project_id) as count from project a left outer " +
            "join bid b on a.id=b.project_id group by a.id,a.title) as sub1,user c where c.id=sub1.employer_id and" +
            " employer_id!= :userId and sub1.freelancer_id IS NULL", nativeQuery = true)
    List<Project> getRequired(Long userId);

}
