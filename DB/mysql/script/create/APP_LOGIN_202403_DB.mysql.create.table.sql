-- table types_role
create table types_role (
    code varchar(5) primary key,
    name varchar(25) not null,
    description varchar(255)
);

-- table accounts
create table accounts (
    id int auto_increment primary key,
    name varchar(50) not null,
    surname varchar(50) not null,
    username varchar(50) unique not null,
    password varchar(255) not null
);

-- ---------------------
-- RELATIONSHIP TABLE --
-- ---------------------

-- table accounts_roles
create table accounts_roles (
  account_id int not null,
  role_code varchar(5) not null,
  primary key (account_id,role_code),
  key fk_accounts_roles (role_code),
  constraint fk_accounts_roles2types_role foreign key (role_code) references types_role (code),
  constraint fk_accounts_roles2accounts foreign key (account_id) references accounts (id)
);