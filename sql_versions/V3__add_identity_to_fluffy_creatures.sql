ALTER TABLE fluffy_creatures
    ALTER COLUMN id DROP DEFAULT;

DO $$
BEGIN
    IF NOT EXISTS (
        SELECT 1
        FROM pg_class
        WHERE relname = 'fluffy_id_seq'
          AND relkind = 'S'
    ) THEN
        CREATE SEQUENCE fluffy_id_seq START 10;
    END IF;
END$$;

ALTER TABLE fluffy_creatures
    ALTER COLUMN id SET DEFAULT nextval('fluffy_id_seq');
