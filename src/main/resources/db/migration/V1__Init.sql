CREATE TABLE t_order_products
(
    order_product_id SERIAL PRIMARY KEY,
    order_id INT UNIQUE NOT NULL,
    product_id INT UNIQUE NOT NULL,
    quantity INT UNIQUE NOT NULL
);


