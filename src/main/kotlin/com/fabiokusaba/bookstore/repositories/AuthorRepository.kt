package com.fabiokusaba.bookstore.repositories

import com.fabiokusaba.bookstore.domain.Author
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AuthorRepository : JpaRepository<Author, Long?> {
}