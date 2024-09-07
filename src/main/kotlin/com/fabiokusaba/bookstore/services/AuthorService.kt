package com.fabiokusaba.bookstore.services

import com.fabiokusaba.bookstore.domain.entities.AuthorEntity

interface AuthorService {
    fun save(authorEntity: AuthorEntity) : AuthorEntity

    fun list() : List<AuthorEntity>
}