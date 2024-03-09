-- insert types_role
insert into types_role (code, name, description) values ('TR001', 'ADMIN', 'Admin');
insert into types_role (code, name, description) values ('TR002', 'USER', 'User');

-- insert accounts fake; password encoded (hash) with bcrypt
insert into accounts (name, surname, username, password) values ('Paperino', 'Paperone', 'Paperinik', '$2a$10$SxPiELrIbXOyyNKIrhYy9usNCtp/sk2gjmqjmWD/gkgt55xJMZrRq'); -- Password: paperina12345
insert into accounts (name, surname, username, password) values ('Topolino', 'Topolino', 'Mickey', '$2a$10$jSOUcsIJhMEtfcRjp5EGr.kamRPk6YiBUpYM38xgi0YlcZd4B9NQi'); -- Password: pippo12345
insert into accounts (name, surname, username, password) values ('Paperina', 'Paperina', 'Daisy', '$2a$10$aDmNdx/zfu3FINc/YUBH/e1hcBkbdsRRmq.4nEHngciq9en82jVmy'); -- Password: quiquoqua12345
insert into accounts (name, surname, username, password) values ('Pippo', 'Pippo', 'SuperGoof', '$2a$10$xrPVocDOenfHQ4mBsngh2exJ6KQtAu7IBwYfp.RT5WUacYLuMLUre'); -- Password: topolino12345
insert into accounts (name, surname, username, password) values ('Paperoga', 'Paperoga', 'Fethry', '$2a$10$motj2F8W9Zztaw0e1GeDU.ReBRcxX1qlfVZD0vbrexpGpuQG4H2OO'); -- Password: Fethry12345

-- insert accounts_roles
insert into accounts_roles (account_id, role_code) values (1, 'TR001');