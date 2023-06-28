CREATE TABLE REGISTRATION_USER (
    id bigint(20) not null auto_increment,
    username varchar(100) not null,
    first_name varchar(50) not null,
    last_name varchar(50) not null,
    email varchar(50) not null,
    primary key (id),
    unique key uk_username(username)
)