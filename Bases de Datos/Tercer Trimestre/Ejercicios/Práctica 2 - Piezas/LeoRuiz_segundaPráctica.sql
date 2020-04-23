/* Ejercicio 1: Crear las siguientes tablas con los datos que se indican: */

CREATE TABLE suministrador (
        num_sum VARCHAR2(3) NOT NULL PRIMARY KEY CHECK(num_sum LIKE 'S%'),
        nom_sum VARCHAR2(8) NOT NULL,
        categoria VARCHAR2(2) DEFAULT 0,
        ciudad VARCHAR(11)
);

/* Resultado: Table SUMINISTRADOR creado. */

INSERT INTO suministrador (num_sum, nom_sum, categoria, ciudad) VALUES ('S1', 'Javier', 20, 'Londres'); /* Resultado: 1 fila insertadas. */
INSERT INTO suministrador (num_sum, nom_sum, categoria, ciudad) VALUES ('S2', 'Juan', 10, 'París'); /* Resultado: 1 fila insertadas. */
INSERT INTO suministrador (num_sum, nom_sum, categoria, ciudad) VALUES ('S3', 'Blas', 30, 'París'); /* Resultado: 1 fila insertadas. */
INSERT INTO suministrador (num_sum, nom_sum, categoria, ciudad) VALUES ('S4', 'Carlos', 20, 'Londres'); /* Resultado: 1 fila insertadas. */
INSERT INTO suministrador (num_sum, nom_sum, categoria, ciudad) VALUES ('S5', 'Andrés', 30, 'Atenas'); /* Resultado: 1 fila insertadas. */

CREATE TABLE piezas (
        num_piez VARCHAR2(3) NOT NULL PRIMARY KEY CHECK(num_piez LIKE 'P%'),
        nom_piez VARCHAR2(9) NOT NULL,
        color VARCHAR2(9) DEFAULT 'Metal',
        peso NUMBER(3) NOT NULL,
        ciudad VARCHAR(7)
);

/* Resultado: Table PIEZAS creado. */

INSERT INTO piezas (num_piez, nom_piez, color, peso, ciudad) VALUES ('P1', 'Tuerca', 'Rojo', 12, 'Londres'); /* Resultado: 1 fila insertadas. */
INSERT INTO piezas (num_piez, nom_piez, color, peso, ciudad) VALUES ('P2', 'Cerrojo', 'Verde', 17, 'París'); /* Resultado: 1 fila insertadas. */
INSERT INTO piezas (num_piez, nom_piez, color, peso, ciudad) VALUES ('P3', 'Tornillo', 'Azul', 17, 'Roma'); /* Resultado: 1 fila insertadas. */
INSERT INTO piezas (num_piez, nom_piez, color, peso, ciudad) VALUES ('P4', 'Rueda', 'Rojo', 14, 'Londres'); /* Resultado: 1 fila insertadas. */
INSERT INTO piezas (num_piez, nom_piez, color, peso, ciudad) VALUES ('P5', 'Leva', 'Azul', 12, 'París'); /* Resultado: 1 fila insertadas. */
INSERT INTO piezas (num_piez, nom_piez, color, peso, ciudad) VALUES ('P6', 'Rueda', 'Rojo', 19, 'Londres'); /* Resultado: 1 fila insertadas. */

CREATE TABLE suministro_piezas (
        num_sum VARCHAR2(3) NOT NULL CHECK(num_sum LIKE 'S%'),
        num_piez VARCHAR2(3) NOT NULL CHECK(num_piez LIKE 'P%'),
        cantidad NUMBER(4) NOT NULL,
        PRIMARY KEY (num_sum, num_piez),
        FOREIGN KEY (num_sum) REFERENCES suministrador ON DELETE CASCADE,
        FOREIGN KEY (num_piez) REFERENCES piezas ON DELETE CASCADE
);

/* Resultado: Table SUMINISTRO_PIEZAS creado. */

INSERT INTO suministro_piezas (num_sum, num_piez, cantidad) VALUES ('S1','P1',300); /* Resultado: 1 fila insertadas. */
INSERT INTO suministro_piezas (num_sum, num_piez, cantidad) VALUES ('S1','P2',200); /* Resultado: 1 fila insertadas. */
INSERT INTO suministro_piezas (num_sum, num_piez, cantidad) VALUES ('S1','P3',400); /* Resultado: 1 fila insertadas. */
INSERT INTO suministro_piezas (num_sum, num_piez, cantidad) VALUES ('S1','P4',200); /* Resultado: 1 fila insertadas. */
INSERT INTO suministro_piezas (num_sum, num_piez, cantidad) VALUES ('S1','P5',100); /* Resultado: 1 fila insertadas. */
INSERT INTO suministro_piezas (num_sum, num_piez, cantidad) VALUES ('S1','P6',100); /* Resultado: 1 fila insertadas. */
INSERT INTO suministro_piezas (num_sum, num_piez, cantidad) VALUES ('S2','P1',300); /* Resultado: 1 fila insertadas. */
INSERT INTO suministro_piezas (num_sum, num_piez, cantidad) VALUES ('S2','P2',400); /* Resultado: 1 fila insertadas. */
INSERT INTO suministro_piezas (num_sum, num_piez, cantidad) VALUES ('S3','P2',200); /* Resultado: 1 fila insertadas. */
INSERT INTO suministro_piezas (num_sum, num_piez, cantidad) VALUES ('S4','P2',200); /* Resultado: 1 fila insertadas. */
INSERT INTO suministro_piezas (num_sum, num_piez, cantidad) VALUES ('S4','P4',300); /* Resultado: 1 fila insertadas. */
INSERT INTO suministro_piezas (num_sum, num_piez, cantidad) VALUES ('S4','P5',400); /* Resultado: 1 fila insertadas. */

/* Ejercicio 2: Obtener los datos del suministrador S1 */

SELECT * FROM suministrador WHERE num_sum = 'S1';

/*  Resultado:

    NUM_SUM	NOM_SUM	CATEGORIA	CIUDAD
    S1	Javier	20	Londres
 */

/* Ejercicio 3: Obtener el valor medio de las cantidades vendidas de cada pieza */

SELECT num_piez, AVG(cantidad) cantMedia FROM suministro_piezas GROUP BY num_piez;

/*  Resultado:
    
    NUM_PIEZ	CANTMEDIA
    P6	100
    P1	300
    P2	250
    P5	250
    P3	400
    P4	250
 */

/* Ejercicio 4: Doblar la categoría de todos los sumistradores que estén en París */

UPDATE suministrador SET categoria = categoria * 2 WHERE ciudad = 'París';

/* Resultado: 2 filas actualizadas. */

/* Ejercicio 5: Los suministradores cuya categoría esté por debajo de la media de categoría, pasarán a Madrid */

UPDATE suministrador SET ciudad = 'Madrid' WHERE categoria < (SELECT AVG(categoria) FROM suministrador);

/* Resultado: 3 filas actualizadas. */

/* Ejercicio 6: Definir una vista llamada BUENOS con los suministradores cuya categoría sea mayor que 22 */

CREATE VIEW BUENOS AS SELECT * FROM suministrador WHERE categoria > 22;

/* Resultado: View BUENOS creado. */

/* Ejercicio 7: Obtener los datos de los suministradores de la vista anterior que no vivan en Londres */

SELECT * FROM buenos WHERE ciudad <> 'Londres';

/*  Resultado:
    
    NUM_SUM	NOM_SUM	CATEGORIA	CIUDAD
    S5	Andrés	30	Atenas
    S3	Blas	60	París
 */

/* Ejercicio 8: Enviar a Nueva York a los suministradores anteriores que vivan en París */

UPDATE (SELECT * FROM buenos WHERE ciudad <> 'Londres') SET ciudad = 'Nueva York' WHERE ciudad = 'París';

/* Resultado: 1 fila actualizadas. */

/* Ejercicio 9: Añadir un nuevo suministrador a la vista anterior ('S6', 'Luis', 25, 'Madrid') */

INSERT INTO buenos (num_sum, nom_sum, categoria, ciudad) VALUES ('S6', 'Luis', 25, 'Madrid');

/* Resultado: 1 fila insertadas. */

/* Ejercicio 10: Borrar los buenos suministradores que vivan en Nueva York */

DELETE FROM buenos WHERE ciudad = 'Nueva York';

/* Resultado: 1 fila eliminado */

/* Ejercicio 11: Definir una vista tomando como tabla base PIEZAS, que se llame PIROJAS y que contenga las piezas que sean rojas  */

CREATE VIEW PIROJAS AS SELECT * FROM piezas WHERE color = 'Rojo';

/* Resultado: View PIROJAS creado. */

/* Ejercicio 12: Definir una vista llamada PIROJASLON con las piezas rojas que hay en Londres  */

CREATE VIEW PIROJASLON AS SELECT * FROM piezas WHERE color = 'Rojo' AND ciudad = 'Londres';

/* Resultado: View PIROJASLON creado. */

/* Ejercicio 13: Definir una vista que agrupe las piezas vendidas dando la cantidad total de suministros por cada pieza  */

CREATE VIEW piezasTotal AS SELECT num_piez, SUM(cantidad) cantTotal FROM suministro_piezas GROUP BY num_piez;

/* Resultado: View PIEZASTOTAL creado. */

/* Ejercicio 14: Obtener los nombres de las piezas de la vista anterior cuyas ventas superen la cantidad de 500 */

SELECT piezas.nom_piez FROM piezas, piezasTotal WHERE piezas.num_piez = piezasTotal.num_piez AND piezasTotal.cantTotal > 500;

/*  Resultado:

    NOM_PIEZ
    Cerrojo
    Tuerca
 */

/* Ejercicio 15: Poner la categoría a cero al suministrador S3 de la vista de buenos suministradores */

UPDATE buenos SET categoria = 0 WHERE num_sum = 'S3';

/* Resultado: 0 filas actualizadas. */

/* Ejercicio 16: Añadir un nuevo suministrador a los buenos suministradores ('S7', 'Pepe', 7, 'Lisboa') */

INSERT INTO buenos (num_sum, nom_sum, categoria, ciudad) VALUES ('S7', 'Pepe', 7, 'Lisboa');

/* Resultado: 1 fila insertadas. */

/* Ejercicio 17: Obtener el número total de suministradores */

SELECT COUNT(num_sum) contSum FROM suministrador;

/*  Resultado:

    CONTSUM
    6
 */

/* Ejercicio 18: Obtener el número total de suministradores que suministran piezas */

SELECT COUNT(num_sum) contSumPie FROM (SELECT DISTINCT num_sum FROM suministro_piezas);

/*  Resultado:

    CONTSUMPIE
    3
 */

/* Ejercicio 19: Obtener el número total de suminstradores de la pieza P2 */

SELECT COUNT(num_sum) contSumPieP2 FROM (SELECT DISTINCT num_sum FROM suministro_piezas WHERE num_piez = 'P2');

/*  Resultado:

    CONTSUMPIEP2
    3
 */

/* Ejercicio 20: Obtener la cantidad total que se ha suministrado de la pieza P2 */

SELECT SUM(cantidad) cantTotalP2 FROM suministro_piezas WHERE num_piez = 'P2';

/*  Resultado:

    CANTTOTALP2
    800
 */

/* Ejercicio 21: Obtener el número total de suministradores que tienen una categoría por debajo de la máxima */

SELECT COUNT(num_sum) belowMax FROM (SELECT num_sum FROM suministrador WHERE suministrador.categoria < (SELECT MAX(categoria) FROM suministrador));

/*  Resultado:
    
    BELOWMAX
    5
 */

/* Ejercicio 22: Obtener el número de los suministradores que tienen una categoría por encima de la media de los de su ciudad */

SELECT num_sum  
FROM (
        SELECT num_sum 
        FROM suministrador, (
                SELECT ciudad, 
                AVG(categoria) avgCat 
                FROM suministrador 
                GROUP BY ciudad) mediaCiudades 
        WHERE suministrador.ciudad = mediaCiudades.ciudad AND suministrador.categoria > mediaCiudades.avgCat);

/*  Resultado:

    NUM_SUM
    S6
 */

/* Ejercicio 23: Obtener el número total de suministradores de París con categoría 20 */

SELECT COUNT(num_sum) sumPar20 FROM suministrador WHERE ciudad = 'Paris' AND categoria = 20;

/*  Resultado:

    SUMPAR20
    0
 */

/* Ejercicio 24: Obtener los pares de números de suminstradores y números de piezas de la tabla SUMINSTRO_PIEZAS que están en la misma ciudad */

SELECT num_sum, num_piez 
FROM suministro_piezas, (
        SELECT piezas.num_piez PIEZAEQ, suministrador.num_sum SUMEQ 
        FROM piezas, suministrador 
        WHERE piezas.ciudad = suministrador.ciudad) iguales 
WHERE num_sum = iguales.sumeq AND num_piez = iguales.piezaeq;

/* No hay resultado */

/* Ejercicio 25: Igual que la consulta anterior pero excluyendo a los suminstradores con categoría igual a 20 */

SELECT num_sum, num_piez 
FROM suministro_piezas, (
        SELECT piezas.num_piez PIEZAEQ, suministrador.num_sum SUMEQ 
        FROM piezas, suministrador 
        WHERE piezas.ciudad = suministrador.ciudad AND suministrador.categoria <> 20) iguales 
WHERE num_sum = iguales.sumeq AND num_piez = iguales.piezaeq;

/* No hay resultado */

/* Ejercicio 26: Por cada pieza suministrada, obtener su número, la cantidad máxima y mínima de ella vendida, excluyendo las ventas de S1 */

SELECT num_piez, MAX(cantidad), MIN(cantidad) FROM suministro_piezas WHERE num_sum <> 'S1' GROUP BY num_piez;

/*  Resultado:

    NUM_PIEZ	MAX(CANTIDAD)	MIN(CANTIDAD)
    P1	300	300
    P2	400	200
    P5	400	400
    P4	300	300
 */

/* Ejercicio 27: Obtener los números de piezas que sean vendidas por más de un suministrador */

SELECT DISTINCT num_piez 
FROM suministro_piezas, (
        SELECT num_piez pieza, 
        COUNT(num_sum) cantSum
        FROM suministro_piezas 
        GROUP BY num_piez) cantSumPie
WHERE num_piez = cantsumpie.pieza AND cantsumpie.cantsum >  1;

/*  Resultado:

    NUM_PIEZ
    P5
    P1
    P2
    P4
 */

/* Ejercicio 28: Obtener los códigos de las piezas cuyo peso está entre 16 y 19, ambos incluidos */

SELECT num_piez FROM piezas WHERE peso >= 16 AND peso <= 19;

/*  Resultado:

    NUM_PIEZ
    P2
    P3
    P6
 */

/* Ejercicio 29: Obtener los números y nombres de las piezas cuyo nombre empiece por 'C' */

SELECT num_piez, nom_piez FROM piezas WHERE nom_piez LIKE 'C%';

/*  Resultado:

    NUM_PIEZ	NOM_PIEZ
    P2	Cerrojo
 */

/* Ejercicio 30: Obtener los números de suministradores con categoría desconocida */

SELECT num_sum FROM suministrador WHERE categoria = 0;

/* No hay resultado */

/* Ejercicio 31: De aquellas piezas que pesen 12, 16 o 17, obtener sus números de piezas */

SELECT num_piez FROM piezas WHERE peso IN(12,16,17);

/*  Resultado:

    NUM_PIEZ
    P1
    P2
    P3
    P5
 */

/* Ejercicio 32: Obtener el nombre de los suministradores que venden la pieza P2 */

SELECT nom_sum FROM suministrador, (SELECT num_sum FROM suministro_piezas WHERE num_piez = 'P2') p2Sum WHERE suministrador.num_sum = p2sum.num_sum;

/*  Resultado:

    NOM_SUM
    Javier
    Juan
    Carlos
 */

/* Ejercicio 33: Obtener el nombre de los suministradores que venden al menos una pieza roja */

SELECT DISTINCT S.nom_sum
FROM suministrador S JOIN suministro_piezas SP on S.num_sum = SP.num_sum
        JOIN piezas P ON p.num_piez = SP.num_piez AND p.color = 'Rojo';

/*  Resultado:

    NOM_SUM
    Juan
    Carlos
    Javier
 */

/* Ejercicio 34: Obtener los identificadores de las piezas servidas por un sólo suministrador */

SELECT num_piez 
FROM suministro_piezas S, (SELECT num_piez pieza, COUNT(num_sum) sumCount FROM suministro_piezas GROUP BY num_piez) countOnes
WHERE S.num_piez = countOnes.pieza AND countOnes.sumCount = 1;

/*  Resultado:

    NUM_PIEZ
    P3
    P6
 */

/* Ejercicio 35: Obtener el número de los suministradores y número de piezas, que venden al menos una pieza suministrada por S2 (S2 no debe salir en el resultado) */

SELECT num_sum, num_piez
FROM suministro_piezas SP, (SELECT num_piez pieza FROM suministro_piezas WHERE num_sum = 'S2') R 
WHERE num_sum <> 'S2' AND SP.num_piez = R.pieza;

/*  Resultado:

    NUM_SUM	NUM_PIEZ
    S1	P1
    S1	P2
    S4	P2
 */

/* Ejercicio 36: Obtener el número de los suministradores y número de pieza, que venden al menos una pieza en una cantidad mayor que la cantidad suministrada por S1 de esa pieza */

SELECT num_sum, num_piez 
FROM suministro_piezas SP, (SELECT num_piez pieza, cantidad cant FROM suministro_piezas WHERE num_sum = 'S1') pieS1
WHERE sp.num_piez = pieS1.pieza AND SP.cantidad > pieS1.cant;

/*  Resultado:

    NUM_SUM	NUM_PIEZ
    S2	P2
    S4	P4
    S4	P5
 */

/* Ejercicio 37: Obtener el nombre de los suministradores que venden al menos una pieza */

SELECT S.nom_sum FROM suministrador S, (SELECT DISTINCT num_sum FROM suministro_piezas) sumSP
WHERE S.num_sum = sumSP.num_sum;

/*  Resultado:

    NOM_SUM
    Javier
    Juan
    Carlos
 */

/* Ejercicio 38: Obtener el nombre de los suministradores que venden todas las piezas */

SELECT nom_sum 
FROM suministrador 
JOIN (
        SELECT num_sum, COUNT(num_piez) totPiezas
        FROM suministro_piezas
        GROUP BY num_sum) totSP ON suministrador.num_sum = totSP.num_sum 
JOIN (SELECT COUNT(num_piez) total FROM piezas) P ON totSP.totPiezas = P.total;

/*  Resultado:

    NOM_SUM
    Javier
 */

/* Ejercicio 39: Cambiar a amarillo el color de la pieza P2, incrementar su peso en 5 y poner su ciudad a nulo */

UPDATE piezas SET color = 'Amarillo', peso = peso + 5, ciudad = null WHERE num_piez = 'P2';

/*  Resultado: 1 fila actualizadas. */

/* Ejercicio 40: Doblar la categoría de todos los suministradores de Madrid */

UPDATE suministrador SET categoria = categoria * 2 WHERE ciudad = 'Madrid';

/*  Resultado: 4 filas actualizadas. */

/* Ejercicio 41: Poner la cantidad vendida a cero para todos los suministradores de Londres */

UPDATE suministro_piezas SET cantidad = 0 WHERE suministro_piezas.num_sum IN (SELECT num_sum FROM suministrador WHERE ciudad = 'Londres');

/*  Resultado: 0 filas actualizadas. */