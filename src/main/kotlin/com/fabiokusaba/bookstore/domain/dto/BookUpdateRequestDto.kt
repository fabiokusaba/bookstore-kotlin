package com.fabiokusaba.bookstore.domain.dto

data class BookUpdateRequestDto(
    val title: String?,
    val description: String?,
    val image: String?
) {
}