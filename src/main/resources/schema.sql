DROP ALL OBJECTS;

CREATE TABLE IF NOT EXISTS CAMPAIGNS(
                                        id         BIGINT AUTO_INCREMENT PRIMARY KEY,
                                        name       VARCHAR(100) NOT NULL,
                                        category   INT,
                                        bid        DOUBLE       NOT NULL,
                                        start_date DATE         NOT NULL
);



CREATE TABLE IF NOT EXISTS PRODUCTS
(
    id         BIGINT AUTO_INCREMENT PRIMARY KEY,
    name       VARCHAR(100) NOT NULL,
    start_date DATE,
    bid        DOUBLE       NOT NULL,
    category   INT
);

