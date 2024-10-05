package com.example.mappings.entity

import jakarta.persistence.*

@Entity
@Table(name = "student")
data class Student(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long,
    var firstName: String,
    var lastName: String,
    var email: String,

    @ManyToMany(
        cascade = [
            CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH
        ], fetch = FetchType.LAZY
    )
    @JoinTable(
        name = "courses_taken",
        joinColumns = [JoinColumn(name = "student_id")],
        inverseJoinColumns = [JoinColumn(name = "course_id")]
    )
    val courses: List<Course> = emptyList(),
)
