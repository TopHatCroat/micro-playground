package com.github.tophatcroat.profileservice.domain

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.data.rest.core.annotation.RestResource
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Profile(
        @Id @GeneratedValue private val id: Long = 0,
        var firstName: String = "",
        var lastName: String = "",
        var imageSrc: String = ""
)

@RepositoryRestResource
interface ProfileRepository : JpaRepository<Profile, Long> {
    @RestResource(path = "/by-name")
    fun findByFirstNameAndLastName(firstName: String, lastName: String): Collection<Profile>
}