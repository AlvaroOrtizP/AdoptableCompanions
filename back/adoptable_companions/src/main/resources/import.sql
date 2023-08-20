-- Insertar datos en la tabla protectora
INSERT INTO protectora (name, logo) VALUES ('Protectora A', 'https://i.pinimg.com/originals/b0/43/ec/b043ecd6af989fac3a57fcd82e4e4f17.png');
INSERT INTO protectora (name, logo) VALUES ('Protectora B', 'https://www.huellascallejeras.com/wp-content/uploads/2020/06/logoHuellas3.png');


-- Insertar datos en la tabla personas
INSERT INTO PERSONAS (id, nombre, apellidos, direccion, dni, anio_nacimiento) VALUES (1, 'Juan', 'Perez', 'Calle 123, Ciudad X', '12345678A', 1985);
INSERT INTO PERSONAS (id, nombre, apellidos, direccion, dni, anio_nacimiento) VALUES (2, 'María', 'López', 'Avenida ABC, Ciudad Y', '98765432B', 1990);
INSERT INTO PERSONAS (id, nombre, apellidos, direccion, dni, anio_nacimiento) VALUES (3, 'Luis', 'González', 'Calle 456, Ciudad Z', '56789012C', 1992);
INSERT INTO PERSONAS (id, nombre, apellidos, direccion, dni, anio_nacimiento) VALUES (4, 'Ana', 'Martínez', 'Plaza 789, Ciudad W', '34567890D', 1988);
INSERT INTO PERSONAS (id, nombre, apellidos, direccion, dni, anio_nacimiento) VALUES (5, 'Carlos', 'Rodríguez', 'Calle 789, Ciudad Q', '45678901E', 1977);
INSERT INTO PERSONAS (id, nombre, apellidos, direccion, dni, anio_nacimiento) VALUES (6, 'Laura', 'García', 'Avenida XYZ, Ciudad R', '23456789F', 2001);
INSERT INTO PERSONAS (id, nombre, apellidos, direccion, dni, anio_nacimiento) VALUES (7, 'Miguel', 'Fernández', 'Plaza 101, Ciudad S', '56789012G', 1995);


-- Insertar datos en la tabla animales
INSERT INTO animales (nombre, chip, anio_nacimiento, tipo_animal, sexo, imagen_url, protectora_id) VALUES ('Milo', 'CHIP123', '2018-07-05', 'PERRO', 'MACHO', 'https://img.freepik.com/foto-gratis/aislado-feliz-sonriente-perro-fondo-blanco-retrato-4_1562-693.jpg?size=626&ext=jpg', 1);
INSERT INTO animales (nombre, chip, anio_nacimiento, tipo_animal, sexo, imagen_url, protectora_id) VALUES ('Kitty', 'CHIP456', '2017-02-05', 'GATO', 'HEMBRA', 'https://img.freepik.com/foto-gratis/primer-disparo-vertical-lindo-gato-europeo-pelo-corto_181624-34587.jpg?size=626&ext=jpg', 2);
INSERT INTO animales (nombre, chip, anio_nacimiento, tipo_animal, sexo, imagen_url, protectora_id) VALUES ('Lily', 'CHIP452', '2021-01-05', 'PERRO', 'HEMBRA', 'https://img.freepik.com/foto-gratis/adorable-perro-basenji-marron-blanco-sonriendo-dando-maximo-cinco-aislado-blanco_346278-1657.jpg?size=626&ext=jpg', 1);
INSERT INTO animales (nombre, chip, anio_nacimiento, tipo_animal, sexo, imagen_url, protectora_id) VALUES ('Oreo', 'CHIP789', '2022-03-05', 'CONEJO','MACHO', 'https://img.freepik.com/foto-gratis/retrato-lindo-conejo-gris-esponjoso-orejas-verde-natural_78492-3801.jpg?size=626&ext=jpg', 1);
INSERT INTO animales (nombre, chip, anio_nacimiento, tipo_animal, sexo, imagen_url, protectora_id) VALUES ('Lucy', 'CHIP567', '2020-04-05', 'PERRO', 'HEMBRA', 'https://img.freepik.com/foto-gratis/perro-marron-pelo-largo-lengua-fuera_1194-1092.jpg?size=626&ext=jpg', 1);
INSERT INTO animales (nombre, chip, anio_nacimiento, tipo_animal, sexo, imagen_url, protectora_id) VALUES ('Nala', 'CHIP678', '2019-05-05', 'GATO', 'HEMBRA', 'https://img.freepik.com/foto-gratis/gato-sobre-fondo-blanco_155003-15381.jpg?size=626&ext=jpg', 2);
INSERT INTO animales (nombre, chip, anio_nacimiento, tipo_animal, sexo, imagen_url, protectora_id) VALUES ('Rocky', 'CHIP890', '2019-06-05', 'PERRO', 'MACHO', 'https://img.freepik.com/foto-gratis/perro-beagle-sentado-fondo-blanco_53876-30186.jpg?size=626&ext=jpg', 2);
INSERT INTO animales (nombre, chip, anio_nacimiento, tipo_animal, sexo, imagen_url, protectora_id) VALUES ('Jasper', 'CHIP678', '2022-01-05', 'GATO', 'MACHO', 'https://img.freepik.com/foto-gratis/cerrar-lindo-gato-interior_23-2148882585.jpg?size=626&ext=jpg', 2);
INSERT INTO animales (nombre, chip, anio_nacimiento, tipo_animal, sexo, imagen_url, protectora_id) VALUES ('Coco', 'CHIP567', '2022-02-05', 'CONEJO', 'MACHO', 'https://img.freepik.com/foto-gratis/hermoso-conejo-gris-gracioso-verde-natural_78492-3803.jpg?size=626&ext=jpg', 2);
INSERT INTO animales (nombre, chip, anio_nacimiento, tipo_animal, sexo, imagen_url, protectora_id) VALUES ('Buddy', 'CHIP111', '2019-08-12', 'PERRO', 'MACHO', 'https://example.com/buddy.jpg', 1);
INSERT INTO animales (nombre, chip, anio_nacimiento, tipo_animal, sexo, imagen_url, protectora_id) VALUES ('Smokey', 'CHIP222', '2020-04-20', 'GATO', 'MACHO', 'https://example.com/smokey.jpg', 2);
INSERT INTO animales (nombre, chip, anio_nacimiento, tipo_animal, sexo, imagen_url, protectora_id) VALUES ('Lucky', 'CHIP333', '2017-12-01', 'PERRO', 'HEMBRA', 'https://example.com/lucky.jpg', 1);
INSERT INTO animales (nombre, chip, anio_nacimiento, tipo_animal, sexo, imagen_url, protectora_id) VALUES ('Whiskers', 'CHIP444', '2021-02-10', 'GATO', 'MACHO', 'https://example.com/whiskers.jpg', 2);
INSERT INTO animales (nombre, chip, anio_nacimiento, tipo_animal, sexo, imagen_url, protectora_id) VALUES ('Max', 'CHIP555', '2022-06-25', 'PAJARO', 'MACHO', 'https://example.com/max.jpg', 1);
INSERT INTO animales (nombre, chip, anio_nacimiento, tipo_animal, sexo, imagen_url, protectora_id) VALUES ('Cinnamon', 'CHIP666', '2020-11-15', 'GATO','MACHO',  'https://example.com/cinnamon.jpg', 2);
INSERT INTO animales (nombre, chip, anio_nacimiento, tipo_animal, sexo, imagen_url, protectora_id) VALUES ('Rusty', 'CHIP777', '2021-03-05', 'GATO', 'MACHO', 'https://example.com/rusty.jpg', 1);
INSERT INTO animales (nombre, chip, anio_nacimiento, tipo_animal, sexo, imagen_url, protectora_id) VALUES ('Mittens', 'CHIP888', '2019-09-08', 'GATO', 'MACHO', 'https://example.com/mittens.jpg', 2);
INSERT INTO animales (nombre, chip, anio_nacimiento, tipo_animal, sexo, imagen_url, protectora_id) VALUES ('Oscar', 'CHIP999', '2022-01-30', 'PERRO', 'MACHO', 'https://example.com/oscar.jpg', 1);
INSERT INTO animales (nombre, chip, anio_nacimiento, tipo_animal, sexo, imagen_url, protectora_id) VALUES ('Bailey', 'CHIP777', '2018-10-10', 'PERRO', 'HEMBRA', 'https://example.com/bailey.jpg', 2);
INSERT INTO animales (nombre, chip, anio_nacimiento, tipo_animal, sexo, imagen_url, protectora_id) VALUES ('Misty', 'CHIP888', '2020-07-18', 'GATO', 'HEMBRA', 'https://example.com/misty.jpg', 1);
INSERT INTO animales (nombre, chip, anio_nacimiento, tipo_animal, sexo, imagen_url, protectora_id) VALUES ('Rocky', 'CHIP999', '2019-05-02', 'PERRO', 'MACHO', 'https://example.com/rocky.jpg', 2);
INSERT INTO animales (nombre, chip, anio_nacimiento, tipo_animal, sexo, imagen_url, protectora_id) VALUES ('Sasha', 'CHIP111', '2021-01-15', 'GATO', 'HEMBRA', 'https://example.com/sasha.jpg', 1);
INSERT INTO animales (nombre, chip, anio_nacimiento, tipo_animal, sexo, imagen_url, protectora_id) VALUES ('Teddy', 'CHIP222', '2022-04-30', 'PERRO', 'MACHO', 'https://example.com/teddy.jpg', 2);
INSERT INTO animales (nombre, chip, anio_nacimiento, tipo_animal, sexo, imagen_url, protectora_id) VALUES ('Cleo', 'CHIP333', '2020-08-25', 'GATO', 'MACHO', 'https://example.com/cleo.jpg', 1);
INSERT INTO animales (nombre, chip, anio_nacimiento, tipo_animal, sexo, imagen_url, protectora_id) VALUES ('Oliver', 'CHIP444', '2019-11-12', 'PERRO', 'MACHO', 'https://example.com/oliver.jpg', 2);
INSERT INTO animales (nombre, chip, anio_nacimiento, tipo_animal, sexo, imagen_url, protectora_id) VALUES ('Luna', 'CHIP555', '2021-02-28', 'GATO', 'HEMBRA', 'https://example.com/luna.jpg', 1);
INSERT INTO animales (nombre, chip, anio_nacimiento, tipo_animal, sexo, imagen_url, protectora_id) VALUES ('Riley', 'CHIP666', '2020-06-10', 'PERRO', 'MACHO', 'https://example.com/riley.jpg', 2);
INSERT INTO animales (nombre, chip, anio_nacimiento, tipo_animal, sexo, imagen_url, protectora_id) VALUES ('Simba', 'CHIP777', '2022-03-20', 'GATO', 'MACHO', 'https://example.com/simba.jpg', 1);



-- Insertar datos en la tabla adopciones
INSERT INTO adopciones (id_persona, id_animal, fecha_adopcion, estado_actual) VALUES (1, 1, '2023-07-31', 'ADOPTADO');
INSERT INTO adopciones (id_persona, id_animal, fecha_adopcion, estado_actual) VALUES (2, 2, '2023-07-30', 'EN_PROCESO');
INSERT INTO adopciones (id_persona, id_animal, fecha_adopcion, estado_actual) VALUES (3, 3, '2023-08-05', 'EN_PROCESO');
INSERT INTO adopciones (id_persona, id_animal, fecha_adopcion, estado_actual) VALUES (4, 4, '2023-08-02', 'ADOPTADO');
INSERT INTO adopciones (id_persona, id_animal, fecha_adopcion, estado_actual) VALUES (5, 5, '2023-08-08', 'ADOPTADO');
INSERT INTO adopciones (id_persona, id_animal, fecha_adopcion, estado_actual) VALUES (6, 6, '2023-08-06', 'EN_PROCESO');
INSERT INTO adopciones (id_persona, id_animal, fecha_adopcion, estado_actual) VALUES (7, 7, '2023-08-10', 'ADOPTADO');

