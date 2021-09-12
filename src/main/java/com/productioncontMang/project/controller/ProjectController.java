package com.productioncontMang.project.controller;


import com.productioncontMang.project.entity.Project;
import com.productioncontMang.project.entity.ProjectCategory;
import com.productioncontMang.project.service.ProjectCategoryService;
import com.productioncontMang.project.service.ProjectService;


import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/project")
@Slf4j
public class ProjectController {

    @Autowired
    private ProjectService projectService;
    @Autowired
    private ProjectCategoryService projectCategoryService;

    @PostMapping("/")
    public Project saveProject(@RequestBody Project project) {
        log.info("Inside saveProject of ProjectController");
        return projectService.saveProject(project);
    }

    @PostMapping("/category")
    public ProjectCategory saveProjectCategory(@RequestBody ProjectCategory projectCategory) {
        log.info("Inside saveProjectCategory of ProjectController");
        return projectCategoryService.saveProjectCategory(projectCategory);
    }
    @GetMapping("/{id}")
    public Project findProjectById(@PathVariable("id") Long projectId) {
        log.info("Inside findProjectById method of ProjectController");
        return projectService.findByprojectId(projectId);
    }
    @GetMapping(path="/all")
    public List<Iterable<Project>> findProject() {
    	log.info("Inside findProject of ProjectController");
    	return Arrays.asList(projectService.getAllproject()
				);
    }
   
    @GetMapping(path="/allcat")
    public List<Iterable<ProjectCategory>> findCategory() {
    	log.info("Inside findCategory of ProjectController");
    	return Arrays.asList(projectCategoryService.getAllproject()
				);
    }

}
