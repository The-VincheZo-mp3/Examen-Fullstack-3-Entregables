# 🎓 Examen Transversal - Desarrollo FullStack III
**Sede:** Alameda  
**Docente:** Rodrigo Chacón  
**Integrantes:** Vicente Sánchez - Felipe Cáceres  

## 🚀 Proyecto: api-core-service (Spring Boot)
Este repositorio contiene el microservicio de la aplicación Core desarrollado en Java 17 con Spring Boot y Maven, junto con toda la documentación, informe técnico y presentación de la entrega final.

## 🛠️ Integración Continua (CI)
El proyecto cuenta con un pipeline automatizado en **GitHub Actions** que se ejecuta con cada `push` en las ramas `develop` o `main`. El pipeline realiza las siguientes tareas:
* Clonar el repositorio.
* Configurar el entorno con Java 17 (Temurin).
* Compilar el código fuente del microservicio.
* Ejecutar las pruebas unitarias automáticas con Maven (`mvn test`).
