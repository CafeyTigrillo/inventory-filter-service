# Inventory Filter Service

## 🚀 Overview

The **Inventory Filter Service** provides a RESTful API for searching products within the inventory based on their name. It is designed to integrate seamlessly with other services in an e-commerce platform, allowing users to filter products effectively.

Built using **Spring Boot**, the service offers a simple search functionality that allows querying products by their name, making it easier for customers or internal systems to find products in large inventories.

## 🌟 Key Features

- **RESTful API**: Allows searching for products by name.
- **Dynamic Search**: Implements a case-insensitive search that matches product names containing the search query.
- **Database Integration**: Uses **JPA** to interact with the database for managing product data.

## 🔑 API Endpoints

### 1. **GET** `/products/search`
Search for products by name.

**Query Parameters**:
- `name`: The name of the product (can be part of the name for partial matching).

**Response**:
- Returns a list of `Product` objects that match the search query.

#### Example Request:

```bash
GET /products/search?name=shoe
```

**Response**:
```bash
[
  {
    "idProduct": 1,
    "name": "Sports Shoe",
    "description": "Comfortable sports shoe for all seasons",
    "price": 50.99,
    "idCategory": 2,
    "availability": true
  },
  {
    "idProduct": 2,
    "name": "Leather Shoe",
    "description": "Premium leather shoes for formal occasions",
    "price": 120.99,
    "idCategory": 2,
    "availability": true
  }
]
```

### 🔧 Technologies Used
Spring Boot: Framework for building the application.
JPA (Java Persistence API): Manages interaction with the product database.
Lombok: Simplifies the Product class by generating boilerplate code like getters, setters, and constructors.

### 💡 Use Case
This service is ideal for platforms where products are numerous, and filtering or searching is a key feature for enhancing the user experience. It can be used in e-commerce websites, inventory management systems, or any application where searching for products is required.