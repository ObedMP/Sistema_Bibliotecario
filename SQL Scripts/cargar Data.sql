INSERT INTO libro (libro_id, nombre, autor, categoria, precio, estado)
VALUES

    (1, 'Otelo', 'William Shakespeare', 'Novela Romantica', 25.45, 'OnStock'),
    (2, 'El cuervo', 'Edgar Allan Poe', 'Terror', 32.80, 'OnStock'),
    (3, 'El Gato Negro', 'Edgar Allan Poe', 'Terror', 45.00, 'OnStock'),
    (4, 'Ricardo III', 'William Shakespeare', 'Novela Historica', 46.00, 'OnStock'),
    (5, 'EL principe Feliz', 'Oscar Wilde', 'Aventuras', 69.00, 'OnStock');

INSERT INTO autor (autor_id, fecha_nacimiento, nombre, pais)
VALUES
    (1, '1604-11-01', 'William Shakespeare', 'Inglaterra'),
    (2, '1920-10-08', 'Frank Herbert', 'US'),
    (3, '1854-10-16', 'Oscar Wilde', 'IR'),
    (4, '1809-01-19', 'Edgar Allan Poe', 'US');

INSERT INTO categoria (catego_id, nombre, archivo)
VALUES
    (1, 'Novela Cientifica', 'IB'),
    (2, 'Sociedad', 'IO'),
    (3, 'Deporte', 'TF'),
    (4, 'Novela Historica', 'AB'),
    (5, 'Salud', 'IO'),
    (6, 'Novela Humoristica', 'AB'),
    (7, 'Aventuras', 'IO'),
    (8, 'Terror', 'AB'),
    (9, 'Novela Romantica', 'AB');
