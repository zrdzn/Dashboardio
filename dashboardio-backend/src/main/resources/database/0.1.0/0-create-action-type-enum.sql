--liquibase formatted sql
--changeset dashboardio:0
CREATE TYPE "action_type" AS ENUM (
    'BLOCK_PLACE',
    'BLOCK_BREAK'
);