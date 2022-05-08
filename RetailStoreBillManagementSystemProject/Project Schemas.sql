CREATE TABLE `category` (
  `CATEGORY_ID` varchar(15) NOT NULL,
  `CATEGORY_NAME` varchar(30) NOT NULL,
  `NO_OF_PRODUCTS` int DEFAULT NULL,
  PRIMARY KEY (`CATEGORY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;





CREATE TABLE `product` (
  `PRODUCT_ID` int NOT NULL auto_increment,
  `NAME_OF_PRODUCT` varchar(30) NOT NULL,
  `CATEGORY_ID` varchar(15) DEFAULT NULL,
  `STOCK_AVAILABLE` int DEFAULT NULL,
  `PRICE` double DEFAULT NULL,
  PRIMARY KEY (`PRODUCT_ID`),
  KEY `CATEGORY_ID` (`CATEGORY_ID`),
  CONSTRAINT `product_ibfk_1` FOREIGN KEY (`CATEGORY_ID`) REFERENCES `category` (`CATEGORY_ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

ALTER TABLE product AUTO_INCREMENT = 1;



  



  
  
  
  create table user(
  user_id int primary key auto_increment ,
  user_name varchar(45),
  phone_number bigint,
  email_id varchar(45),
  date_of_birth date,
  address varchar(100));

  ALTER TABLE user AUTO_INCREMENT = 1001;
  
INSERT INTO `retailstorebillmanagementsystem`.`user` ( `user_name`, `phone_number`, `email_id`, `date_of_birth`, `address`) VALUES ( 'Mani Deep', '8555800286', 'manideepg122@gmail.com', '2001-09-15', '68-30,Osmania College Road,Kurnool,Andhra Pradesh');  
INSERT INTO `retailstorebillmanagementsystem`.`user` ( `user_name`, `phone_number`, `email_id`, `date_of_birth`, `address`) VALUES ( 'Chirag', '6739274939', 'chiraggoyal@gmail.com', '2000-08-07', 'address of chirag');
INSERT INTO `retailstorebillmanagementsystem`.`user` ( `user_name`, `phone_number`, `email_id`, `date_of_birth`, `address`) VALUES ( 'Yaswanth', '8974893389', 'yaswanth@hotmail.com', '2000-03-30', 'address of yaswanth');
INSERT INTO `retailstorebillmanagementsystem`.`user` ( `user_name`, `phone_number`, `email_id`, `date_of_birth`, `address`) VALUES ( 'Aeman', '7398938399', 'aeman@wiley.com', '1999-04-25', 'address of aeman');
INSERT INTO `retailstorebillmanagementsystem`.`user` (`user_name`, `phone_number`, `email_id`, `date_of_birth`, `address`) VALUES ( 'Samanvitha', '2038330448', 'samanvitha@wiley.com', '2001-12-13', 'address something');



create table orders(
order_id int primary key auto_increment,
user_id int,
total_amount double,
foreign key(user_id) references user(user_id));



