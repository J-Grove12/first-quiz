Enunciado:
Suponga que es el jefe de ingeniería de una nueva y emocionante startup tecnológica que instala paneles solares a través de una aplicación.
¡Es Uber para paneles solares! Estás realizando una auditoría de seguridad de la infraestructura de tu aplicación. Está utilizando OWASP Top 
10 para 2021 como guía sobre qué problemas de seguridad podrían ser un problema para usted.

Su infraestructura se implementa en contenedores de Kubernetes en Amazon Web Services. Tiene estos componentes:

Una aplicación móvil para Android e iOS.
Una interfaz web que el cliente puede utilizar en lugar de la aplicación móvil. Esto está escrito en Javascript con Next.js.
Una base de datos MySQL que almacena información del cliente, incluidas contraseñas, direcciones particulares, números de teléfono, etc.
También contiene información del pedido del cliente.
Un backend de Python implementado en FastAPI. Esto se comunica con la base de datos y proporciona datos tanto a la interfaz web como al
aplicaciones móviles.
Tiene 12 empleados de ingeniería de software que tienen acceso completo al sistema, 3 empleados de atención al cliente que pueden ver
la información del cliente y realizar cambios en pedidos y cuentas, y un empleado de ventas.

Utilizando OWASP Top 10, ¿qué buscaría para que su sistema sea seguro?

Solucion:Acontinuación daré solución al problema planteado, con la lista OSWAP Top 10 ajustando cada numero de la lista al problema

1. inyeccion SQL: Me aseguraría de que todas las consultas SQL sean seguras y estén protegidas contra inyecciones SQL utilizando consultas parametrizadas.

2. Autenticación: Verificaria si se tiene autenticación sólida, incluyendo contraseñas seguras, es decir que debe cumplir como minimo 3 condiciones de seguirida
    y autenticación en dos pasos o factores.
   
3. Exposición de datos sensibles:Reviso si esta establecido  vistas de datos apropiadas para las tres personas con acceso a los datos de los clientes. Esto puede ayudar
    a limitar su acceso solo a la información necesaria para realizar sus funciones sin exponer datos sensibles  e innecesarios
 
4. XML External Entity:Me aseguro de que las bibliotecas XML que utiliza estan actualizadas y son  seguras.

5. Control de acceso inadecuado: Se Revisa y  se ajusta  los permisos de acceso de cad amiembro del equipo si es necesario
   
6. Exposición de seguridad en configuraciones: Se Realiza auditorías en la configuración de su infraestructura, incluyendo contenedores Kubernetes y AWS
 
7. Cross-Site Scripting:se valida adecuadamente todas las entradas de usuario para prevenir ataques XSS, que se dan frecuentemente de parte del cliente
      en robo de sessiones o informacion

8. Deserialización insegura:Se busca si falta  validación y control en el proceso de deserialización de datos,que puedan dar oportunidad a ataques malisiosos

9.Utilización de componentes con vulnerabilidades conocidas:  se verifica bibliotecas, frameworks, o plugins que hacen parte de nuestra app y qeu las mismas no terngan vulnerabilidaes

10.Registro y monitoreo Insuficiente: se verifica la documentacion y registros de la app buscando vulnerabilidaes que pueden surgir por falta de toma de monitoreo y registros de los mismos

    

