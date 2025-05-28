up:
	docker-compose up -d

flyway:
	docker-compose run --rm flyway

start: up flyway
