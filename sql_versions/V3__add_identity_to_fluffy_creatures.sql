alter table fluffy_creatures
    alter COLUMN id drop DEFAULT;

DO $$
begin
    if not exists (select 1 from pg_class where relname = 'fluffy_id_seq') then
        CREATE SEQUENCE fluffy_id_seq START 1;
    end IF;
END$$;

ALTER TABLE fluffy_creatures
    ALTER COLUMN id SET DEFAULT nextval('fluffy_id_seq');
