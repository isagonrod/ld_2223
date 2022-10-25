# ld_2223

## GIT. Pasos para crear un repositorio en GitHub
1. Crear cuenta en GitHub si no se tiene.
2. Crear nuevo repositorio, dándole un nombre y poniéndolo público o privado (según se quiera).
3. Ir a la carpeta de nuestro escritorio donde está el proyecto que queremos subir al repositorio.
4. Abrir un Terminal (en Linux) o un Power Shell (en Windows).
5. Escribir los siguientes comandos:
<br>`$ git init <nombre_repositorio>`
<br>`$ git add .`
<br>`$ git commit -m "First commit"`
<br>`$ git remote add origin <url_repositorio.git>`
<br>`$ git push origin master`

## ENLAZAR A BASE DE DATOS MySQL DE DOCKER (en Windows)
1. Instalar Docker Desktop y dejarlo arrancado
2. Abrir un Power Shell y poner, en primer lugar, el contenedor de 'Portainer', que servirá para gestionar de manera más eficiente nuestros contenedores:
<br>`$ docker volume create portainer_data`
<br>`$ docker run -d -p 8000:8000 -p 9443:9443 --name portainer --restart=always -v /var/run/docker.sock:/var/run/docker.sock -v portainer_data:/data portainer/portainer-ce:alpine`
3. Después poner el contenedor de MySQL:
<br>`$ docker volume create mysql-local-1_data`
<br>`$ docker run -p 3306:3306 --name mysql -e MYSQL_ROOT_PASSWORD=<contraseña> -v mysql_data:/var/lib/mysql -d mysql:latest`
<br>NOTA: La contraseña es opcional, aunque se recomienda siempre tener contraseña por motivos de seguridad.
4. Mirar en Docker Desktop si el contenedor de MySQL está arrancado. Si no lo está, arrancarlo.
5. Abrir el proyecto en el IntelliJ y desplegar la pestaña del lateral derecho donde pone "Database".
6. Hacer click sobre el símbolo "+" y buscar "MySQL".
![image](https://user-images.githubusercontent.com/98974760/196768818-f19246ee-1e93-4694-9438-e4fc05ad355b.png)
7. Introducir usuario y contraseña (si se tiene).
