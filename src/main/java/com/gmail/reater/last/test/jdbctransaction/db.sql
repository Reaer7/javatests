CREATE TABLE person_balance
(
    id      SERIAL NOT NULL,
    balance BIGINT NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO person_balance VALUES (1, 100);
INSERT INTO person_balance VALUES (2, 100);