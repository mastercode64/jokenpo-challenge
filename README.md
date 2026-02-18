# Jokenpo API (Rock Paper Scissors)

A simple REST API built with **Kotlin + Spring Boot** that allows a player to play Rock–Paper–Scissors against the machine.

The player sends a move via HTTP request, the server randomly chooses a move, and the API responds with the result.

---

## Technologies Used

- **Kotlin**
- **Spring Boot**
- **Spring Web (REST)**
- **Springdoc OpenAPI (Swagger UI)**
- **Gradle**

---

##  Running the Application

### Clone the project

```bash
git clone git@github.com:mastercode64/jokenpo-challenge.git
```

### 2️⃣ Run the application

Using Gradle:

```bash
./gradlew bootRun
```

Or run directly from your IDE.

The application will start at:

```
http://localhost:8080
```

---

## 📘 API Documentation (Swagger)

After starting the application, access:

```
http://localhost:8080/swagger-ui.html
```

---

## 🎯 How to Play

### Endpoint

```
POST /jokenpo
```

### Request body example

```json
{
  "move": "PEDRA"
}
```

### Valid Moves

- `PEDRA`
- `PAPEL`
- `TESOURA`

---

## ✅ Example Request (curl)

```bash
curl -X POST http://localhost:8080/jokenpo \
  -H "Content-Type: application/json" \
  -d '{"move":"PEDRA"}'
```

---

## ✅ Example Response

```json
{
  "playerMove": "PEDRA",
  "machineMove": "TESOURA",
  "result": "VITORIA"
}
```

Possible results:

- `VITORIA`
- `DEROTA`
- `EMPATE`

---

## ❌ Error Handling

If the player sends an invalid move:

```json
{
  "move": "TEST"
}
```

Response:

```json
{
  "message": "Invalid move. Valid options are: PEDRA, PAPEL, TESOURA."
}
```

Status code:

```
400 Bad Request
```

---

## 🧠 Game Logic

The core game rule is implemented inside the `Move` enum:

```kotlin
fun winsAgainst(opponent: Move): Boolean
```

The service layer:

1. Randomly selects a machine move
2. Compares both moves
3. Returns the result
