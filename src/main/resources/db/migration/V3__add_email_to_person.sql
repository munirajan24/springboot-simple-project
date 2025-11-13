-- V3__add_email_to_person.sql
ALTER TABLE person
    ADD COLUMN /*IF NOT EXISTS*/ email VARCHAR(255) NULL;
