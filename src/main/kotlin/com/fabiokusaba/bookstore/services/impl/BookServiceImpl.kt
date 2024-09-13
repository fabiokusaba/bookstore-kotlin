package com.fabiokusaba.bookstore.services.impl

import com.fabiokusaba.bookstore.domain.BookSummary
import com.fabiokusaba.bookstore.domain.entities.BookEntity
import com.fabiokusaba.bookstore.repositories.AuthorRepository
import com.fabiokusaba.bookstore.repositories.BookRepository
import com.fabiokusaba.bookstore.services.BookService
import com.fabiokusaba.bookstore.toBookEntity
import jakarta.transaction.Transactional
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class BookServiceImpl(
    val bookRepository: BookRepository,
    val authorRepository: AuthorRepository
) : BookService {

    @Transactional
    override fun createUpdate(isbn: String, bookSummary: BookSummary): Pair<BookEntity, Boolean> {
        val normalisedBook = bookSummary.copy(isbn = isbn)
        val isExists = bookRepository.existsById(isbn)

        val author = authorRepository.findByIdOrNull(normalisedBook.author.id)
        checkNotNull(author)

        val savedBook = bookRepository.save(normalisedBook.toBookEntity(author))
        return Pair(savedBook, !isExists)
    }
}