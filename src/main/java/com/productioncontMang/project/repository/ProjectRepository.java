package com.productioncontMang.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productioncontMang.project.entity.Project;

@Repository
public interface ProjectRepository  extends JpaRepository<Project,Long> {
    Project findByProjectId(Long projectId);
}
