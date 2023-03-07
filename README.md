# InternDemo

### Demo project for internship

The goal is to create Restfull spring application. With one Rest endpoint which returns json with name, lastname and age by id. DB contains id, name, lastname and birthdate.

Application contains:
- RestController - getById(id) - GET Request returns json with name, lastname, age
- Repository - link to DB which contains table "person" with name, lastname, birthdate columns
- Service - getPerson() - method returns person from DB, and getAge - method returns age based on person's birthdate

Tests:
- Controller Test - contains one test which make Get Request ("/api/person/1") and compare results.
- Service Test - contains three tests. Two of them check method getAge(). One of them check method getById() which has repository, so I had to use mockito.

