package com.fabiokusaba.bookstore.services

import com.fabiokusaba.bookstore.domain.BookSummary
import com.fabiokusaba.bookstore.domain.entities.BookEntity

interface BookService {

    fun createUpdate(isbn: String, bookSummary: BookSummary): Pair<BookEntity, Boolean>

    fun list(): List<BookEntity>
}