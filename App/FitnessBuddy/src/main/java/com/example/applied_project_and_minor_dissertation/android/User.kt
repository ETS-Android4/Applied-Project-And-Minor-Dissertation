package com.example.applied_project_and_minor_dissertation.android

import kotlinx.serialization.Serializable

@Serializable
data class User( val username: String,
                 val email: String?,
                 val password: String,
)