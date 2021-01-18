# Sales Taxes

Since the application is user-interactive I decided not no use frameworks like Spring, which is intended 
for server-side applications. The main class `SalesTaxesMain` is responsible for IO operations using Scanner class from java.util.
I decided to use the factory design pattern for the creation of the different products.

#### To build project: 
```
# cd to the project root, where the pom.xml file resides, and type: 
mvn clean package
```
This will compile classes, run tests and create a jar file in the `target` directory. 

#### To execute program:
once built, you can execute the program running the jar file with command:
```
java -jar target/salestaxes.jar
```

#### Requirments:
- Maven 3.3+
- JDK 8+
