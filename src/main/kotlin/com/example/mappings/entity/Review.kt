package com.example.mappings.entity

import jakarta.persistence.*

@Entity
@Table(name = "review")
data class Review(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,
    val comment: String,

    @ManyToOne(cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id", referencedColumnName = "id")
    val course: Course,
)
