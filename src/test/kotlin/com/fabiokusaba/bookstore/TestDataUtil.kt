package com.fabiokusaba.bookstore

import com.fabiokusaba.bookstore.domain.dto.AuthorDto
import com.fabiokusaba.bookstore.domain.dto.AuthorUpdateRequestDto
import com.fabiokusaba.bookstore.domain.entities.AuthorEntity

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
    id = 999L,
    name = "John Doe",
    age = 30,
    description = "Some description",
    image = "some-image.jpeg"
)