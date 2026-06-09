
use bd_naturassp;

create table categoria (
    id                      CHAR(36)                PRIMARY KEY,
    nome                    VARCHAR(100)            NOT NULL,
    data_criacao            TIMESTAMP               NOT NULL      DEFAULT CURRENT_TIMESTAMP,
    data_atualizacao        TIMESTAMP               NOT NULL      DEFAULT CURRENT_TIMESTAMP,
    data_exclusao           TIMESTAMP               NOT NULL      DEFAULT CURRENT_TIMESTAMP
);