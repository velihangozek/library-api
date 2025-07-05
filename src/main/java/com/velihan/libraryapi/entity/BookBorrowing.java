package com.velihan.libraryapi.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "book_borrowings")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookBorrowing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String borrowerName;

    @Column(nullable = false)
    private String borrowerEmail;

    @Column(nullable = false)
    private LocalDate borrowingDate;

    private LocalDate returnDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;
}
