CREATE DATABASE IF NOT EXISTS Registro;
USE Registro;

CREATE TABLE IF NOT EXISTS Usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    usuario VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS Persona (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255),
    edad INT,
    usuario_id INT,
    FOREIGN KEY (usuario_id) REFERENCES Usuarios(id)
);


select * from Usuarios;

INSERT INTO Usuarios (usuario, password) VALUES ('ejemplo', 'contrasena123');
INSERT INTO Usuarios (usuario, password) VALUES ('usuario2', 'contrasena456');
INSERT INTO Usuarios (usuario, password) VALUES ('usuario3', 'miclave123');
INSERT INTO Usuarios (usuario, password) VALUES ('usuario4', 'secreto789');

INSERT INTO Persona (nombre, edad, usuario_id) VALUES ('Ana', 25, 2);
INSERT INTO Persona (nombre, edad, usuario_id) VALUES ('Luis', 28, 3);
INSERT INTO Persona (nombre, edad, usuario_id) VALUES ('María', 32, 4);
INSERT INTO Persona (nombre, edad, usuario_id) VALUES ('Juan', 30, 1);


select * from Usuarios;


-- Algunos inner para utilizar:

SELECT Persona.nombre, Persona.edad, Usuarios.usuario
FROM Persona
INNER JOIN Usuarios ON Persona.usuario_id = Usuarios.id;

SELECT Persona.*, Usuarios.password
FROM Persona
INNER JOIN Usuarios ON Persona.usuario_id = Usuarios.id;



