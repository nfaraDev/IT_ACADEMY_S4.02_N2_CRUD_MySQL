# Api Rest con Spring boot CRUD_MySQL

****HTTP **********************************************************************************************************************************
 HTTP (Hypertext Transfer Protocol) es un protocolo de comunicación utilizado para transferir datos en la web. Funciona como un protocolo cliente-servidor,
donde el cliente envía una solicitud al servidor y este último responde con una respuesta. La comunicación entre el cliente y el servidor se realiza a través
de mensajes HTTP, que contienen información sobre la solicitud o respuesta.

************************************************************************************************************************************************************ 

- Ejercicio CRUD con MySQL

Accede en la página ->https://start.spring.io/, y genera un proyecto Spring boot con las siguientes características:

PROJECT (gestor de dependencias): Maven o Gradle.
LANGUAGE:                         Java.
SPRING BOOT:                     La última versión estable.
PROJECT METADATA Group:          cat.itacademy.barcelonactiva.apellidos.nombre.s04.t02.n02
Artifact:                        S04T02N02GognomsNom
Name:                            S04T02N02GognomsNom
Description:                     S04T02N02GognomsNom
Package name:                    cat.itacademy.barcelonactiva.apellidos.nombre.s04.t02.n02
PACKAGIN:                        Jar
JAVA:                            Mínimo versión 11
Dependencias:
                                 Spring Boot DevTools
                                 Spring Web
                                 Spring Data JPA
                                 MySQL Driver
                                 
Tenemos una entidad llamada "Fruta", que dispone de las siguientes propiedades:
int id
String nombre
int pesoKg

Aprovechando la especificación JPA,Tienes que hacer el mismo que al nivel 1, pero persistiendo los datos a MySQL, siguiendo el patrón MVC. 
Para lo cual, dependiendo del Package principal, crearás una estructura de packages, donde ubicarás las clases que necesites:

cat.itacademy.barcelonactiva.apellidos.nombre.s04.t02.n02.controllers
cat.itacademy.barcelonactiva.apellidos.nombre.s04.t02.n02.modelo.domain
cat.itacademy.barcelonactiva.apellidos.nombre.s04.t02.n02.modelo.services
cat.itacademy.barcelonactiva.apellidos.nombre.s04.t02.n02.modelo.repository
La clase ubicada al paquete controllers (FruitaController, por ejemplo), tendrá que ser capaz de dar respuesta a las siguientes
peticiones para actualizar y consultar información:

http://localhost:8080/fruta/add

http://localhost:8080/fruta/update

http://localhost:8080/fruta/delete/{*id}

http://localhost:8080/fruta/getOne/{*id}

http://localhost:8080/fruta/getAll

## Enlaces

   - [Enlace MySQL-Http]([((https://www.youtube.com/watch?v=u8a25mQcMOI&t=762s)])

## Uso

 A continuación, se explica cómo funciona HTTP y una API REST:

HTTP: El funcionamiento básico de HTTP implica los siguientes pasos:
  El cliente envía una solicitud HTTP al servidor utilizando un método HTTP, como GET, POST, PUT o DELETE. La solicitud incluye una URL que identifica el recurso al que se desea acceder.
  El servidor recibe la solicitud y procesa la acción correspondiente según el método HTTP especificado.
  El servidor genera una respuesta HTTP que contiene un código de estado, como 200 OK para una solicitud exitosa, y opcionalmente datos adicionales en el cuerpo de la respuesta.
  El cliente recibe la respuesta del servidor y procesa los datos según sea necesario.
  Los métodos HTTP más comunes son:
  -GET: se utiliza para obtener datos de un recurso.
  -POST: se utiliza para enviar datos al servidor y crear un nuevo recurso.
  -PUT: se utiliza para actualizar un recurso existente en el servidor.
  -DELETE: se utiliza para eliminar un recurso existente en el servidor.
  Además de los métodos, HTTP también define otros elementos importantes, como los encabezados HTTP, que proporcionan información adicional sobre la solicitud o respuesta,
  y los códigos de estado, que indican el resultado de la operación.

API REST: Una API REST se basa en los principios de REST y utiliza HTTP como protocolo de comunicación. Algunas características clave de una API REST son:
  -Recursos: los recursos son entidades que se pueden acceder a través de la API, como usuarios, productos o pedidos. Cada recurso tiene una URL única que lo identifica.
  -Métodos HTTP: los métodos HTTP se utilizan para realizar operaciones en los recursos. Por ejemplo, GET para obtener un recurso, POST para crear un nuevo recurso, PUT para
   actualizar un recurso existente y DELETE para eliminar un recurso.
  -Códigos de estado: los códigos de estado HTTP se utilizan para indicar el resultado de una operación. Algunos códigos de estado comunes son 200 OK para una solicitud exitosa,
   201 Created para una creación exitosa de un recurso y 404 Not Found si el recurso no existe.
  -Representaciones: las representaciones son la forma en que se presentan los datos de un recurso. Por ejemplo, un recurso puede tener una representación en formato JSON o XML.
  -HATEOAS (Hypermedia as the Engine of Application State): este principio de REST implica que la API proporciona enlaces a otros recursos relacionados, lo que permite la navegación 
   y descubrimiento de la API de manera dinámica.
  -Al diseñar una API REST, es importante seguir las mejores prácticas, como utilizar nombres de recursos significativos, utilizar los métodos HTTP de manera adecuada y proporcionar
   mensajes de error descriptivos.
