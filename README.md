# 🚀 API Core Service - Duoc UC (Sede Alameda)

Backend principal desarrollado en **Spring Boot** para la gestión y sincronización de inventario (`Items`). Este microservicio centraliza las operaciones del negocio y expone una API REST limpia y estructurada bajo buenas prácticas de desarrollo.

---

## 🛠️ Tecnologías Utilizadas

* **Java 17** (Eclipse Adoptium / Hotspot)
* **Spring Boot 3.2.3**
    * Spring Web (Arquitectura REST)
* **Apache Tomcat 10.1** (Servidor embebido)
* **Maven** (Gestor de dependencias y construcción)

---

## 📦 Estructura del Proyecto

El proyecto sigue una arquitectura limpia basada en paquetes para separar las responsabilidades:

```text
cl.duoc.alameda.core
├── CoreApplication.java       # Clase principal (Punto de entrada)
├── controller                  # Capa de controladores (Endpoints expuestos)
│   └── ItemController.java
├── model                       # Capa de entidades/modelos de datos
│   └── Item.java
└── service                     # (Opcional) Capa de lógica de negocio

* **Instalación y Ejecución Local* ** 
Prerrequisitos
Tener instalado Java 17.

Tener instalado Maven.

Pasos para iniciar el servicio
Clona este repositorio o entra a la carpeta raíz del proyecto mediante tu terminal:

Bash
cd api-core-service/api-core-service
Realiza una limpieza profunda del proyecto y compila las dependencias:

Bash
mvn clean compile
Levanta el microservicio:

Bash
mvn spring-boot:run
El servidor iniciará exitosamente en el puerto 8080 de tu máquina local: http://localhost:8080

🔌 Endpoints Disponibles
Obtener todos los ítems
URL: /api/v1/items

Método HTTP: GET

Headers: Content-Type: application/json

Respuesta Exitosa (200 OK):

JSON
[
  {
    "id": 1,
    "sku": "PROD-001",
    "name": "Componente Backend Primario",
    "stock": 50
  },
  {
    "id": 2,
    "sku": "PROD-002",
    "name": "Modulo Integracion Frontend",
    "stock": 35
  }
]
⚙️ Características Clave
CORS Habilitado: Configurado con @CrossOrigin(origins = "*") para permitir la integración directa con aplicaciones Frontend (Angular, React, Vue, etc.).

Estructura Limpia: Cumple con la separación de Beans exigida por el framework para evitar colisiones de dependencias.
