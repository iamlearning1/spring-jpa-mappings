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
    ], fetch = FetchType.LAZY)
    @JoinColumn(
        name = "instructor_id",
        nullable = false,
        referencedColumnName = "id"
    )
    val instructor: Instructor,

    @OneToMany(cascade = [CascadeType.ALL], fetch = FetchType.LAZY, mappedBy = "course")
    val reviews: List<Review> = emptyList(),

    @ManyToMany(cascade = [
        CascadeType.DETACH,
        CascadeType.MERGE,
        CascadeType.PERSIST,
        CascadeType.REFRESH
    ], fetch = FetchType.LAZY)
    @JoinTable(
        name = "courses_taken",
        joinColumns = [JoinColumn(name = "course_id")],
        inverseJoinColumns = [JoinColumn(name = "student_id")]
    )
    val students: List<Student> = emptyList(),
)
