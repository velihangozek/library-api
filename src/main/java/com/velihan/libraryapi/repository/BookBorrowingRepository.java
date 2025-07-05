package com.velihan.libraryapi.repository;

import com.velihan.libraryapi.entity.BookBorrowing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookBorrowingRepository extends JpaRepository<BookBorrowing, Long> {
}