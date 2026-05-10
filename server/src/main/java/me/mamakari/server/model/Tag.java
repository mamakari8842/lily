package me.mamakari.server.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "tags")
@Data
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer likeId;

    private Integer postId;
    private String userId;

    @Column(name = "created_at",updatable = false)
    private LocalDateTime createdAt;
}
