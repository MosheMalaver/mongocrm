FOR postgres DB: 

1. Create Docker container with Postgres database:
   docker create --name postgres-demo -e POSTGRES_PASSWORD=Welcome -p 5432:5432 postgres:11.5-alpine
2. docker start postgres-demo
3. take the create_table and insert_data from the resources folder
4. docker exec -it postgres-demo psql -U postgres
5. create database conference_app;
6. docker cp create_tables.sql @CONTAINER_ID@:/create_tables.sql
7. docker exec -it postgres-demo psql conference_app -h localhost -U postgres -f create_tables.sql
8. docker cp insert_data.sql @CONTAINER_ID@:/insert_data.sql
9. docker exec -it postgres-demo psql conference_app -h localhost -U postgres -f insert_data.sql
10. check 
docker exec -it postgres-demo psql conference_app -h localhost -U postgres -c "select * from pricing_categories"

Connection Info:

JDBC URL: `jdbc:postgresql://localhost:5432/conference_app`

Username: `postgres`

Password: `Welcome`

-------------------------------------------------------
in order to run it as an executable we need to change the pom -> in the end we need to add
inside the build-> maven plugin
work only in linux
<configuration>
	<executable>true</executable>
</configuration>



-----------------------------------------------------------

localhost:8080/health
localhost:8080/beans
localhost:8080/env
localhost:8080/metrics
localhost:8080/mappings
localhost:8080/trace