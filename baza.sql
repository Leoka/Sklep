mysqladmin create SHOP -u root -padoy
use SHOP;
create table books (id int not null, price float, author varchar(255), title varchar(255), publisher varchar (255), category varchar(255), amount int, PRIMARY KEY(id));
