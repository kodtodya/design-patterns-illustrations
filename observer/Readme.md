# Dependency Injection Design Pattern

## Step-1
- Create Observable class which will be observed by subscribers/observers

## Step-2
- Implement the Subscriber/Observer class and just write method to perform the task

## Step-3
- Inside the Observable class, write a method to notify all the observes and invoke task performing method for all the observers
- Create multiple subscribers/observers and add those to observable.register() and simplify notify to all subscribers 
