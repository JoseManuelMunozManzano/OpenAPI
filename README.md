# OpenAPI

Curso Udemy de introducción a OpenAPI: `https://www.udemy.com/course/openapi-beginner-to-guru`

## Overview of OpenAPI

OpenAPI es un standard adoptado para describir APIs, tecnológicamente agnóstico, es decir, se pueden beneficiar de él programadores Java, .NET, PHP...

La especificación OpenAPI se define usando `YAML` o `JSON` y está respaldada por un esquema formal, que define las propiedades del documento y sus tipos de datos.

Debido a que OpenAPI es un documento estructurado, puede leerse programáticamente. También hay muchas herramientas para trabajar con él, como convertidores, validadores, editores GUI, servicios Mock, Generadores SDK...

Por ejemplo, podemos llevarnos una especificación API directamente a Postman y obtener su funcionalidad.

También existe `OpenAPI CodeGen` para generar código del lado del servidor para más de 20 lenguajes, y código del lado del cliente para más de 40 lenguajes.

Usando una especificación OpenAPI, esta se convierte en la única fuente de la verdad de la que la API se supone que hace. Si el código fuente implementa esta especificación, se puede asumir que es correcto.

**Pet Clinic on Swagger Editor**

`https://editor.swagger.io/`

Las diferentes secciones de una especificación OpenAPI se consideran objetos.

En el ejemplo de la imagen, info es el objeto y title, description... son propiedades del objeto.

![alt Object](./images/01-OpenAPI-Sections-are-objects.png)

También existen objetos de operaciones, como muestra esta imagen.

![alt Operation Object](./images/02-Operation-Objects.png)

Podemos ver en dicha imagen que es una operación PUT con request body y su response.

**OpenAPI 2.0 vs 3.0**

![alt OpenAPI 2.0 vs 3.0](./images/03-OpenAPI-2-vs-3.png)

Este curso esta orientado a OpenAPI 3.0, que es donde la industria se está dirigiendo.

Cada una de las cajas se corresponde con un objeto definido en el esquema OpenAPI.

**YAML**

Sintaxis de YAML: `https://learnxinyminutes.com/docs/yaml/`

En este curso vamos a usar YAML para definir nuestras especificaciones OpenAPI (también se puede usar JSON)

## Defining a Microservice with OpenAPI

Vamos a ver los componentes principales e iremos paso a paso desarrollando nuestra especificación OpenAPI.

En este punto vamos a ver todo a un nivel muy superficial.

**Swagger Hub**

`https://swagger.io/tools/swaggerhub/`

Voy a usar el editor web de Swagger Hub para crear las especificaciones OpenAPI.

![alt Create Swagger Hub Project](./images/04-Create-Swagger-Hub-Project.png)

Una vez pulsado el botón para crear la API, vemos la pantalla del editor y su conversión gráfica Swagger al lado.

![alt Create Swagger Hub Editor](./images/05-Swagger-Hub-Editor.png)

**OpenAPI Specification**

Github con el código fuente de la especificación OpenAPI: `https://github.com/OAI/OpenAPI-Specification`

Esquema para la versión 3.1: `https://github.com/OAI/OpenAPI-Specification/blob/main/schemas/v3.1/schema.yaml`

Herramientas para distintos lenguajes de programación: `https://tools.openapis.org/`

Para VSCode existe el plugin `OpenAPI (Swagger) Editor` aquí: `https://marketplace.visualstudio.com/items?itemName=42Crunch.vscode-openapi`

**OpenAPI Info Object**

Ver: `https://swagger.io/specification/` en concreto ir a `OpenAPI Object`.

![alt OpenAPI Info Object](./images/06-OpenAPI-Info-Object.png)

Vemos que para definir una especificación OpenAPI válida, como mínimo hay que definir las propiedades `openapi`, `info` y `paths`.

Las propiedades que podemos definir para el objeto `info` son:

![alt Info Object](./images/07-Info-Object.png)

Siendo `title` y `version` obligatorias.

**OpenAPI Servers Object**

Los `servers` son un objeto opcional, por lo que no tenemos que especificarla. Es una forma de dar a los usuarios finales información sobre donde está disponible la API.

Ver: `https://swagger.io/specification/` en concreto ir a `Server Object`.

![alt Server Object](./images/08-Server-Object.png)

Si decidimos especificar el objeto `servers`, vemos que solo es obligatorio informar la propiedad `url`.

**OpenAPI Paths Object**

Los `paths` son un objeto requerido, pero puede aparecer como un array vacío:

```
paths: {}
```

Es la ruta de la API.

Ver: `https://swagger.io/specification/` en concreto ir a `Paths Object`.

![alt Paths Object](./images/09-Paths-Object.png)

Y las propiedades posibles de cada item object del array son:

![alt Paths Item Object](./images/10-Path-Item-Object.png)

Que a su vez se ramifican en más objetos con sus propiedades. Ver por ejemplo `Operation Object`.
