CREATE TABLE category(
    id_category SERIAL PRIMARY KEY,
    name VARCHAR(100)
);

CREATE TABLE book(
    id_book SERIAL PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    author VARCHAR(100) NOT NULL,
    publisher VARCHAR(100),
    release_date VARCHAR(20),
    isbn VARCHAR(20),
    id_category INT NOT NULL,
    FOREIGN KEY (id_category) REFERENCES category (id_category),
    images VARCHAR(100)
);