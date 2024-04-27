package com.skypro.demo.Service;

import com.skypro.demo.Entity.Project;
import com.skypro.demo.Repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class ProjectService{

    private final ProjectRepository projectRepository;
    private static final Logger logger = LoggerFactory.getLogger(BidService.class);

    public Project findById(long id) {
        Optional<Project> exist = projectRepository.findById(id);
        if(exist.isPresent()){
            return exist.get();
        }else{
            return null;
        }
    }

    public Project save(Project project) {
        Project p = projectRepository.save(project);
        return p;
    }

    public Iterable<Project> getAllProjects(){
        return projectRepository.findAll();
    }

}

