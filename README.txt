#tecnologica y versiones utilizada
#Backend
-JAVA 17
#Frontend
-angular CLI 18.1.4
-note.js v20.16.0
-npm 10.8.1

#Base de datos
-PostgreSQL 16.4, compiled by Visual C++ build 1940, 64-bit

#Inicio Java spritboot
-abrir con algun IDE(en mi caso Eclipse) 
importar como proyecto maven existente
-"run as.. spring boot app" sobre el proyecto

#config spritboot
en "RestAPIApp\src\main\resources" está aplication.properties
considerar
spring.datasource.url=jdbc:postgresql://localhost:5432/ejercicioDB
spring.datasource.username=postgres
spring.datasource.password=admin123
spring.datasource.driver-class-name=org.postgresql.Driver

ya que seguramente tendran que medificar credenciales

#Inicio Angular
se debe entrar a la carpeta "frontApp" y en ella usar el CMD 
hubicandolo en la misma ruta y luego escribir "ng server"

#poblar
despues de levantar el servidor de spritboot y el de angular
usar ela archivo "pobar BD.SQL" en PGAdmin para poblar las tablas
