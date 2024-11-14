CREATE SEQUENCE IF NOT EXISTS bookmark_id_seq START WITH 1 INCREMENT BY 50;

CREATE TABLE bookmarks
(
    id         BIGINT                      NOT NULL,
    updated_at TIMESTAMP WITHOUT TIME ZONE,
    title      VARCHAR(200)                NOT NULL,
    url        VARCHAR(500)                NOT NULL,
    created_at TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    CONSTRAINT pk_bookmarks PRIMARY KEY (id)
);