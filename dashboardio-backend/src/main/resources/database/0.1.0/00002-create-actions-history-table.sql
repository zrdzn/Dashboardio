--liquibase formatted sql
--changeset dashboardio:2
CREATE TABLE "actions_history"
(
    "id"             serial,
    "action_type"    action_type NOT NULL,
    "player_id"      integer NOT NULL,
    "occurred_at"    timestamp NOT NULL,
    CONSTRAINT "pk_actions_history" PRIMARY KEY ("id"),
    CONSTRAINT "fk_actions_history_players" FOREIGN KEY ("player_id") REFERENCES "players" ("id")
);