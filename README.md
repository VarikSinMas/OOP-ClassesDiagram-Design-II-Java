# OOP-ClassesDiagram-Design-II-Java
Programación Orientada a Objetos (Java IntelliJ)

ACTIVIDAD:

Una vez realizado el diseño de la gestión de los almacenes de la empresa WoodShops nos han pedido ampliar la aplicación y añadir el diseño e implementación de la gestión de las ventas de los productos.

Los clientes lo son de WoodShop y pueden ser clientes registrados o clientes sin registrar, en el caso de este último el cliente es anónimo y no se necesita almacenar ningún dato. Existen dos tipos de clientes registrados, profesionales y WoodFriend. Los datos que necesitamos conocer de todos los clientes es el NIF y el nombre. Los clientes profesionales tienen un descuento en todas las ventas, este descuento es distinto para cada cliente, en cambio los clientes WoodFriend son clientes asiduos a los cuales se les ofrece ofertas especiales, así pues, de este tipo de clientes necesitamos almacenar un código de socio que se les asigna.

Las ventas las realizan las tiendas, cada venta supone un ticket o factura, de cada ticket debemos almacenar un número de ticket, la fecha y el cliente en caso de que sea un cliente registrado, además cada ticket tiene sus líneas de detalle, una línea almacena un producto y la cantidad de unidades compradas de ese producto.

Se deben implementar las opciones siguientes:

Añadir nuevos clientes en WoodShops
Mostrar listado de todos los clientes, indicando el tipo de cliente.
Añadir ticket de venta en la tienda, al añadir el ticket de venta, además se debe mostrar por pantalla el ticket completo, número, fecha, cliente en caso de ser un cliente registrado, todo el detalle del ticket y el total del importe del ticket teniendo en cuenta el posible descuento en caso de cliente profesional.
Mostrar un listado de resumen de tickets en la tienda, se debe filtrar entre una fecha de inicio y una fecha fin y se debe mostrar, el número, fecha, cliente en caso de ser cliente registrado, el descuento aplicado si procede y el total del importe del ticket.
