package com.example.mappings.repository

import com.example.mappings.entity.InstructorDetail
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.stereotype.Repository

@EnableJpaRepositories
@RepositoryRestResource(collectionResourceRel = "instructor-details", path = "instructor-details")
@Repository
interface InstructorDetail : JpaRepository<InstructorDetail, Long>
