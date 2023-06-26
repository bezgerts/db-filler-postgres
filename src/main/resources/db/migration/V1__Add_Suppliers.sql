CREATE TABLE IF NOT EXISTS public.suppliers
(
    id      uuid         not null
        constraint pk_suppliers primary key,
    name    varchar(50)  not null,
    address varchar(150) not null
);