package com.fabiokusaba.bookstore.services

import com.fabiokusaba.bookstore.domain.BookSummary
import com.fabiokusaba.bookstore.domain.BookUpdateRequest
import com.fabiokusaba.bookstore.domain.entities.BookEntity

interface BookService {

    fun createUpdate(isbn: String, bookSummary: BookSummary): Pair<BookEntity, Boolean>

    fun list(authorId: Long? = null): List<BookEntity>

    fun get(isbn: String): BookEntity?

    fun partialUpdate(isbn: String, bookUpdateRequest: BookUpdateRequest): BookEntity

    fun delete(isbn: String)
}