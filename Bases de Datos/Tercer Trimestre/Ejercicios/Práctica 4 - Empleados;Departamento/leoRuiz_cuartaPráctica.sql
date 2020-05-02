/* Práctica 4: Emple_Depart de SQL */

/* Ejercicio posibles de cambio: 8, 10, 11, 14 */

/* Tabla DEPART */

CREATE TABLE DEPART (
    DEPT_NO VARCHAR2(3) NOT NULL PRIMARY KEY CHECK(DEPT_NO > 0),
    DNOMBRE VARCHAR2(14) NOT NULL,
    LOC VARCHAR2(10) NOT NULL
);

/*  Salida: Table DEPART creado. */

INSERT ALL
    INTO DEPART (dept_no, dnombre, loc) VALUES ('10', 'CONTABILIDAD', 'SEVILLA')
    INTO DEPART (dept_no, dnombre, loc) VALUES ('20', 'INVESTIGACION', 'MADRID')
    INTO DEPART (dept_no, dnombre, loc) VALUES ('30', 'VENTAS', 'BARCELONA')
    INTO DEPART (dept_no, dnombre, loc) VALUES ('40', 'PRODUCCION', 'BILBAO')
SELECT * FROM dual;

/*  Salida: 4 filas insertadas. */

/* Tabla EMPLE */

CREATE TABLE EMPLE (
    EMP_NO VARCHAR2(5) NOT NULL PRIMARY KEY CHECK(EMP_NO > 0),
    APELLIDO VARCHAR2(10) NOT NULL,
    OFICIO VARCHAR2(11) NOT NULL,
    DIR VARCHAR2(5),
    FECHA_AL DATE NOT NULL,
    SALARIO NUMBER(7) NOT NULL,
    COMISION NUMBER(7),
    DEPT_NO VARCHAR(3) NOT NULL,
    FOREIGN KEY(DIR) REFERENCES EMPLE ON DELETE SET NULL,
    FOREIGN KEY(DEPT_NO) REFERENCES DEPART ON DELETE SET NULL,
    UNIQUE (APELLIDO)
);

/*  Salida: Table EMPLE creado. */

ALTER SESSION SET nls_date_format = 'dd/mm/yy';

/*  Salida: Session alterado. */

INSERT ALL
    INTO EMPLE(emp_no, apellido, oficio, fecha_al, salario, dept_no) 
    VALUES ('7839', 'REY', 'PRESIDENTE', TO_DATE('17/11/81'), 650000, '10')
    INTO EMPLE(emp_no, apellido, oficio, dir, fecha_al, salario, dept_no) 
    VALUES ('7566', 'JIMENEZ', 'DIRECTOR', '7839', TO_DATE('02/04/81'), 386750, '20')
    INTO EMPLE(emp_no, apellido, oficio, dir, fecha_al, salario, dept_no) 
    VALUES ('7698', 'NEGRO', 'DIRECTOR', '7839', TO_DATE('01/05/81'), 370500, '30')
    INTO EMPLE(emp_no, apellido, oficio, dir, fecha_al, salario, dept_no) 
    VALUES ('7782', 'CEREZO', 'DIRECTOR', '7839', TO_DATE('09/06/81'), 318500, '10')
    INTO EMPLE(emp_no, apellido, oficio, dir, fecha_al, salario, dept_no) 
    VALUES ('7788', 'GIL', 'ANALISTA', '7566', TO_DATE('09/11/81'), 390000, '20')
    INTO EMPLE(emp_no, apellido, oficio, dir, fecha_al, salario, dept_no) 
    VALUES ('7902', 'FERNANDEZ', 'ANALISTA', '7566', TO_DATE('03/12/81'), 390000, '20')
    INTO EMPLE(emp_no, apellido, oficio, dir, fecha_al, salario, comision, dept_no) 
    VALUES ('7499', 'ARROYO', 'VENDEDOR', '7698', TO_DATE('20/02/80'), 208000, 39000, '30')
    INTO EMPLE(emp_no, apellido, oficio, dir, fecha_al, salario, comision, dept_no) 
    VALUES ('7521', 'SALA', 'VENDEDOR', '7698', TO_DATE('22/02/81'), 162500, 65000, '30')
    INTO EMPLE(emp_no, apellido, oficio, dir, fecha_al, salario, comision, dept_no) 
    VALUES ('7654', 'MARTIN', 'VENDEDOR', '7698', TO_DATE('29/09/81'), 162500, 182000, '30')
    INTO EMPLE(emp_no, apellido, oficio, dir, fecha_al, salario, comision, dept_no) 
    VALUES ('7844', 'TOVAR', 'VENDEDOR', '7698', TO_DATE('08/09/81'), 195000, 0, '30')
    INTO EMPLE(emp_no, apellido, oficio, dir, fecha_al, salario, dept_no) 
    VALUES ('7900', 'JIMENO', 'EMPLEADO', '7698', TO_DATE('03/12/81'), 123500, '30')
    INTO EMPLE(emp_no, apellido, oficio, dir, fecha_al, salario, dept_no) 
    VALUES ('7934', 'MUÑOZ', 'EMPLEADO', '7782', TO_DATE('23/01/82'), 169000, '10')
    INTO EMPLE(emp_no, apellido, oficio, dir, fecha_al, salario, dept_no) 
    VALUES ('7369', 'SANCHEZ', 'EMPLEADO', '7902', TO_DATE('17/12/80'), 104000, '20')
    INTO EMPLE(emp_no, apellido, oficio, dir, fecha_al, salario, dept_no) 
    VALUES ('7876', 'ALONSO', 'EMPLEADO', '7788', TO_DATE('23/09/81'), 143000, '20')
SELECT * FROM dual;

/*  Salida: 14 filas insertadas. */

/*  Ejercicio 1: Seleccionar de la tabla EMPLE a todos los empleados del 
    departamento 20. */
    
    SELECT * FROM EMPLE WHERE dept_no = '20';

    /*  Salida: 
        
        EMP_NO	APELLIDO	OFICIO	DIR	FECHA_AL	SALARIO	COMISION	DEPT_NO
        7566	JIMENEZ	DIRECTOR	7839	02/04/81	386750	 - 	20
        7788	GIL	ANALISTA	7566	09/11/81	390000	 - 	20
        7902	FERNANDEZ	ANALISTA	7566	03/12/81	390000	 - 	20
        7369	SANCHEZ	EMPLEADO	7902	17/12/80	104000	 - 	20
        7876	ALONSO	EMPLEADO	7788	23/09/81	143000	 - 	20
    */

/*  Ejercicio 2: Seleccionar de la tabla EMPLE  aquellas filas del departamento 
    10, cuyo oficio sea 'ANALISTA'. La consulta se ha de ordenar de modo 
    descendente por apellido y también de manera descendente por nª de 
    empleado. */

    SELECT * 
    FROM EMPLE 
    WHERE dept_no = '10' AND oficio = 'ANALISTA'
    ORDER BY apellido DESC, emp_no DESC;

    /*  Salida: no data found */

/*  Ejercicio 3: Obtenener aquellos apellidos de la tabla EMPLE que empiecen por
    'A' y tengan una 'O' en su interior. */

    SELECT * FROM EMPLE WHERE apellido LIKE 'A%O%';

    /*  Salida: 
        
        EMP_NO	APELLIDO	OFICIO	DIR	FECHA_AL	SALARIO	COMISION	DEPT_NO
        7499	ARROYO	VENDEDOR	7698	20/02/80	208000	39000	30
        7876	ALONSO	EMPLEADO	7788	23/09/81	143000	 - 	20
    */

/*  Ejercicio 4: Seleccionar de la tabla EMPLE aquellas filas cuyo apellido 
    empiece por 'A' y el oficio tenga una 'E' en cualquier posición. */

    SELECT * FROM EMPLE WHERE apellido LIKE 'A%' AND oficio LIKE '%E%';

    /*  Salida: 
    
        EMP_NO	APELLIDO	OFICIO	DIR	FECHA_AL	SALARIO	COMISION	DEPT_NO
        7499	ARROYO	VENDEDOR	7698	20/02/80	208000	39000	30
        7876	ALONSO	EMPLEADO	7788	23/09/81	143000	 - 	20
    */

/*  Ejercicio 5: Consultar aquellos apellidos de la tabla EMPLE cuyo nª de 
    departamento no sea ni 10 ni 30. */
    
    SELECT apellido FROM EMPLE WHERE dept_no <> '10' AND dept_no <> '30'

    /*  Salida: 
    
        APELLIDO
        JIMENEZ
        GIL
        FERNANDEZ
        SANCHEZ
        ALONSO
    */

/*  Ejercicio 6: Consultar aquellos apellidos de la tabla EMPLE cuyo oficio sea 
    'VENDEDOR', 'ANALISTA' o 'EMPLEADO'. */
    
    SELECT apellido 
    FROM EMPLE 
    WHERE oficio = 'VENDEDOR' 
        OR oficio = 'ANALISTA' 
        OR oficio = 'EMPLEADO';

    /*  Salida: 
    
        APELLIDO
        GIL
        FERNANDEZ
        ARROYO
        SALA
        MARTIN
        TOVAR
        JIMENO
        MUÑOZ
        SANCHEZ
        ALONSO
    */

/*  Ejercicio 7: Seleccionar el apellido, el oficio y la localidad de los 
    departamentos donde trabajan los 'ANALISTAS'. */
    
    SELECT apellido, oficio, loc 
    FROM EMPLE JOIN DEPART 
        ON EMPLE.dept_no = DEPART.dept_no 
        AND oficio = 'ANALISTA';

    /*  Salida: 
    
        APELLIDO	OFICIO	LOC
        GIL	ANALISTA	MADRID
        FERNANDEZ	ANALISTA	MADRID
    */

/*  Ejercicio 8: Mostrar los empleados (nombre, oficio, salario y fecha de alta) 
    que desempeñen el mismo oficio que 'JIMÉNEZ' o que tengan un salario mayor o 
    igual que 'FERNÁNDEZ' */
    
    SELECT apellido, oficio, salario, fecha_al
    FROM EMPLE
    WHERE oficio = (SELECT oficio FROM EMPLE WHERE apellido = 'JIMENEZ')
        OR salario >= (SELECT salario FROM EMPLE WHERE apellido = 'FERNANDEZ');

    /*  Salida: 
    
        APELLIDO	OFICIO	SALARIO	FECHA_AL
        REY	PRESIDENTE	650000	17/11/81
        JIMENEZ	DIRECTOR	386750	02/04/81
        NEGRO	DIRECTOR	370500	01/05/81
        CEREZO	DIRECTOR	318500	09/06/81
        GIL	ANALISTA	390000	09/11/81
        FERNANDEZ	ANALISTA	390000	03/12/81
    */

/*  Ejercicio 9: Obtener el apellido, salario y nª de departamento de los 
    empleados cuyo salario sea mayor de 1200 en los departamentos 10 o 20. */
    
    SELECT apellido, salario, dept_no
    FROM EMPLE
    WHERE salario > 1200 AND (dept_no = 10 OR dept_no = 20)

    /*  Salida: 
        
        APELLIDO	SALARIO	DEPT_NO
        REY	650000	10
        JIMENEZ	386750	20
        CEREZO	318500	10
        GIL	390000	20
        FERNANDEZ	390000	20
        MUÑOZ	169000	10
        SANCHEZ	104000	20
        ALONSO	143000	20
    */

/*  Ejercicio 10: Mostrar en pantalla el nombre, oficio y salario de los 
    empleados del departamento de 'FERNÁNDEZ' que tengan su mismo salario */
    
    SELECT apellido, oficio, EMPLE.salario
    FROM EMPLE, (
        SELECT dept_no, salario 
        FROM EMPLE 
        WHERE apellido = 'FERNANDEZ') ferEmp
    WHERE EMPLE.dept_no = ferEmp.dept_no 
        AND EMPLE.salario = ferEmp.salario;

    /*  Salida: 
    
        APELLIDO	OFICIO	SALARIO
        GIL	ANALISTA	390000
        FERNANDEZ	ANALISTA	390000
    */

/*  Ejercicio 11: Presentar los nombres y oficios de los empleados que tienen 
    el mismo trabajo que 'JIMÉNEZ'. */
    
    SELECT apellido, oficio
    FROM EMPLE 
    WHERE oficio = (SELECT oficio FROM EMPLE WHERE apellido = 'JIMENEZ');
    /*  Salida: 
        
        APELLIDO	OFICIO
        JIMENEZ	DIRECTOR
        NEGRO	DIRECTOR
        CEREZO	DIRECTOR
    */

/*  Ejercicio 12: Consultar los datos de los empleados que trabajen en 'MADRID' 
    o 'BARCELONA' */
    
    SELECT *
    FROM EMPLE
    WHERE dept_no IN (
        SELECT dept_no 
        FROM DEPART 
        WHERE loc = 'MADRID' OR loc = 'BARCELONA');

    /*  Salida: 
        EMP_NO	APELLIDO	OFICIO	DIR	FECHA_AL	SALARIO	COMISION	DEPT_NO
        7566	JIMENEZ	DIRECTOR	7839	02/04/81	386750	 - 	20
        7698	NEGRO	DIRECTOR	7839	01/05/81	370500	 - 	30
        7788	GIL	ANALISTA	7566	09/11/81	390000	 - 	20
        7902	FERNANDEZ	ANALISTA	7566	03/12/81	390000	 - 	20
        7499	ARROYO	VENDEDOR	7698	20/02/80	208000	39000	30
        7521	SALA	VENDEDOR	7698	22/02/81	162500	65000	30
        7654	MARTIN	VENDEDOR	7698	29/09/81	162500	182000	30
        7844	TOVAR	VENDEDOR	7698	08/09/81	195000	0	30
        7900	JIMENO	EMPLEADO	7698	03/12/81	123500	 - 	30
        7369	SANCHEZ	EMPLEADO	7902	17/12/80	104000	 - 	20
        7876	ALONSO	EMPLEADO	7788	23/09/81	143000	 - 	20
    */

/*  Ejercicio 13: Consultar los apellidos y oficios de todos los empleados del 
    departamento 20 cuyo trabajo sea idéntico al de cualquiera de los empleados 
    del departamento 'VENTAS'. */
    
    SELECT apellido, oficio
    FROM EMPLE
    WHERE dept_no = 20 
        AND oficio IN (
            SELECT DISTINCT oficio 
            FROM EMPLE 
            WHERE dept_no = (
                SELECT dept_no 
                FROM DEPART 
                WHERE dnombre = 'VENTAS'
            )
        );

    /*  Salida: 
        
        APELLIDO	OFICIO
        JIMENEZ	DIRECTOR
        SANCHEZ	EMPLEADO
        ALONSO	EMPLEADO
    */

/*  Ejercicio 14: Obtener el apellido de los empleados con el mismo oficio y 
    salario que GIL */
    
    SELECT apellido
    FROM EMPLE, (
        SELECT oficio, salario 
        FROM EMPLE 
        WHERE apellido = 'GIL') gilEmp
    WHERE EMPLE.oficio = gilEmp.oficio 
        AND EMPLE.salario = gilEmp.salario;
    /*  Salida: 
        
        APELLIDO
        GIL
        FERNANDEZ
    */

/*  Ejercicio 15: Calcular el nª de oficios diferentes que hay en total en los 
    departamento 10 y 20. */
    
    SELECT COUNT(DISTINCT oficio) oficiosDist
    FROM EMPLE
    WHERE dept_no = '10' OR dept_no = '20'

    /*  Salida: 
    
        OFICIOSDIST
        4
    */

/*  Ejercicio 16: Calcular el nª de filas de la tabla EMPLE donde la comisión 
    no es nula */

    SELECT COUNT(comision) notNullComisions
    FROM EMPLE;

    /*  Salida: 
    
        NOTNULLCOMISIONS
        4
    */

/*  Ejercicio 17: Obtener el salario y el apellido del empleado con apellido 
    máximo de la tabla EMPLE. */

    SELECT salario, apellido
    FROM EMPLE
    WHERE apellido = (SELECT MAX(apellido) FROM EMPLE);

    /*  Salida: 
        
        SALARIO	APELLIDO
        195000	TOVAR
    */

/*  Ejercicio 18: Visualizar cuántos apellidos de los empleados empiezan por 'A' */

    SELECT COUNT(apellido) A_APELLIDOS
    FROM EMPLE
    WHERE apellido LIKE 'A%'

    /*  Salida: 
        
        A_APELLIDOS
        2
    */

/*  Ejercicio 19: Dada la tabla EMPLE, obtener el sueldo medio, el nª de 
    comisiones no nulas, el máximo sueldo y el mínimo sueldo de los empleados 
    del departamento 30. */

    SELECT AVG(salario) avgSueldo, 
        COUNT(comision) notNullComi,
        MAX(salario) maxSueldo, 
        MIN(salario) minSueldo
    FROM EMPLE
    WHERE dept_no = 30;

    /*  Salida: 

    AVGSUELDO	NOTNULLCOMI	MAXSUELDO	MINSUELDO
    203666.6...	4	370500	123500
    */

/*  Ejercicio 20: Visualizar el nombre y nª de empleados, de todos los 
    departamentos que tengan más de 4 empleados */
    
    SELECT dnombre, contDept4.countEmp
    FROM DEPART JOIN (
        SELECT dept_no, count(emp_no) countEmp 
        FROM EMPLE 
        GROUP BY dept_no 
        HAVING COUNT(emp_no) > 4) contDept4
    ON DEPART.dept_no = contDept4.dept_no;

    /*  Salida: 
    
        DNOMBRE	COUNTEMP
        INVESTIGACION	5
        VENTAS	6
    */

/*  Ejercicio 21: Visuaulizar el nombre del departamento con la mayor media de 
    salarios. */

    SELECT dnombre
    FROM DEPART JOIN (
        SELECT dept_no, avg(salario) avgOne 
        FROM EMPLE 
        GROUP BY dept_no) DepAvgS
    ON DepAvgs.dept_no = DEPART.dept_no 
        AND avgOne = (
            SELECT MAX(AVG(salario)) 
            FROM EMPLE 
            GROUP BY dept_no);    

    /*  Salida: 
        
        DNOMBRE
        CONTABILIDAD
    */

/*  Ejercicio 22: Obtener de cada departamento el apellido y sueldo del empleado 
    que más gane. */
    
    SELECT apellido, salario
    FROM EMPLE JOIN (
        SELECT max(salario) cantMax
        FROM EMPLE
        GROUP BY dept_no)
    ON salario = cantMax;

    /*  Salida: 
        
        APELLIDO	SALARIO
        GIL	390000
        FERNANDEZ	390000
        NEGRO	370500
        REY	650000
    */

/*  Ejercicio 23: Obtener la suma de salarios, el salario máximo y el salario 
    mínimo por cada departamento. */
    
    SELECT SUM(salario) sumSueldo,
        MAX(salario) maxSueldo,
        MIN(salario) minSueldo
    FROM EMPLE
    GROUP BY dept_no;

    /*  Salida: 
        
        SUMSUELDO	MAXSUELDO	MINSUELDO
        1413750	390000	104000
        1222000	370500	123500
        1137500	650000	169000
    */

/*  Ejercicio 24: Calcular el número de empleados que realizan cada oficio en 
    cada departamento. Los datos que se visualizan son: nª de departamento, 
    oficio y nª de empleados. */
    
    SELECT dept_no, oficio, COUNT(emp_no)
    FROM EMPLE
    GROUP BY oficio, dept_no:

    /*  Salida: 
        
        DEPT_NO	OFICIO	COUNT(EMP_NO)
        10	EMPLEADO	1
        20	EMPLEADO	2
        30	VENDEDOR	4
        20	DIRECTOR	1
        10	DIRECTOR	1
        30	EMPLEADO	1
        20	ANALISTA	2
        10	PRESIDENTE	1
        30	DIRECTOR	1
    */

/*  Ejercicio 25: Visualizar el número de departamento, el nombre de departamento 
    y el nª de empleados del departamento con más empleados. */

    SELECT DEPART.dept_no, dnombre, totEmp
    FROM DEPART JOIN (
        SELECT dept_no, count(emp_no) totEmp 
        FROM EMPLE 
        GROUP BY dept_no) empCont
    ON DEPART.dept_no = empCont.dept_no 
    AND totEmp = (
        SELECT max(count(emp_no)) 
        FROM EMPLE 
        GROUP BY dept_no);

    /*  Salida: 
        
        DEPT_NO	DNOMBRE	TOTEMP
        30	VENTAS	6
    */

/*  Ejercicio 26: Visualizar los departamentos en los que el salario medio es 
    mayor o igual que la media de todos los salarios. */

    SELECT dept_no
    FROM EMPLE
    GROUP BY dept_no
    HAVING AVG(salario) >= (SELECT AVG(salario) FROM EMPLE)

    /*  Salida: 
        
        DEPT_NO
        20
        10
    */

/*  Ejercicio 27: Partiendo de la tabla EMPLE, visualizar por cada oficio de los 
    empleados del departamento 'VENTAS' la suma de salarios. */

    SELECT oficio, sum(salario)
    FROM EMPLE JOIN (
        SELECT dept_no 
        FROM DEPART 
        WHERE dnombre = 'VENTAS') ventasNu
    ON EMPLE.dept_no = ventasNu.dept_no
    GROUP BY oficio

    /*  Salida: 
        
        OFICIO	SUM(SALARIO)
        DIRECTOR	370500
        EMPLEADO	123500
        VENDEDOR	728000
    */

/*  Ejercicio 28: Seleccionar aquellos apellidos de la tabla EMPLE cuyo salario 
    sea igual a la media de su salario en su departamento. */

    SELECT apellido
    FROM EMPLE JOIN (
        SELECT dept_no, avg(salario) avgSueldo 
        FROM EMPLE 
        GROUP BY dept_no) mediasDpto
    ON EMPLE.dept_no = mediasDpto.dept_no 
        AND EMPLE.salario = avgSueldo;

    /*  Salida: no data found. */

/*  Ejercicio 29: A partir de la tabla EMPLE, visualizar el nª de empleados de 
    cada departamento cuyo oficio sea 'EMPLEADO'. */
    
    SELECT dept_no, count(emp_no)
    FROM EMPLE
    GROUP BY oficio, dept_no
    HAVING oficio = 'EMPLEADO'

    /*  Salida: 
    
        DEPT_NO	COUNT(EMP_NO)
        10	1
        20	2
        30	1
    */

/*  Ejercicio 30: Visualizar el nª de departamento y el nombre de departamento 
    que tenga más empleados cuyo oficio sea 'EMPLEADO'. */

    SELECT DEPART.dept_no, dnombre
    FROM DEPART JOIN (
        SELECT dept_no, count(emp_no) totEmp
        FROM EMPLE
        GROUP BY oficio, dept_no
        HAVING oficio = 'EMPLEADO') empEachDept
    ON empEachDept.dept_no = DEPART.dept_no 
    AND totEmp = (
        SELECT max(count(emp_no))
        FROM EMPLE
        GROUP BY oficio, dept_no
        HAVING oficio = 'EMPLEADO');

    /*  Salida: 
    
        DEPT_NO	DNOMBRE
        20	INVESTIGACION
    */

/*  Ejercicio 31: Buscar los departamentos que tienen más de dos personas 
    trabajando en la misma profesión. */

    SELECT DISTINCT dept_no
    FROM EMPLE
    GROUP BY oficio, dept_no
    HAVING count(oficio) > 1;

    /*  Salida: 
        DEPT_NO
        20
        30
    */