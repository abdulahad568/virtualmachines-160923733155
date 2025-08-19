# virtualmachines-160923733155

**Author:** abdul ahad  
**Project:** Virtual Machines Management System  
**ID:** 160923733155

## Overview
This is a Spring Boot REST API project for managing virtual machines.

## API Endpoints

**POSTMAN POST ATTRIBUTE:** Create a new virtual machine
```http
POST /api/vms
```

**POSTMAN GET ATTRIBUTE:** Retrieve all virtual machines
```http
GET /api/vms
```

**POSTMAN PUT ATTRIBUTE:** Update an existing virtual machine
```http
PUT /api/vms/{id}
```

**POSTMAN DELETE ATTRIBUTE:** Delete a virtual machine
```http
DELETE /api/vms/{id}
```

## Getting Started

### Prerequisites
- Java 24
- Gradle 8.14.3
- Spring Boot 3.5.4

### Running the Application
```bash
cd virtualmachines
./gradlew bootRun
```

The application will start on `http://localhost:8080`

### Building the Project
```bash
cd virtualmachines
./gradlew build
```

### Running Tests
```bash
cd virtualmachines
./gradlew test
```

## Author Information
**Developer:** abdul ahad  
**Student ID:** 160923733155  
**Project Type:** Virtual Machines Management API

## Technology Stack
- Spring Boot 3.5.4
- Spring Web
- Java 24
- Gradle Build Tool
- JUnit 5 for Testing

## API Usage Examples

### Create Virtual Machine
```json
POST /api/vms
{
    "title": "Ubuntu Server",
    "description": "Ubuntu 22.04 LTS Server",
    "status": "running"
}
```

### Get All Virtual Machines
```json
GET /api/vms
```

### Update Virtual Machine
```json
PUT /api/vms/{id}
{
    "title": "Updated Ubuntu Server", 
    "description": "Updated description",
    "status": "stopped"
}
```

### Delete Virtual Machine
```json
DELETE /api/vms/{id}
```