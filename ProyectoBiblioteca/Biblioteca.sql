create database Biblioteca;
drop database Biblioteca;
use Biblioteca;

-- creacion tabla administradores
CREATE TABLE Administrador(
	id int AUTO_INCREMENT primary key,
    usuario varchar(50) unique,
    contrasena varchar(50)
);
-- Creación de la tabla Usuarios
CREATE TABLE Alumno (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(50),
  apellido VARCHAR(50),
  cod_alumno  VARCHAR(10) unique
);

-- Creación de la tabla Libros
CREATE TABLE Libro (
  id INT AUTO_INCREMENT PRIMARY KEY,
  titulo VARCHAR(100),
  autor VARCHAR(100),
  anio DATE,
  genero VARCHAR(100),
  stock INT
);

-- Creación de la tabla Prestamos
CREATE TABLE Prestamo (
  id INT AUTO_INCREMENT PRIMARY KEY,
  id_libro INT,
  id_persona INT,
  fecha_prestamo DATE,
  fecha_devolucion DATE,
  FOREIGN KEY (id_libro) REFERENCES Libro(id),
  FOREIGN KEY (id_persona) REFERENCES Alumno(id)
);


INSERT INTO Administrador (usuario, contrasena) VALUES ( 'admin', 'password123');



INSERT INTO Libro (titulo, autor, anio, genero, stock) VALUES ('Harry Potter', 'James Cameron', '2012-06-15', 'Ficcion', 10);
INSERT INTO Libro (titulo, autor, anio, genero, stock) VALUES ('La Sirenita', 'Polo Campos', '2003-06-12', 'Ficcion 2', 5);
INSERT INTO Libro (titulo, autor, anio, genero, stock) VALUES ('Navegando', 'Deysi Donald', '2012-12-22', 'Ficcion 2', 5);

INSERT INTO Alumno (nombre, apellido, cod_alumno) VALUES ('Juan', 'Perez', '12345678');
INSERT INTO Alumno (nombre, apellido, cod_alumno) VALUES ('María', 'Gomez', '87654321');
INSERT INTO Alumno (nombre, apellido, cod_alumno) VALUES ('Alex', 'Santiago', '71409211');


select * from Libro;
select * from Administrador;
select * from Alumno;

INSERT INTO Prestamo (id_libro, id_persona, fecha_prestamo, fecha_devolucion) VALUES (1, 1, '2023-06-01', '2023-06-08');
INSERT INTO Prestamo (id_libro, id_persona, fecha_prestamo, fecha_devolucion) VALUES (2, 2, '2023-06-03', '2023-06-10');
INSERT INTO Prestamo(id_libro, id_persona, fecha_prestamo, fecha_devolucion) VALUES(2,1,'2023-06-02','2023-06-05');
INSERT INTO Prestamo(id_libro, id_persona, fecha_prestamo, fecha_devolucion) VALUES(9,13,'2023-06-17','2023-07-15');
select * from Prestamo;

drop table Prestamo;