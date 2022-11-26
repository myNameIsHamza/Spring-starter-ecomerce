--Categories
insert into CATEGORY(name,parent_category_id) VALUES ('phones',null);
insert into CATEGORY(name,parent_category_id) VALUES ('cars',null);
insert into CATEGORY(name,parent_category_id) VALUES ('pc',null);
insert into CATEGORY(name,parent_category_id) VALUES ('laptops',3);
insert into CATEGORY(name,parent_category_id) VALUES ('gamer laptops',4);
insert into CATEGORY(name,parent_category_id) VALUES ('iphone',1);
insert into CATEGORY(name,parent_category_id) VALUES ('android',1);


-- Products
insert into product(name,detail,price) VALUES ('pc gamer Azus','detail pc gamer Azus',10000);
insert into product(name,detail,price) VALUES ('iphone 8','detail iphone 8',3000);

--Category products
INSERT INTO category_product (category_id,product_id) values (5,1);
INSERT INTO category_product (category_id,product_id) values (6,2);