# Projeto-API-Rest

Connect your MySQL Workbench address in .properties

Create DataBase with the name 'rest_Api' and create the table:

create table product
(
    id              bigint       not null
        constraint PRODUCT_PK
            primary key,
    prd_name        varchar(70)  not null,
    prd_description varchar(255) not null
);

Make your tests on Postman! :D
