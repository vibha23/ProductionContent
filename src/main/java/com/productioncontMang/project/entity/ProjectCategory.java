package com.productioncontMang.project.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "projectCategory")
@AllArgsConstructor
@NoArgsConstructor
public class ProjectCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long projectCategoryId;
    @Column(nullable = false, unique = true, length = 100)
    private String categoryName;
        
}
