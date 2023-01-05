#!/bin/sh

# GET request
curl -v http://localhost:8080/room/v1/reservation/1234 &&
#
# POST request
curl -v --location --request POST 'localhost:8080/room/v1/reservation/' \
--header 'Content-Type: application/json' \
--data-raw '{
    "roomNumber": 123,
    "checkIn": "2023-01-01",
    "checkOut": "2023-02-01",
    "price": 150

}' &&
#
#PUT request
curl -v --location --request PUT 'localhost:8080/room/v1/reservation/123' \
--header 'Content-Type: application/json' \
--data-raw '{
    "checkIn": "2023-01-01",
    "checkOut": "2023-02-01",
    "price": 100

}'