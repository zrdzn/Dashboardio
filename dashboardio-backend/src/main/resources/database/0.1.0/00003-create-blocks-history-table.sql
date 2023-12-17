--liquibase formatted sql
--changeset dashboardio:3
CREATE TABLE "blocks_history"
(
    "id"             serial,
    "action_id"      integer NOT NULL UNIQUE,
    "block_name"     text NOT NULL,
    "x"              integer NOT NULL,
    "y"              integer NOT NULL,
    CONSTRAINT "pk_blocks_history" PRIMARY KEY ("id"),
    CONSTRAINT "fk_blocks_history_action_id" FOREIGN KEY ("action_id") REFERENCES "actions" ("id")
);