package com.productioncontMang.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.productioncontMang.project.entity.Project;
import com.productioncontMang.project.entity.ProjectCategory;
import com.productioncontMang.project.repository.ProjectCategoryRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProjectCategoryService {
	@Autowired
	ProjectCategoryRepository projectCategoryRepository;
	
	public ProjectCategory saveProjectCategory(ProjectCategory projectCategory) {
        log.info("Inside saveProjectCategory of ProjectCategoryService");
        return projectCategoryRepository.save(projectCategory);
    }
	
	public @ResponseBody Iterable<ProjectCategory> getAllproject() {
		log.info("Inside getAllproject of ProjectCategoryService");
	      return projectCategoryRepository.findAll();
	    }
}
