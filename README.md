# 📦 API Core Service & Frontend - Duoc UC

Este proyecto corresponde al **Examen Transversal de Fullstack III**. La solución ha sido completamente rediseñada bajo una **arquitectura desacoplada**, separando las responsabilidades del servidor de datos y la interfaz de usuario en dos capas independientes y autónomas.

---

## 👥 Integrantes
* **Vicente Sánchez**
* **Felipe Cáceres**

**Profesor:** Rodrigo Chacón  
**Sede:** Alameda

---

## 📁 Estructura del Proyecto Fullstack

El repositorio se organiza de la siguiente manera para facilitar el despliegue independiente:

```text
api-core-service/
├── backend/               # Servidor de Datos (API REST)
│   ├── src/               # Código fuente en Java 17 / Spring Boot
│   └── pom.xml            # Dependencias y configuración de Maven
└── Frontend/              # Capa de Presentación (Interfaz Web)
    └── index.html         # SPA Interactiva con Bootstrap y Fetch API
⚙️ Componentes de la Arquitectura
☕ 1. Backend (API REST)
Tecnología: Java 17, Spring Boot, Maven.

Función: Expone los endpoints REST para la gestión del inventario en formato JSON.

Puerto local: http://localhost:8080/items

🎨 2. Frontend (Single Page Application)
Tecnología: HTML5, CSS3 Simétrico, JavaScript (Modern Fetch API) y Bootstrap 5.

Función: Interfaz de usuario limpia y adaptativa que consume los datos de la API en tiempo real sin recargar la página. Cuenta con validaciones interactivas en el formulario para asegurar la calidad de los datos ingresados.

🚀 Integración Continua (CI/CD)
El proyecto cuenta con un pipeline automatizado en GitHub Actions (ci-cd.yml) que se ejecuta en cada push o pull request a las ramas main y develop. Este pipeline realiza dos etapas críticas:

backend-validation: Configura Java 17 y compila/testea el backend con Maven de forma automatizada.

frontend-validation: Escanea la arquitectura, comprueba la existencia de la interfaz web y valida que el archivo index.html mantenga una estructura semántica correcta.
