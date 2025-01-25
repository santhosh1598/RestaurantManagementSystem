# Restaurant Management System

This project is a Restaurant Management System built using Java Spring Boot. It includes a table reservation system API and integrates Swagger for API documentation. The application automatically creates the necessary MySQL tables upon startup after modifying the database configuration.

## Project Structure

```
restaurant-management-system
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── restaurant
│   │   │               ├── RestaurantManagementSystemApplication.java
│   │   │               ├── controller
│   │   │               │   └── ReservationController.java
│   │   │               ├── model
│   │   │               │   └── Reservation.java
│   │   │               ├── repository
│   │   │               │   └── ReservationRepository.java
│   │   │               └── service
│   │   │                   └── ReservationService.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── schema.sql
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── restaurant
│                       └── RestaurantManagementSystemApplicationTests.java
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## Setup Instructions

1. **Clone the repository:**
   ```
   git clone <repository-url>
   cd restaurant-management-system
   ```

2. **Modify the database configuration:**
   Update the `src/main/resources/application.properties` file with your MySQL database connection details:
   ```
   spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

3. **Run the application:**
   Use the following command to start the application:
   ```
   ./mvnw spring-boot:run
   ```

4. **Access Swagger UI:**
   Once the application is running, you can access the Swagger UI at:
   ```
   http://localhost:8080/swagger-ui/
   ```

## API Usage

The API provides endpoints for managing reservations. Below are some of the key endpoints:

- **Create Reservation**
  - `POST /reservations`
  
- **Get Reservation**
  - `GET /reservations/{id}`
  
- **Update Reservation**
  - `PUT /reservations/{id}`
  
- **Delete Reservation**
  - `DELETE /reservations/{id}`

## Dependencies

The project uses the following dependencies:

- Spring Boot
- Spring Data JPA
- MySQL Connector
- Swagger for API documentation

## Testing

Unit tests are included in the `src/test/java/com/example/restaurant/` directory to ensure the application functions as expected.

## License

This project is licensed under the MIT License.
