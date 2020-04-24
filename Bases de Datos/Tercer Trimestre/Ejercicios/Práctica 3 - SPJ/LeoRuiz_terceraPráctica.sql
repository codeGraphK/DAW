/*  
    Práctica SPJ de SQL
    Dadas las tablas mostradas a continuación escribir las proposiciones 
    CREATE TABLE para dichas tablas. A continuación insertar las filas 
    en cada una de ellas 
*/

CREATE TABLE S (
    CPROV VARCHAR2(3) NOT NULL PRIMARY KEY CHECK(CPROV LIKE 'S%'),
    NOM VARCHAR2(11) NOT NULL,
    SITUAC NUMBER(3) DEFAULT 0,
    CIUD VARCHAR(11) NOT NULL
);

/* Resultado: Table S creado. */

INSERT ALL
    INTO S (cprov, nom, situac, ciud) VALUES ('S1', 'María', 20, 'Londres')
    INTO S (cprov, nom, situac, ciud) VALUES ('S2', 'Juan', 10, 'París')
    INTO S (cprov, nom, situac, ciud) VALUES ('S3', 'Carlos', 30, 'París')
    INTO S (cprov, nom, situac, ciud) VALUES ('S4', 'Pedro', 20, 'Londres')
    INTO S (cprov, nom, situac, ciud) VALUES ('S5', 'Jesus', 30, 'Atenas')
SELECT * FROM dual;

/* Resultado: 5 filas insertadas. */

CREATE TABLE P (
    CPZA VARCHAR2(3) NOT NULL PRIMARY KEY CHECK(CPZA LIKE 'P%'),
    NOMBRE VARCHAR(11) NOT NULL,
    COLOR VARCHAR(6) NOT NULL,
    PESO NUMBER(4) NOT NULL,
    CIUD VARCHAR(11) NOT NULL
);

/* Resultado: Table P creado. */

INSERT ALL
    INTO P (cpza, nombre, color, peso, ciud) VALUES('P1', 'Tuerca', 'Rojo', 12, 'Londres')
    INTO P (cpza, nombre, color, peso, ciud) VALUES('P2', 'Tornillo', 'Verde', 17, 'París')
    INTO P (cpza, nombre, color, peso, ciud) VALUES('P3', 'Arandela', 'Azul', 17, 'Roma')
    INTO P (cpza, nombre, color, peso, ciud) VALUES('P4', 'Arandela', 'Rojo', 14, 'Londres')
    INTO P (cpza, nombre, color, peso, ciud) VALUES('P5', 'Cinta', 'Azul', 12, 'París')
    INTO P (cpza, nombre, color, peso, ciud) VALUES('P6', 'Abrazadera', 'Rojo', 19, 'Londres')
SELECT * FROM dual;

/* Resultado: 6 filas insertadas. */

CREATE TABLE J (
    CPROY VARCHAR2(3) NOT NULL PRIMARY KEY CHECK(CPROY LIKE 'J%'),
    NOMBRE VARCHAR2(11) NOT NULL,
    CIUDAD VARCHAR2(11) NOT NULL
);

/* Resultado: Table J creado. */

INSERT ALL
    INTO J (cproy, nombre, ciudad) VALUES ('J1', 'Impresora', 'París')
    INTO J (cproy, nombre, ciudad) VALUES ('J2', 'CD', 'Roma')
    INTO J (cproy, nombre, ciudad) VALUES ('J3', 'DVD', 'Atenas')
    INTO J (cproy, nombre, ciudad) VALUES ('J4', 'Terminal', 'Atenas')
    INTO J (cproy, nombre, ciudad) VALUES ('J5', 'Teclado', 'Londres')
    INTO J (cproy, nombre, ciudad) VALUES ('J6', 'Módem', 'Oslo')
    INTO J (cproy, nombre, ciudad) VALUES ('J7', 'Ratón', 'Londres')
SELECT * FROM dual;

/* Resultado: 7 filas insertadas. */

CREATE TABLE SPJ (
    CPROV VARCHAR2(3) NOT NULL CHECK(CPROV LIKE 'S%'),
    CPIEZA VARCHAR2(3) NOT NULL CHECK(CPIEZA LIKE 'P%'),
    CPROY VARCHAR(3) NOT NULL CHECK(CPROY LIKE 'J%'),
    CANT NUMBER(5) NOT NULL,
    PRIMARY KEY(CPROV, CPIEZA, CPROY, CANT),
    FOREIGN KEY(CPROV) REFERENCES S ON DELETE CASCADE,
    FOREIGN KEY(CPIEZA) REFERENCES P ON DELETE CASCADE,
    FOREIGN KEY(CPROY) REFERENCES J ON DELETE CASCADE
);

/* Resultado: Table SPJ creado. */

INSERT ALL
    INTO SPJ (cprov, cpieza, cproy, cant) VALUES ('S1', 'P1', 'J1', 200)
    INTO SPJ (cprov, cpieza, cproy, cant) VALUES ('S1', 'P1', 'J2', 700)
    INTO SPJ (cprov, cpieza, cproy, cant) VALUES ('S2', 'P3', 'J3', 400)
    INTO SPJ (cprov, cpieza, cproy, cant) VALUES ('S2', 'P3', 'J3', 100)
    INTO SPJ (cprov, cpieza, cproy, cant) VALUES ('S2', 'P3', 'J3', 200)
    INTO SPJ (cprov, cpieza, cproy, cant) VALUES ('S2', 'P3', 'J3', 500)
    INTO SPJ (cprov, cpieza, cproy, cant) VALUES ('S2', 'P3', 'J3', 600)
    INTO SPJ (cprov, cpieza, cproy, cant) VALUES ('S2', 'P3', 'J3', 900)
    INTO SPJ (cprov, cpieza, cproy, cant) VALUES ('S2', 'P3', 'J3', 800)
    INTO SPJ (cprov, cpieza, cproy, cant) VALUES ('S2', 'P5', 'J3', 100)
    INTO SPJ (cprov, cpieza, cproy, cant) VALUES ('S3', 'P3', 'J3', 200)
    INTO SPJ (cprov, cpieza, cproy, cant) VALUES ('S3', 'P4', 'J4', 500)
    INTO SPJ (cprov, cpieza, cproy, cant) VALUES ('S4', 'P6', 'J5', 300)
    INTO SPJ (cprov, cpieza, cproy, cant) VALUES ('S4', 'P6', 'J6', 300)
    INTO SPJ (cprov, cpieza, cproy, cant) VALUES ('S5', 'P2', 'J7', 200)
    INTO SPJ (cprov, cpieza, cproy, cant) VALUES ('S5', 'P2', 'J3', 100)
    INTO SPJ (cprov, cpieza, cproy, cant) VALUES ('S5', 'P5', 'J3', 500)
    INTO SPJ (cprov, cpieza, cproy, cant) VALUES ('S5', 'P5', 'J3', 100)
    INTO SPJ (cprov, cpieza, cproy, cant) VALUES ('S5', 'P5', 'J3', 200)
    INTO SPJ (cprov, cpieza, cproy, cant) VALUES ('S5', 'P1', 'J3', 100)
    INTO SPJ (cprov, cpieza, cproy, cant) VALUES ('S5', 'P3', 'J3', 200)
    INTO SPJ (cprov, cpieza, cproy, cant) VALUES ('S5', 'P4', 'J3', 800)
    INTO SPJ (cprov, cpieza, cproy, cant) VALUES ('S5', 'P5', 'J3', 400)
    INTO SPJ (cprov, cpieza, cproy, cant) VALUES ('S5', 'P6', 'J3', 500)
SELECT * FROM dual;

/* Resultado: 24 filas insertadas. */

/*  Ejercicio 1: Obtener los códigos de proveedores que suministran 
    piezas al proyecto J1, ordenados por código de proveedor */

SELECT DISTINCT CPROV FROM SPJ WHERE CPROY = 'J1' ORDER BY CPROV;

/*  Resultado:

    CPROV
    S1
 */

/*  Ejercicio 2: Obtener una lista de todas las combinaciones posibles
    de color-ciudad de la tabla pieza eliminando todas las parejas
    color-ciudad repetidas. */

SELECT COP.color, CIP.ciud
FROM
    (SELECT DISTINCT color FROM P) COP,
    (SELECT DISTINCT ciud FROM P) CIP;

/*  Resultado:

    COLOR	CIUD
    Rojo	París
    Azul	París
    Verde	París
    Rojo	Londres
    Azul	Londres
    Verde	Londres
    Rojo	Roma
    Azul	Roma
    Verde	Roma
 */

/*  Ejercicio 3: Obtener todas las tripletas código de proveedor/código
    de pieza/código de proyecto de la tabla SPJ, tales que el proveedor,
    la pieza y el proyecto estén todos en la misma ciudad. */

SELECT CPROV, CPIEZA, CPROY
FROM SPJ
WHERE 
    (SELECT ciud FROM S WHERE S.cprov = SPJ.cprov) = (SELECT ciud FROM P WHERE P.cpza = SPJ.cpieza) AND 
    (SELECT ciudad FROM J WHERE J.cproy = SPJ.cproy) = (SELECT ciud FROM P WHERE P.cpza = SPJ.cpieza);

/*  Resultado:

    CPROV	CPIEZA	CPROY
    S4	P6	J5
 */

/*  Ejercicio 4: Obtener los códigos de las piezas suministradas a 
    un proyecto por un proveedor situado en la misma ciudad que 
    el proyecto */

SELECT DISTINCT CPIEZA
FROM SPJ
WHERE 
    (SELECT ciud FROM S WHERE S.cprov = SPJ.cprov) = (SELECT ciudad FROM J WHERE J.cproy = SPJ.cproy);

/*  Resultado:
    
    CPIEZA
    P6
    P1
    P2
    P5
    P3
    P4
 */

/*  Ejercicio 5: Obtener los códigos de proyecto y ciudades en los
    cuales la segunda letra del nombre de la ciudad sea uno "o" */

SELECT CPROY, CIUDAD
FROM J
WHERE CIUDAD LIKE '_o%';

/*  Resultado:

    CPROY	CIUDAD
    J2	Roma
    J5	Londres
    J7	Londres
 */

/*  Ejercicio 6: Obtener los códigos de las piezas suministradas
    a cualquier proyecto de Londres */

SELECT CPIEZA
FROM SPJ, (SELECT CPROY FROM J WHERE ciudad = 'Londres') JLON
WHERE JLON.cproy = SPJ.cproy;

/*  Resultado:

    CPIEZA
    P6
    P2
 */

/*  Ejercicio 7: Obtener el número total de proyectos a los cuales
    suministra piezas el proveedor S1 */

SELECT COUNT(CPROY) countS1 FROM SPJ WHERE CPROV = 'S1';

/*  Resultado:

    COUNTS1
    2
 */

/*  Ejercicio 8: Obtener la cantidad total de la pieza P1
    suministrada por el proveedor S1. */

SELECT SUM(CANT) cantP1S1 FROM SPJ WHERE CPIEZA = 'P1' AND CPROV = 'S1';

/*  Resultado:

    CANTP1S1
    900
 */

/*  Ejercicio 9: Para cada pieza suministrada a un proyecto,
    obtener el código de pieza, el código del proyecto y la 
    cantidad total correspondiente */

SELECT CPIEZA, CPROY, SUM(CANT) FROM SPJ GROUP BY CPIEZA, CPROY;

/*  Resultado:

    CPIEZA	CPROY	SUM(CANT)
    P4	J3	800
    P1	J3	100
    P2	J7	200
    P6	J5	300
    P1	J1	200
    P4	J4	500
    P2	J3	100
    P5	J3	1300
    P1	J2	700
    P3	J3	3900
    P6	J6	300
    P6	J3	500
 */

/*  Ejercicio 10: Obtener los códigos de las piezas suministradas
    a algún proyecto tales que la cantidad promedio suministrada
    sea mayor que 320. */

SELECT CPIEZA 
FROM (SELECT CPIEZA, AVG(CANT) avgCant FROM SPJ GROUP BY CPIEZA) 
WHERE avgCant > 320;

/*  Resultado:

    CPIEZA
    P6
    P1
    P3
    P4
 */

/*  Ejercicio 11: Obtener los códigos de los proyectos cuya ciudad
    sea la primera en la lista alfabética de las ciudades donde
    hay proyectos */

SELECT CPROY FROM J
WHERE CIUDAD = (SELECT MIN(CIUDAD) FROM J);

/*  Resultado:

    CPROY
    J3
    J4
 */

/*  Ejercicio 12: Cambiar a gris el color de todas las piezas rojas */

UPDATE P SET color = 'Gris' WHERE color = 'Rojo';

/*  Resultado: 3 filas actualizadas */

/*  Ejercicio 13: Poner a 0 la cantidad enviada por los proveedores
    de Londres */

UPDATE SPJ SET cant = 0 
WHERE cprov IN (SELECT CPROV FROM S WHERE ciud = 'Londres');

/*  Resultado: 4 filas actualizadas. */

/*  Ejercicio 14: Eliminar todos los proyectos de SPJ para los
    cuales no se sirven piezas, es decir, cantidad a 0. */

DELETE FROM SPJ 
WHERE CPROY IN (select cproy from spj group by cproy having sum(cant) = 0);

/*  Resultado: 4 filas eliminadas. */

/*  Ejercicio 15: Insertar un nuevo proveedor (S8) en la tabla
    S. El nombre y la ciudad son Pedro y Nueva York, respectivamente,
    la situación no se conoce todavía. */

INSERT INTO S (cprov, nom, ciud) VALUES ('S8', 'Pedro', 'Nueva York');

/*  Resultado: 1 fila insertada. */

/*  Ejercicio 16: Construir una tabla con los códigos de las piezas
    suministradas ya sea por un proveedor de Londres o a un
    proyecto de Londres. */

    /* Solución 1: */

    CREATE TABLE PIELONDRES (CPIEZA)
    AS (
        SELECT CPIEZA 
        FROM SPJ
        WHERE CPROV IN (SELECT CPROV FROM S WHERE ciud = 'Londres')
        OR CPROY IN (SELECT CPROY FROM J WHERE ciudad = 'Londres')
    );

    /* Solución 2: Arrastra más datos al hacer |x| con las tres tablas */

    CREATE TABLE pielondres (cpieza)
    AS (
        SELECT DISTINCT CPIEZA
        FROM spj,
        (SELECT CPROV cLon FROM S WHERE ciud = 'Londres') cpLon,
        (SELECT CPROY yLon FROM J WHERE ciudad = 'Londres') cyLon
        WHERE CPROV = cLon OR CPROY = yLon
    );

/*  Resultado: Table PIELONDRES creado. (P2) */

/*  Ejercicio 17: Construir una tabla con los códigos de los
    proyectos situados en Londres o a los cuales suministre
    piezas algún proveedor de Londres. */

CREATE TABLE PRYLONDRES (CPROYECTO)
AS (
    SELECT CPROY 
    FROM SPJ
    WHERE CPROY IN (SELECT CPROY FROM J WHERE ciudad = 'Londres')
    OR CPROV IN (SELECT CPROV FROM S WHERE ciud = 'Londres')
);

/*  Resultado: Table PRYLONDRES creado (J7) */