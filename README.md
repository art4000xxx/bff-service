
---

### 📌 bff-service / README.md
```markdown
# BFF Service

Backend-for-Frontend сервис.  
Агрегирует данные из `user-service` и `order-service` и возвращает объединённый профиль пользователя.  

## 🚀 Запуск
```bash
mvn spring-boot:run
Endpoint
GET http://localhost:8083/api/site-bff/user/{userId}
Пример ответа:
{
  "user": {
    "id": 1,
    "fullName": "Иван Иванов",
    "address": "Москва, ул. Ленина, 10",
    "phoneNumber": "+79991234567",
    "email": "ivan@example.com"
  },
  "orders": [
    {
      "id": 1,
      "userId": 1,
      "amount": 1500.50,
      "currency": "RUB",
      "items": ["Книга", "Ручка"]
    }
  ]
}
