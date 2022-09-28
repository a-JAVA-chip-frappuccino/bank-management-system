CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE IF NOT EXISTS users (
    id UUID,
    username VARCHAR(3000) UNIQUE NOT NULL,
    password VARCHAR(3000) NOT NULL,

    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS accounts (
    id UUID,
    username VARCHAR(3000) UNIQUE NOT NULL,
    type VARCHAR(3000),
    balance FLOAT(64),
    interestRate FLOAT(64),
    statement VARCHAR(3000),
    
    PRIMARY KEY (id),

    FOREIGN KEY (username) REFERENCES users(username)

);

INSERT INTO users (
    id,
    username,
    password
)
VALUES (
    uuid_generate_v1(),
    "bellaswan",
    "edwardsgal123"
);

INSERT INTO accounts (
    id,
    username,
    type,
    balance,
    interestRate,
    statement,
)
VALUES (
    uuid_generate_v1(),
    "bellaswan",
    "savings",
    32000.00,
    0.04,
    "WITHDRAWAL: H&M"
)