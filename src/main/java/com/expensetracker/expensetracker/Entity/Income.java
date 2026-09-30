package com.expensetracker.expensetracker.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Income")
public class Income {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="user_id",nullable = false)
    private User user;

    @Column(nullable = false)
    private String source;
    @Column(nullable = false)
    private Double amount;
    @Column(nullable = false)
    private LocalDate incomeDate;
    @Column
    private String description;
    @Column(nullable = false)
    private LocalDateTime createdAt;
}
