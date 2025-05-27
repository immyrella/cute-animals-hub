flyway-migrate:
	./gradlew flywayMigrate

run:
	./gradlew bootRun

start: flyway-migrate run
