DROP TABLE IF EXISTS Shop;

CREATE TABLE IF NOT EXISTS Shop(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    street VARCHAR(255) NOT NULL,
    city VARCHAR(255) NOT NULL,
    country VARCHAR(255) NOT NULL
);

insert into Shop values (1,'Bookworms Emporia','123 Main Street','New York','USA');
insert into Shop values (2, 'Literary Haven', '456 Oak Avenue', 'London', 'UK');
insert into Shop values (3, 'PageTurner Books', '789 Maple Drive', 'Paris', 'France');
insert into Shop values (4, 'Booktopia', '111 Baker Street', 'Sydney', 'Australia');
insert into Shop values (5, 'Book Haven', '789 Piazza Navona', 'Rome', 'Italy');
insert into Shop values (6, 'Readers Corner', '23 Alexanderplatz', 'Berlin', 'Germany');

insert into BOOK (TITLE) values ('Oryx and Crake'); /*1*/
insert into BOOK (TITLE) values ('The year of the flood');/*2*/
insert into BOOK (TITLE) values ('MaddAddam');/*3*/
insert into BOOK (TITLE) values ('1Q84');/*4*/
insert into BOOK (TITLE) values ('De opwindvogelkronieken');/*5*/
insert into BOOK (TITLE) values ('Design Patterns');/*6*/

insert into AUTHOR (NAME) values ('Margaret Atwood'); /*1*/
insert into AUTHOR (NAME) values ('Haruki Murakami'); /*2*/
insert into AUTHOR (NAME) values ('Erich Gamma'); /*3*/
insert into AUTHOR (NAME) values ('Richard Helm'); /*4*/
insert into AUTHOR (NAME) values ('Ralph Johnson'); /*5*/
insert into AUTHOR (NAME) values ('John Vlissides'); /*6*/

insert into BOOK_AUTHORS (BOOKS_ID, AUTHORS_ID) values (1, 1);
insert into BOOK_AUTHORS (BOOKS_ID, AUTHORS_ID) values (2, 1);
insert into BOOK_AUTHORS (BOOKS_ID, AUTHORS_ID) values (3, 1);
insert into BOOK_AUTHORS (BOOKS_ID, AUTHORS_ID) values (4, 2);
insert into BOOK_AUTHORS (BOOKS_ID, AUTHORS_ID) values (5, 2);
insert into BOOK_AUTHORS (BOOKS_ID, AUTHORS_ID) values (6, 3);
insert into BOOK_AUTHORS (BOOKS_ID, AUTHORS_ID) values (6, 4);
insert into BOOK_AUTHORS (BOOKS_ID, AUTHORS_ID) values (6, 5);
insert into BOOK_AUTHORS (BOOKS_ID, AUTHORS_ID) values (6, 6);

insert into GENRE(NAME)values ('fantasy');
insert into GENRE(NAME)values ('non-fiction');
insert into GENRE(NAME)values ('programming');

INSERT INTO BOOKSUSER (USERNAME, PASSWORD, ROLE)
VALUES ('admin', '$2a$10$9MIX8kYPkuB7uE/H5nHF8.KG6.YdjBA/voOnjSZnZDxLXL/2BIerS', 'ADMIN'); -- admin

INSERT INTO BOOKSUSER (USERNAME, PASSWORD, ROLE)
VALUES ('marie', '$2a$10$9TeBFudS7HsgCa4sSvP//O627sMq.KiTFrOr8IzrVlYw5c8aoKzNm', 'USER'); -- password

INSERT INTO BOOKSUSER (USERNAME, PASSWORD, ROLE)
VALUES ('vera', '$2y$12$KF3spKP4kgf59.6zYkmjyeYaW2.4ZxV16Grpw1FPsFnzYq68kswJ6', 'USER'); -- vera

insert into SERIE(NAME) values ('Harry Potter');
insert into SERIE(NAME) values ('Anderland');


