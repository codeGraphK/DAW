/* 
 * Ejecicio 1: Crear la tabla pedidos con las siguientes características.
 * Atributos: num_pedido, fecha_ pedido, clie, cod_vend, fabrica, producto, 
 * cant, importe.
 * Clave primaria: num_pedido
 */

CREATE TABLE pedidos 
(num_pedido VARCHAR2 (10) PRIMARY KEY, 
fecha_pedido DATE, 
clie VARCHAR2 (5),
cod_vend VARCHAR2 (5),
fabrica VARCHAR2 (5),
producto VARCHAR2 (5),
cant NUMBER(3),
importe NUMBER(8,2));

/* RESULTADO: Table PEDIDOS creado */

/* 
 * Ejercicio 2: Crear otra tabla pedidos 1 con las mismas características 
 * que la anterior, pero añadiendo las siguientes claves ajenas.
 * Claves ajenas: cod_cli, cod_vend y cod_fab + cod_prod.
 * En la BD deben existir las siguientes tablas:
 * clientes (cod_cli, ...)
 * vendedores (cod_vend, ...)
 * productos (cod_fab, cod_prod, ...) 
 */

CREATE TABLE clientes (cod_cli VARCHAR2 (5) PRIMARY KEY);

/* RESULTADO: Table CLIENTES creado */

CREATE TABLE vendedores (cod_vend VARCHAR2 (5) PRIMARY KEY);

/* RESULTADO: Table VENDEDORES creado */

CREATE TABLE productos 
(cod_fab VARCHAR2 (5),
cod_prod VARCHAR2 (5),
PRIMARY KEY(cod_fab, cod_prod));

/* RESULTADO: Table PRODUCTOS creado */

CREATE TABLE pedidos1 
(num_pedido VARCHAR2 (10) PRIMARY KEY, 
fecha_pedido DATE, 
clie VARCHAR2 (5),
cod_vend VARCHAR2 (5),
fabrica VARCHAR2 (5),
producto VARCHAR2 (5),
cant NUMBER(3),
importe NUMBER(8,2),
FOREIGN KEY (clie) REFERENCES clientes,
FOREIGN KEY (cod_vend) REFERENCES vendedores,
FOREIGN KEY (fabrica, producto) REFERENCES productos);

/* RESULTADO: Table PEDIDOS1 creado */

/* 
 * Ejercicio 3: Crear la tabla documento con los siguientes campos:
 * tipo: A si es un artículo y L si es un libro.
 * cod_doc: 4 caracteres.
 * titulo: 25 caracteres. No puede ser nulo.
 * idioma: 20 caracteres.
 * nom_edi: 30 caracteres.
 * año: Numérico (4). Año > 1950.
 * isbn: Numérico (10).
 * Clave primaria: tipo + cod_doc
 * isbn: es único para cada fila.
 * Al crear la tabla, deberemos indicar que si el tipo es un artículo, 
 * no tendrá Isbn ni Editorial, al igual que si es libro, no podrán ser 
 * nulos los campos Isbn y Editorial 
 */

CREATE TABLE documento (
tipo CHAR (1) CHECK (tipo IN ('A', 'L')),
cod_doc VARCHAR2 (4) NOT NULL,
titulo VARCHAR2 (25) NOT NULL,
idioma VARCHAR2 (20),
nom_edi VARCHAR2 (30),
anio NUMBER (4) CHECK (anio > 1950),
isbn NUMBER (10),
PRIMARY KEY (tipo, cod_doc),
UNIQUE (isbn),
CHECK (
  (tipo='A' AND isbn IS NULL AND nom_edi IS NULL) OR 
	(tipo='L' AND isbn IS NOT NULL AND nom_edi IS NOT NULL)
  )
);

/* RESULTADO: Table DOCUMENTO creado */

/* 
 * Ejercicio 4: Modificar la tabla pedidos en lo siguiente:
 * El campo fecha ponerlo a NOT NULL
 * Añadir un atributo má que sea el teléfono de contacto con el cliente
 * Aumentar el tamaño del campo cod_vend
 */

ALTER TABLE pedidos MODIFY fecha_pedido DATE NOT NULL;
/* RESULTADO: Table PEDIDOS alterado */
ALTER TABLE pedidos ADD telefono VARCHAR (9);
/* RESULTADO: Table PEDIDOS alterado */
ALTER TABLE vendedores MODIFY cod_vend VARCHAR(6);
/* RESULTADO: Table VENDEDORES alterado */
ALTER TABLE pedidos MODIFY cod_vend VARCHAR(6);
/* RESULTADO: Table PEDIDOS alterado */

/* Ejercicio 5: Borrad todas las tablas creadas en esta práctica excepto documento */

DROP TABLE pedidos;
/* RESULTADO: Table PEDIDOS borrado. */
DROP TABLE pedidos1;
/* RESULTADO: Table PEDIDOS1 borrado. */
DROP TABLE clientes;
/* RESULTADO: Table CLIENTES borrado. */
DROP TABLE vendedores;
/* RESULTADO: Table VENDEDORES borrado. */
DROP TABLE productos;
/* RESULTADO: Table PRODUCTOS borrado. */
DROP TABLE documento;
/* RESULTADO: Table DOCUMENTO borrado. */