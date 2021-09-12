package com.productioncontMang.project.service;

import com.productioncontMang.project.entity.Project;
import com.productioncontMang.project.repository.ProjectRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;


@Service
@Slf4j
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveProject(Project project) {
        log.info("Inside saveProject of projectservice");
        return projectRepository.save(project);
    }
    
    public Project findByprojectId(Long projectId) {
        log.info("Inside findByprojectId of projectservice");
        return projectRepository.findByProjectId(projectId);
    }
    
    
    public @ResponseBody Iterable<Project> getAllproject() {
       return projectRepository.findAll();
    }
}
