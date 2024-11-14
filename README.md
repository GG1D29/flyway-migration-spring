Based on example from blog: 

https://blog.jetbrains.com/idea/2024/11/how-to-use-flyway-for-database-migrations-in-spring-boot-applications/#prerequisites

Hint: 

when using public schema will give error `Found non-empty schema "public" without metadata table! Use init() or set initOnMigrate to true to initialize the metadata table.`

Your application should use custom schema instead of public (recommended)

https://stackoverflow.com/questions/25562115/flyway-non-empty-schema-without-metadata-table
