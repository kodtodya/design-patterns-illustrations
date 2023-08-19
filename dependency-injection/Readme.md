# Dependency Injection Design Pattern

## Step-1
- Created a services with abstraction

## Step-2
- Design multiple injectors for different services which will pass-on the respective services' object as a parameter to injector

## Step-3
- Initialize specific injector first
- Initialize the actual service based on injector
- Run the service method to perform required task 
