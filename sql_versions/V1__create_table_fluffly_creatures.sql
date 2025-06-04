CREATE TABLE fluffy_creatures (
    id BIGINT,
    name VARCHAR(100) NOT NULL,
    species VARCHAR(50) NOT NULL,
    age INT,
    description TEXT,
    created_at TIMESTAMP DEFAULT NOW(),
    updated_at TIMESTAMP DEFAULT NOW()
);

ALTER TABLE fluffy_creatures
ADD CONSTRAINT fluffy_id PRIMARY KEY (id);
