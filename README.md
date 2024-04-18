# Proyecto de Gestión de Estudiantes

Este proyecto es una aplicación de gestión de estudiantes desarrollada en Java con Spring Boot, utilizando MongoDB como base de datos. Proporciona endpoints RESTful para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre los datos de los estudiantes.

## Verbos HTTP y sus definiciones

- **GET**: Recupera información de un recurso.
- **POST**: Crea un nuevo recurso.
- **DELETE**: Elimina un recurso.
- **PUT**: Actualiza un recurso por completo.
- **PATCH**: Actualiza parcialmente un recurso.
- **HEAD**: Realiza una solicitud a un recurso sin obtener su contenido, utilizado para verificar la existencia del recurso y obtener información sobre el encabezado.
- **OPTIONS**: Devuelve los métodos HTTP que el servidor soporta para un recurso determinado.

## Tecnologías Utilizadas

- **MongoDB**: Base de datos NoSQL utilizada para almacenar los datos de los estudiantes.
- **Mongo Express**: Interfaz de usuario web para administrar la base de datos MongoDB.
- **Spring Boot**: Marco de trabajo de desarrollo de aplicaciones Java que facilita la creación de aplicaciones Spring.
- **Lombok**: Biblioteca Java que ayuda a reducir el código redundante generando automáticamente métodos de acceso (getter/setter), constructores, etc.
- **Docker**: Plataforma de contenedores que simplifica el despliegue de aplicaciones en entornos aislados.

## Conceptos Clave

- **Querys**: Consultas utilizadas para recuperar datos de una base de datos.
- **Lombok**: Herramienta de productividad para el desarrollo de Java que reduce la cantidad de código repetitivo necesario en las clases Java.
- **Spring Boot**: Marco de trabajo de Spring que facilita la creación de aplicaciones Java.
- **MongoDB**: Base de datos NoSQL orientada a documentos.
- **Mongo Express**: Interfaz de usuario web para MongoDB que permite administrar y visualizar datos de la base de datos.
- **Docker**: Plataforma de contenedores que simplifica la creación, el despliegue y la gestión de aplicaciones en entornos aislados.

## Ejecución del Proyecto

1. Clona el repositorio a tu máquina local.
2. Asegúrate de tener Docker instalado y ejecutándose en tu sistema.
3. Construye la imagen de Docker para la aplicación Spring Boot.
4. Ejecuta un contenedor Docker basado en la imagen construida.
5. Accede a la interfaz de usuario de Mongo Express para administrar tu base de datos.

## Contribución

Las contribuciones son bienvenidas. Si deseas contribuir a este proyecto, asegúrate de seguir las pautas de contribución y envía tus cambios a través de un pull request.

## Licencia

Este proyecto está licenciado bajo la [Licencia MIT](LICENSE).
