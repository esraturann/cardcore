CREATE TABLE cards (
                       id BIGSERIAL PRIMARY KEY,
                       masked_number VARCHAR(19) NOT NULL UNIQUE,
                       card_limit NUMERIC(19,2) NOT NULL,
                       available_limit NUMERIC(19,2) NOT NULL,
                       version BIGINT NOT NULL DEFAULT 0
);

INSERT INTO cards (masked_number, card_limit, available_limit)
VALUES ('4543 **** **** 1234', 10000.00, 10000.00),
       ('5412 **** **** 5678', 5000.00, 5000.00);