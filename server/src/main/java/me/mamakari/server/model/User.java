package me.mamakari.server.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    private String userId; // VARCHAR(50) なので String。自動採番は不要です。

    private String userName;
    private String email;
    private String role;

    @Column(name = "is_active")
    private Boolean isActive = true;
}