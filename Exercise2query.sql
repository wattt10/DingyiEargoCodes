Create table IF NOT EXISTS Output (Page VARCHAR(20), COUNTS INT);
Insert into output VALUES('Home_Page', (select sum(Home_Page) from input));
Insert into output VALUES('Product_Page', (select sum(Product_Page) from input));
Insert into output VALUES('Warrenty_Page', (select sum(Warrenty_Page) from input));