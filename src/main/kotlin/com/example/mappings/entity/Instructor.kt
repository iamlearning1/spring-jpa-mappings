package com.example.mappings.entity

import jakarta.persistence.*

@Entity
@Table(name = "instructor")
data class Instructor(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,
    val firstName: String,
    val lastName: String,
    val email: String,

    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "instructor_detail_id", referencedColumnName = "id")
    val instructorDetail: InstructorDetail
)
