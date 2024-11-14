Based on example from blog: 

https://blog.jetbrains.com/idea/2024/11/how-to-use-flyway-for-database-migrations-in-spring-boot-applications/#prerequisites

Hint: 

when using public schema will give error `Found non-empty schema "public" without metadata table! Use init() or set initOnMigrate to true to initialize the metadata table.`

Your application should then use this one instead of public (recommended)