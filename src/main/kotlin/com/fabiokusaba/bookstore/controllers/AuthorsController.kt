package com.fabiokusaba.bookstore.controllers

import com.fabiokusaba.bookstore.domain.dto.AuthorDto
import com.fabiokusaba.bookstore.services.AuthorService
import com.fabiokusaba.bookstore.toAuthorDto
import com.fabiokusaba.bookstore.toAuthorEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class AuthorsController(private val authorService: AuthorService) {

    @PostMapping(path = ["/v1/authors"])
    fun createAuthor(@RequestBody authorDto: AuthorDto) : AuthorDto {
        return authorService.save(authorDto.toAuthorEntity()).toAuthorDto()
    }
}