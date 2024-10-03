package com.example.mappings.repository

import com.example.mappings.entity.Instructor
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.stereotype.Repository

@EnableJpaRepositories
@Repository
interface Instructor : JpaRepository<Instructor, Long>
