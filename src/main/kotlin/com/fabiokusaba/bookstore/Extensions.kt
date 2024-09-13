package com.fabiokusaba.bookstore

import com.fabiokusaba.bookstore.domain.AuthorSummary
import com.fabiokusaba.bookstore.domain.AuthorUpdateRequest
import com.fabiokusaba.bookstore.domain.BookSummary
import com.fabiokusaba.bookstore.domain.dto.AuthorDto
import com.fabiokusaba.bookstore.domain.dto.AuthorSummaryDto
import com.fabiokusaba.bookstore.domain.dto.AuthorUpdateRequestDto
import com.fabiokusaba.bookstore.domain.dto.BookSummaryDto
import com.fabiokusaba.bookstore.domain.entities.AuthorEntity
import com.fabiokusaba.bookstore.domain.entities.BookEntity

fun AuthorEntity.toAuthorDto() = AuthorDto(
    id = this.id,
    name = this.name,
    age = this.age,
    description = this.description,
    image = this.image
)

fun AuthorDto.toAuthorEntity() = AuthorEntity(
    id = this.id,
    name = this.name,
    age = this.age,
    description = this.description,
    image = this.image
)

fun AuthorUpdateRequestDto.toAuthorUpdateRequest() = AuthorUpdateRequest(
    id = this.id,
    name = this.name,
    age = this.age,
    description = this.description,
    image = this.image
)

fun BookSummary.toBookEntity(author: AuthorEntity) = BookEntity(
    isbn = this.isbn,
    title = this.title,
    description = this.description,
    image = this.image,
    authorEntity = author
)

fun AuthorSummaryDto.toAuthorSummary() = AuthorSummary(
    id = this.id,
    name = this.name,
    image = this.image
)

fun AuthorEntity.toAuthorSummaryDto(): AuthorSummaryDto {
    val authorId = this.id
    checkNotNull(authorId)
    return AuthorSummaryDto(
        id = authorId,
        name = this.name,
        image = this.image
    )
}

fun BookSummaryDto.toBookSummary() = BookSummary(
    isbn = this.isbn,
    title = this.title,
    description = this.description,
    image = this.image,
    author = this.author.toAuthorSummary()
)

fun BookEntity.toBookSummaryDto() = BookSummaryDto(
    isbn = this.isbn,
    title = this.title,
    description = this.description,
    image = this.image,
    author = authorEntity.toAuthorSummaryDto()
)