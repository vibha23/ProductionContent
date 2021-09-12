package com.productioncontMang.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productioncontMang.project.entity.ProjectCategory;

@Repository
public interface ProjectCategoryRepository extends JpaRepository<ProjectCategory,Long> {


}
