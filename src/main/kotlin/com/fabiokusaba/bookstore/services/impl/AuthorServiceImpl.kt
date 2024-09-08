package com.fabiokusaba.bookstore.services.impl

import com.fabiokusaba.bookstore.domain.entities.AuthorEntity
import com.fabiokusaba.bookstore.repositories.AuthorRepository
import com.fabiokusaba.bookstore.services.AuthorService
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class AuthorServiceImpl(private val authorRepository: AuthorRepository) : AuthorService {

    override fun save(authorEntity: AuthorEntity): AuthorEntity {
        return authorRepository.save(authorEntity)
    }

    override fun list(): List<AuthorEntity> {
        return authorRepository.findAll()
    }

    override fun get(id: Long): AuthorEntity? {
        return authorRepository.findByIdOrNull(id)
    }
}