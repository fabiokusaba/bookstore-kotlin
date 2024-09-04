package com.fabiokusaba.bookstore.repositories

import com.fabiokusaba.bookstore.domain.BookEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository : JpaRepository<BookEntity, String> {
}