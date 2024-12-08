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
