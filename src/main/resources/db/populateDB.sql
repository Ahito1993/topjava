DELETE
FROM user_roles;
DELETE
FROM meals;
DELETE
FROM users;
ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO users (name, email, password)
VALUES ('User', 'user@yandex.ru', 'password'),
       ('Admin', 'admin@gmail.com', 'admin');

INSERT INTO user_roles (role, user_id)
VALUES ('USER', 100000),
       ('ADMIN', 100001);

INSERT INTO meals (user_id, date_time, description, calories)
VALUES (100000, '20201219 10:00:00', 'Breakfast', 416);
INSERT INTO meals (user_id, date_time, description, calories)
VALUES (100000, '20210711 06:50:00', 'Breakfast', 2128);
INSERT INTO meals (user_id, date_time, description, calories)
VALUES (100000, '20201112 05:31:00', 'Afternoon snack', 1084);
INSERT INTO meals (user_id, date_time, description, calories)
VALUES (100000, '20210415 07:37:00', 'Afternoon snack', 1907);
INSERT INTO meals (user_id, date_time, description, calories)
VALUES (100000, '20210312 10:28:00', 'Breakfast', 637);
INSERT INTO meals (user_id, date_time, description, calories)
VALUES (100001, '20210427 17:25:00', 'Lunch', 1021);
INSERT INTO meals (user_id, date_time, description, calories)
VALUES (100001, '20201106 20:52:00', 'Afternoon snack', 1016);
INSERT INTO meals (user_id, date_time, description, calories)
VALUES (100001, '20210323 13:29:00', 'Lunch', 1488);
INSERT INTO meals (user_id, date_time, description, calories)
VALUES (100001, '20210324 18:05:00', 'Breakfast', 1885);
INSERT INTO meals (user_id, date_time, description, calories)
VALUES (100001, '20210731 05:01:00', 'Dinner', 1806);


