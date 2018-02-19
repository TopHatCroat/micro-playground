package com.github.tophatcroat.profileservice

import com.github.tophatcroat.profileservice.domain.Profile
import com.github.tophatcroat.profileservice.domain.ProfileRepository
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.context.support.beans

@SpringBootApplication
class ProfileServiceApplication

fun main(args: Array<String>) {
    SpringApplicationBuilder()
            .sources(ProfileServiceApplication::class.java)
            .initializers(beans {
//                bean {
//                    ApplicationRunner {
//
//                        listOf(Profile(0, "Pero", "Peric", ""),
//                                Profile(0, "Mirko", "Mirkić", ""),
//                                Profile(0, "Radojka", "Zakunić", ""))
//                                .forEach {
//                                    ref<ProfileRepository>().save(it)
//                                }
//                    }
//                }
            })
            .run(*args)
}
