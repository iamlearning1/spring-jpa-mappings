package com.example.mappings.entity

import jakarta.persistence.*

@Entity
@Table(name = "instructor_detail")
data class InstructorDetail(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,
    val youtubeChannel: String,
    val hobby: String,
    @OneToOne(mappedBy = "instructorDetail")
    val instructor: Instructor
)
