package com.fabiokusaba.bookstore

import com.fabiokusaba.bookstore.domain.AuthorUpdateRequest
import com.fabiokusaba.bookstore.domain.dto.AuthorDto
import com.fabiokusaba.bookstore.domain.dto.AuthorUpdateRequestDto
import com.fabiokusaba.bookstore.domain.entities.AuthorEntity
import com.fabiokusaba.bookstore.domain.entities.BookEntity

fun testAuthorDtoA(id: Long? = null) = AuthorDto(
    id = id,
    name = "John Doe",
    age = 30,
    description = "Some description",
    image = "author-image.jpeg"
)

fun testAuthorEntityA(id: Long? = null) = AuthorEntity(
    id = id,
    name = "John Doe",
    age = 30,
    description = "Some description",
    image = "author-image.jpeg"
)

fun testAuthorEntityB(id: Long? = null) = AuthorEntity(
    id = id,
    name = "Don Joe",
    age = 65,
    description = "Some other description",
    image = "some-other-image.jpeg"
)

fun testAuthorUpdateRequestDtoA(id: Long? = null) = AuthorUpdateRequestDto(
    id = id,
    name = "John Doe",
    age = 30,
    description = "Some description",
    image = "author-image.jpeg"
)

fun testAuthorUpdateRequestA(id: Long? = null) = AuthorUpdateRequest(
    id = id,
    name = "John Doe",
    age = 30,
    description = "Some description",
    image = "author-image.jpeg"
)

fun testBookEntityA(isbn: String, author: AuthorEntity) = BookEntity(
    isbn = isbn,
    title = "Test Book A",
    description = "A test book",
    image = "book-image.jpeg",
    authorEntity = author
)