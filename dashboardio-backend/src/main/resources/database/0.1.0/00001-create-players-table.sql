--liquibase formatted sql
--changeset dashboardio:1
CREATE TABLE "players"
(
    "id"             serial,
    "player_name"    text NOT NULL,
    CONSTRAINT "pk_players" PRIMARY KEY ("id")
);