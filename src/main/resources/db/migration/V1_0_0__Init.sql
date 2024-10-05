CREATE TABLE t_order_products
(
    order_product_id BIGSERIAL PRIMARY KEY,
    order_id         BIGINT UNIQUE NOT NULL,
    product_id       BIGINT UNIQUE NOT NULL,
    quantity         BIGINT UNIQUE NOT NULL
);

-- Я б не робив quantity унікальним, бо це ж кількість чогочь в чомусь а вона може повторюватись(але дивись сама відштовхуйся від своїх вимог)


-- Після того як видалиш коментарі видали всі таблиці з бази крім flyway_schema_history і всі значення з цієї таблиці бо в може хеш сума не зійтись і буде викидуваись помилка