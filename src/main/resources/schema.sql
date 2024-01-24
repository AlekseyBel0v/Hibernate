create schema netology;

create table netology.CUSTOMERS
(
    id           bigserial primary key,
    name         varchar(255)                       not null,
    surname      varchar(255)                       not null,
    age          int check ( age > 0 and age < 150) not null,
    phone_number varchar                            not null
);

create table netology.ORDERS
(
    id           bigserial primary key,
    date         varchar(50)                               not null,
    customer_id  bigint references netology.CUSTOMERS (id) not null,
    product_name varchar(255)                              not null,
    amount       float check ( amount > 0 )                not null
);