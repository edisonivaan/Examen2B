

DROP TABLE IF EXISTS COORDENADAS;

    CREATE TABLE IF NOT EXISTS COORDENADAS
    (
    
    EJ_CAPACIDAD       INTEGER NUll,
    EJ_GEOLOCA             VARCHAR(20) NOT NULL,
    EJ_ARSENAL         VARCHAR(20) NOT NULL,
    EJ_FECHA_INGRESO      VARCHAR(20) DEFAULT(datetime('now'))
    );

    INSERT INTO COORDENADAS (EJ_CAPACIDAD, EJ_GEOLOCA, EJ_ARSENAL)
                    VALUES  (7, 'GPS7', 'aaabbct');

    INSERT INTO COORDENADAS (EJ_CAPACIDAD, EJ_GEOLOCA, EJ_ARSENAL)
                    VALUES  (0, 'GPS0', 'ab');

    INSERT INTO COORDENADAS (EJ_CAPACIDAD, EJ_GEOLOCA, EJ_ARSENAL)
                    VALUES  (4, 'GPS4', 'acd');

    INSERT INTO COORDENADAS (EJ_CAPACIDAD, EJ_GEOLOCA, EJ_ARSENAL)
                    VALUES  (1, 'GPS1', 'bc');

    INSERT INTO COORDENADAS (EJ_CAPACIDAD, EJ_GEOLOCA, EJ_ARSENAL)
                    VALUES  (2, 'GPS2', 'ac');

    INSERT INTO COORDENADAS (EJ_CAPACIDAD, EJ_GEOLOCA, EJ_ARSENAL)
                    VALUES  (1, 'GPS1', 'bc');

    INSERT INTO COORDENADAS (EJ_CAPACIDAD, EJ_GEOLOCA, EJ_ARSENAL)
                    VALUES  (0, 'GPS0', 'ab');

    INSERT INTO COORDENADAS (EJ_CAPACIDAD, EJ_GEOLOCA, EJ_ARSENAL)
                    VALUES  (5, 'GPS5', 'bct');
    
    INSERT INTO COORDENADAS (EJ_CAPACIDAD, EJ_GEOLOCA, EJ_ARSENAL)
                    VALUES  (2, 'GPS2', 'ac');

    INSERT INTO COORDENADAS (EJ_CAPACIDAD, EJ_GEOLOCA, EJ_ARSENAL)
                    VALUES  (0, 'GPS0', 'ab');

SELECT * FROM COORDENADAS;


 DROP TABLE IF EXISTS USUARIOS;

    CREATE TABLE IF NOT EXISTS USUARIOS
    (
     EJ_ID_USUARIOS                 INTEGER NULL
    ,EJ_USUARIOS                    VARCHAR(20) NOT NULL
    ,EJ_CONTRASENA_ENCRIPTADA       VARCHAR(20) NOT NULL
    );
-----------------------------------------------------------------------------------------
    INSERT INTO USUARIOS    (EJ_ID_USUARIOS, EJ_USUARIOS, EJ_CONTRASENA_ENCRIPTADA)
                    VALUES  (1,'profe', '81dc9bdb52d04dc20036dbd8313ed055');
    INSERT INTO USUARIOS    (EJ_ID_USUARIOS, EJ_USUARIOS, EJ_CONTRASENA_ENCRIPTADA)
                    VALUES  (1,'edison.jimenez03@epn.edu.ec', '5283c0b3551ba795564c7bce39b5e221');
    INSERT INTO USUARIOS    (EJ_ID_USUARIOS, EJ_USUARIOS, EJ_CONTRASENA_ENCRIPTADA)
                    VALUES  (1,'usuario.random@gmail.com', 'dafc0567e2fe31cbdb56e47472030db3');
    
-----------------------------------------------------------------------------------------
SELECT * FROM USUARIOS;