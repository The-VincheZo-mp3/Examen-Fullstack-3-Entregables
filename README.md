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
