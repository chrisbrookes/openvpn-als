
ALTER TABLE NETWORK_PLACES ALTER COLUMN SHORT_NAME RENAME TO SHORT_NAME_OLD;
ALTER TABLE NETWORK_PLACES ADD COLUMN SHORT_NAME VARCHAR(255) DEFAULT '' NOT NULL;
UPDATE NETWORK_PLACES SET SHORT_NAME = SHORT_NAME_OLD;
ALTER TABLE NETWORK_PLACES DROP COLUMN SHORT_NAME_OLD;

ALTER TABLE NETWORK_PLACES ALTER COLUMN DESCRIPTION RENAME TO DESCRIPTION_OLD;
ALTER TABLE NETWORK_PLACES ADD COLUMN DESCRIPTION VARCHAR(1024) DEFAULT '' NOT NULL;
UPDATE NETWORK_PLACES SET DESCRIPTION = DESCRIPTION_OLD;
ALTER TABLE NETWORK_PLACES DROP COLUMN DESCRIPTION_OLD;

ALTER TABLE NETWORK_PLACES ADD COLUMN AUTO_START BOOLEAN DEFAULT false not null;