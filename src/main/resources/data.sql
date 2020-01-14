Delete from `customer`;
Delete from `account`;

INSERT INTO customer
(`cpf`,`name`)
VALUES
("01506508413", "Leandro José Rocha da Cunha");

INSERT INTO account
(`balance`,`number`, `customer_id`)
VALUES
(0,"4036",(select id from  `Db_Backend_Qualit_Recode`.`customer` where name =
"Leandro José Rocha da cunha"));
 select * from customer;
 select * from account;
