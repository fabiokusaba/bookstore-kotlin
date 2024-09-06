package com.fabiokusaba.bookstore

import com.fabiokusaba.bookstore.domain.dto.AuthorDto

fun testAuthorDtoA(id: Long? = null) = AuthorDto(
    id = id,
    name = "John Doe",
    age = 30,
    description = "Some description",
    image = "author-image.jpeg"
)
