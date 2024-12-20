package org.learning.flywaymigrationspring.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Entity
@Table(name = "bookmarks")
public class Bookmark {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bookmarks_id_gen")
    @SequenceGenerator(name = "bookmarks_id_gen", sequenceName = "bookmark_id_seq")
    @Column(name = "id", nullable = false)
    private Long id;
    @Size(max = 200)
    @NotNull
    @Column(name = "title", nullable = false, length = 200)
    private String title;
    @Size(max = 500)
    @NotNull
    @Column(name = "url", nullable = false, length = 500)
    private String url;
    @NotNull
    @ColumnDefault("now()")
    @Column(name = "created_at", nullable = false)
    private Instant createdAt;
    @Column(name = "updated_at")
    private Instant updatedAt;
    // setters & getters

    @ColumnDefault("'DRAFT'")
    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "published_at")
    private Instant publishedAt;

    public Instant getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Instant publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Bookmark() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @Size(max = 200) @NotNull String getTitle() {
        return title;
    }

    public void setTitle(@Size(max = 200) @NotNull String title) {
        this.title = title;
    }

    public @Size(max = 500) @NotNull String getUrl() {
        return url;
    }

    public void setUrl(@Size(max = 500) @NotNull String url) {
        this.url = url;
    }

    public @NotNull Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(@NotNull Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }
}