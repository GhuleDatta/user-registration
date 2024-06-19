"# user-registration" 
# User Registration Application

A simple User Registration Application using Spring Boot, SQL, and Postman for API testing.

## Features

- Register a user with id, username, email, and password
- Login with email and password
- API to add, fetch, and get user data by username
- POST api
- GET api

## Technologies

- **Backend**: Spring Boot
- **Database**: SQL
- **API Testing**: Postman

## Getting Started

### Prerequisites

- Java 11+
- Maven
- SQL Database (e.g., MySQL)
- Postman

### Setup

1. **Clone the repo**
   ```bash
   git clone (https://github.com/GhuleDatta/user-registration.git)
   cd user-registration
   https://github.com/GhuleDatta/user-registration.git

2. **Configure the database**
   Edit `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/yourdatabase
   spring.datasource.username=yourusername
   spring.datasource.password=yourpassword
   spring.jpa.hibernate.ddl-auto=update
   ```

3. **Build and run**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

## API Endpoints

1. **Register** - `POST /api/register`
   ```json
   {
     "username": "yourusername",
     "email": "youremail@example.com",
     "password": "yourpassword"
   }
   ```

2. **Login** - `POST /api/login`
 /Api/user/registe
   ```json
   {
     "email": "youremail@example.com",
     "password": "yourpassword"
   }
   ```

4. **Get User by Username** - `GET /api/user/{username}`
/ api/user/fetch 


## Testing with Postman
1. **Install Postman**: [Download Postman](https://www.postman.com/downloads/)
2. **Import Collection**: Import the provided `postman_collection.json`
3. **Run Requests**: Use the collection to test API endpoints

## Contributing

1. Fork the repo
2. Create a branch (`git checkout -b feature/feature-name`)
3. Commit your changes (`git commit -m 'Add feature'`)
4. Push to the branch (`git push origin feature/feature-name`)
5. Open a Pull Request

## License
