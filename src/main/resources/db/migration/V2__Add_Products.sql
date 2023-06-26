CREATE TABLE IF NOT EXISTS public.products
(
    id          uuid          not null
        constraint pk_products primary key,
    name        varchar(50)   not null,
    description varchar(1024) not null,
    link        varchar(50)   not null,
    supplier_id uuid          not null,
    cost        integer       not null,
    FOREIGN KEY (supplier_id) REFERENCES public.suppliers (id)
);