# Voting Application

This is a practice-based full-stack Voting Application built using Java and Spring Boot, demonstrating REST API design, database integration, and frontend interaction.

## About

This repository contains a Voting Application developed as a hands-on practice project. It is designed to strengthen understanding of Java, Spring Boot, REST APIs, and database persistence, while simulating a real-world application structure.

The project includes:
- A Spring Boot backend exposing REST APIs
- A simple frontend built with HTML, CSS, and JavaScript to interact with the backend

## Features

- Voter registration
- Candidate management
- Users can cast votes for candidates
- Result viewing
- RESTful API communication
- Persistent data storage using MySQL
- The application follows a clean separation of frontend and backend concerns using RESTful APIs.

## Technologies Used

Backend:
- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

Frontend:
- HTML
- CSS
- JavaScript

## Project Structure

Voting-Application/
- backend/ — Spring Boot backend
- frontend/ — Frontend (HTML, CSS, JavaScript)
- README.md
- .gitignore

## Setup and Installation

1. Clone the repository
  => git clone https://github.com/rishabh-marathe/Voting-Application.git
   
### Backend Setup

1. Open the backend folder in your Java IDE (IntelliJ IDEA or Eclipse)
2. Configure database details in:
   => backend/src/main/resources/application.properties

3. Create a MySQL database (example: `voting_db`)
4. Run the Spring Boot application

Backend will start at:
   =>http://localhost:8080


> Example application.properties (adjust values):

spring.datasource.url=jdbc:mysql://localhost:3306/voting_db?useSSL=false&serverTimezone=UTC
spring.datasource.username=voting_user
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
server.port=8080


### Frontend Setup

Option A: Run frontend separately (development)
1. Serve static files from the `frontend` folder:
   ```
   cd frontend
   python -m http.server 3000
   ```
2. Open in browser:
   ```
   http://localhost:3000
   ```
Note: Backend must allow CORS for this port if the frontend is served on a different origin.

Option B: Serve frontend via backend (recommended)
1. Copy frontend files into:
   ```
   backend/src/main/resources/static/
   ```
2. Restart backend
3. Open in browser:
   ```
   http://localhost:8080
   ```

## API Endpoints (expected)

The frontend uses the following REST endpoints (confirm exact routes in the backend controllers):

- Candidates
  - GET    /api/candidates
  - GET    /api/candidates/{id}
  - POST   /api/candidates/add
  - PUT    /api/candidates/update/{id}
  - DELETE /api/candidates/delete/{id}

- Voters
  - GET    /api/voters
  - POST   /api/voters/register
  - DELETE /api/voters/delete/{id}

- Votes
  - GET    /api/votes
  - POST   /api/votes/cast

## Contributing

Contributions are welcome.

Steps to contribute:
1. Fork the repository
2. Create a new branch
3. Commit your changes
4. Push to your branch
5. Open a pull request with a clear description

Please include tests for significant changes and keep PRs focused.

## License

This project is licensed under the MIT License.

## Author

Rushabh Marathe  
Java Developer Fresher  
GitHub: https://github.com/rishabh-marathe

Happy coding!
