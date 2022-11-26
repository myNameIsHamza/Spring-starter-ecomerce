--Categories
insert into CATEGORY(id,name,parent_category_id) VALUES (1,'phones',null);
insert into CATEGORY(id,name,parent_category_id) VALUES (2,'cars',null);
insert into CATEGORY(id,name,parent_category_id) VALUES (3,'pc',null);
insert into CATEGORY(id,name,parent_category_id) VALUES (4,'laptops',3);
insert into CATEGORY(id,name,parent_category_id) VALUES (5,'gamer laptops',4);
insert into CATEGORY(id,name,parent_category_id) VALUES (6,'iphone',1);
insert into CATEGORY(id,name,parent_category_id) VALUES (7,'android',1);


-- Products
insert into product(product_id,name,detail,price) VALUES (1,'pc gamer Azus','detail pc gamer Azus',10000);
insert into product(product_id,name,detail,price) VALUES (2,'iphone 8','detail iphone 8',3000);

--Category products
INSERT INTO category_product (category_id,product_id) values (5,1);
INSERT INTO category_product (category_id,product_id) values (6,2);