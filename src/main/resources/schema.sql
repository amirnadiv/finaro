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
    id          BIGINT AUTO_INCREMENT PRIMARY KEY,
    name        VARCHAR(100) NOT NULL,
    start_date  DATE,
    category    INT,
    campaign_id BIGINT
);


CREATE TABLE IF NOT EXISTS CAMPAIGNS_PRODUCTS
(
    id          BIGINT AUTO_INCREMENT PRIMARY KEY,
    campaign_id BIGINT REFERENCES CAMPAIGNS (id),
    product_id  BIGINT REFERENCES PRODUCTS (id)
);
