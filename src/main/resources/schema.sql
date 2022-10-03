DROP TABLE IF EXISTS PRODUCTS;
CREATE TABLE PRODUCTS (
                      id INT AUTO_INCREMENT PRIMARY KEY,
                      name VARCHAR(50) NOT NULL,
                      start_date DATE NOT NULL,
                      bid DOUBLE NOT NULL,
                      category INT
);

DROP TABLE IF EXISTS CAMPAIGNS;
CREATE TABLE CAMPAIGNS (
                          id INT AUTO_INCREMENT  PRIMARY KEY,
                          title VARCHAR(50) NOT NULL,
                          price DOUBLE NOT NULL
);

DROP TABLE IF EXISTS PRODUCTS_CAMPAIGNS;
CREATE TABLE PRODUCT_CAMPAIGN (

                                    id INT AUTO_INCREMENT  PRIMARY KEY,
                                    product_id INT,
                                    campaign_id INT
);