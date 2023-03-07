DROP TABLE IF EXISTS Person;

CREATE TABLE person (
    id SERIAL PRIMARY KEY NOT NULL,
    name VARCHAR(15),
    lastname VARCHAR(15),
    birthdate DATE
);