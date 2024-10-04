package com.example.mappings.entity

import jakarta.persistence.*

@Entity
@Table(name = "course")
data class Course(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,
    val title: String,

    @ManyToOne(cascade = [
        CascadeType.DETACH,
        CascadeType.MERGE,
        CascadeType.PERSIST,
        CascadeType.REFRESH
    ])
    @JoinColumn(
        name = "instructor_id",
        nullable = false,
        referencedColumnName = "id"
    )
    val instructor: Instructor
)
