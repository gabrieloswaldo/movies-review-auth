INSERT INTO USER_ROLE (ID, NAME) VALUES (1, 'READER');
INSERT INTO USER_ROLE (ID, NAME) VALUES (2, 'BASIC');
INSERT INTO USER_ROLE (ID, NAME) VALUES (3, 'ADVANCED');
INSERT INTO USER_ROLE (ID, NAME) VALUES (4, 'ADMIN');

INSERT INTO USER_ (ID, EMAIL, PASSWORD, POINTS, ROLE_ID)
VALUES (1, 'teste@email.com', '$2a$10$kjI4cvr4fp9J7ddQdL6xc.LR2zsCLLrNl9GtxGLnCmwDIfzCYi0Wy', 0, 1);