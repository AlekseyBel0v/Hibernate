insert into netology.customers(id, name, surname, age, phone_number)
values (1, 'Alexey', 'Belov', 18, '11111');
insert into netology.customers(id, name, surname, age, phone_number)
values (2, 'Ivan', 'Ivanovich', 20, '22222');
insert into netology.customers(id, name, surname, age, phone_number)
values (3, 'Petr', 'Petrovich', 25, '33333');
insert into netology.customers(id, name, surname, age, phone_number)
values (4, 'Alexandr', 'Alexandrovich', 30, '44444');

insert into netology.orders(date, customer_id, product_name, amount)
values ('21.12.2023', 1, 'Milk', 2);
insert into netology.orders(date, customer_id, product_name, amount)
values ('21.12.2023', 1, 'Milk', 2.5);
insert into netology.orders(date, customer_id, product_name, amount)
values ('21.12.2023', 1, 'Bread', 1);
insert into netology.orders(date, customer_id, product_name, amount)
values ('21.12.2023', 1, 'sold', 1);
insert into netology.orders(date, customer_id, product_name, amount)
values ('21.12.2023', 2, 'Moloko', 10);
insert into netology.orders(date, customer_id, product_name, amount)
values ('21.12.2023', 3, 'Moloko', 1);
insert into netology.orders(date, customer_id, product_name, amount)
values ('21.12.2023', 4, 'Bread', 1);
insert into netology.orders(date, customer_id, product_name, amount)
values ('21.12.2023', 1, 'Bread', 2);