-- V4__add_gender_to_person.sql
ALTER TABLE person
    ADD COLUMN /*IF NOT EXISTS*/ gender VARCHAR(255) NULL;
