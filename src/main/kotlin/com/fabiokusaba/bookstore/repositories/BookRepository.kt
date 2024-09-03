package com.fabiokusaba.bookstore.repositories

import com.fabiokusaba.bookstore.domain.Book
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository : JpaRepository<Book, String> {
}