package me.mamakari.server.repository;

import me.mamakari.server.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// JpaRepository を継承(extends)することで、findAll() などの魔法が使えるようになります
public interface PostRepository extends JpaRepository<Post, Integer> {
}