-- postgresql

create table person (
    id serial primary key not null,
    firstName varchar(64),
    middleName varchar(64),
    lastName varchar(64),
    fatherId integer references person(id),
    motherId integer references person(id)
);



insert into person (id, firstName, middleName, lastName) values (1, 'Chuya', '', 'Tan');
insert into person (id, firstName, middleName, lastName) values (2, 'Hermenia', '', 'Tan');
insert into person (id, firstName, middleName, lastName) values (3, 'Ramon', '', 'Rosales');
insert into person (id, firstName, middleName, lastName) values (4, 'Paz', '', 'Rosales');
insert into person (id, firstName, middleName, lastName, fatherId, motherId) values (5, 'Ramon', '', 'Tan', 1, 2);
insert into person (id, firstName, middleName, lastName, fatherId, motherId) values (6, 'Susana', '', 'Tan', 3, 4);
insert into person (id, firstName, middleName, lastName, fatherId, motherId) values (7, 'Lorenzo', '', 'Tan', 5, 6);
insert into person (id, firstName, middleName, lastName, fatherId, motherId) values (8, 'Marinelle', '', 'Tan', 5, 6);
insert into person (id, firstName, middleName, lastName) values (9, 'Rodel', '', 'Mangali');
insert into person (id, firstName, middleName, lastName, fatherId, motherId) values (10, 'Delia', '', 'Mangali', 3, 4);
insert into person (id, firstName, middleName, lastName, fatherId, motherId) values (11, 'Roderick', '', 'Mangali', 9, 10);
insert into person (id, firstName, middleName, lastName, fatherId, motherId) values (12, 'Roselyn', '', 'Mangali', 9, 10);
insert into person (id, firstName, middleName, lastName, fatherId, motherId) values (13, 'Darnell', '', 'Mangali', 9, 10);
insert into person (id, firstName, middleName, lastName, fatherId, motherId) values (14, 'Jeanie', 'Guray', 'Tan');
insert into person (id, firstName, middleName, lastName, fatherId, motherId) values (15, 'Elisa', 'Guray', 'Tan', 7, 14);
insert into person (id, firstName, middleName, lastName, fatherId, motherId) values (16, 'Jared', 'Guray', 'Tan', 7, 14);
