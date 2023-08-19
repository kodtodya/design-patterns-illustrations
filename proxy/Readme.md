# Dependency Injection Design Pattern

## Step-1
- Created a services with abstraction

## Step-2
- Implement the one service as actual target service and another as surrogate/handler/wrapper service

## Step-3
- Do your validation in surrogate service, if you find it valid then send it to actual service otherwise throw error or redirect to some other place for further course of action
- Run the main method to perform required task 
