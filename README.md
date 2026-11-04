# Job Application Tracker API
🚧 Work in Progress 🚧

A RESTful backend application built with **Java and Spring Boot** to manage and track job applications. This project is designed to demonstrate backend development, REST API design, database integration and Java development skills.

## Technologies

- **Java 21** – Programming language
- **Spring Boot** – Backend application framework
- **Spring Web** – REST API development
- **Spring Data JPA** – Database persistence
- **H2 Database** – In-memory relational database
- **Maven** – Dependency management and build automation
- **Postman** – API testing

## Features

- Create new job applications.
- Retrieve all saved job applications.
- Store application details in an H2 database.
- Manage application statuses using a Java enum.
- Automatically generate unique application IDs.

### Application Statuses

Each job application can have one of four statuses:

| Status | Description |
|---|---|
| `APPLIED` | Application submitted |
| `INTERVIEWED` | Interview completed |
| `OFFERED` | Job offer received |
| `REJECTED` | Application unsuccessful |

## Project Structure

```text
src/
└── main/
    ├── java/com/melanie/jobtracker/
    │   ├── controller/
    │   │   └── ApplicationController.java
    │   ├── model/
    │   │   ├── JobApplication.java
    │   │   └── ApplicationStatus.java
    │   ├── repository/
    │   │   └── JobApplicationRepository.java
    │   ├── service/
    │   │   └── JobApplicationService.java
    │   └── JobtrackerApplication.java
    └── resources/
        └── application.properties
```

## Getting Started

### Prerequisites

- Java 21 or later
- Maven
- IntelliJ IDEA or another Java IDE
- Postman (for API testing)

### Running the Application

1. Clone the repository:

   ```bash
   git clone https://github.com/melaniejayde/JobApplicationTracker.git
   ```

2. Navigate into the project directory:

   ```bash
   cd JobApplicationTracker
   ```

3. Run the Spring Boot application using Maven:

   ```bash
   mvn spring-boot:run
   ```

4. The API will be available at:

   ```text
   http://localhost:8080
   ```

## API Endpoints

### Retrieve All Applications

**GET** `/api/applications`

Returns all saved job applications.

Example response:

```json
[
  {
    "id": 1,
    "company": "Microsoft",
    "position": "Software Engineer",
    "location": "Brisbane",
    "status": "APPLIED",
    "notes": "Java backend position"
  }
]
```

### Create a Job Application

**POST** `/api/applications`

Creates and saves a new job application.

Request header:

```text
Content-Type: application/json
```

Example request body:

```json
{
  "company": "Microsoft",
  "position": "Software Engineer",
  "location": "Brisbane",
  "status": "APPLIED",
  "notes": "Java backend position"
}
```

## Database

The project currently uses an H2 in-memory database.

The H2 console can be accessed at:

```text
http://localhost:8080/h2-console
```

Connection details:

| Setting | Value |
|---|---|
| JDBC URL | `jdbc:h2:mem:jobtracker` |
| Username | `sa` |
| Password | Leave blank |

**Note:** Because this is an in-memory database, data is cleared when the application restarts.

## Future Enhancements

Planned improvements include:

- Update existing job applications.
- Delete job applications.
- Retrieve individual applications by ID.
- Add validation and exception handling.
- Integrate with Microsoft Outlook using Microsoft Graph API to identify job application emails.
- Automatically extract job details and listing URLs from job alert emails.
- Introduce a persistent database.
- Add unit and integration tests.
- Implement API documentation using Swagger/OpenAPI.

## Purpose

This project is being developed as a practical portfolio project to strengthen Java backend development skills and demonstrate experience building REST APIs, integrating databases and developing maintainable software applications.
