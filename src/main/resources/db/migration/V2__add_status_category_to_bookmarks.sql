ALTER TABLE bookmarks
    ADD status VARCHAR(255) DEFAULT 'DRAFT';

ALTER TABLE bookmarks
    ALTER COLUMN status SET NOT NULL;