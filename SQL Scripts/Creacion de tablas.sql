--CREACION DE TABLAS
--AUTOR

--TABLAS CON LAS NORMALIZACIONES Y RELACIONES
CREATE TABLE IF NOT EXISTS public.autor
(
    autor_id integer NOT NULL DEFAULT nextval('autor_autor_id_seq'::regclass),
    fecha_nacimiento date,
    nombre character varying(255) COLLATE pg_catalog."default",
    pais character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT autor_pkey PRIMARY KEY (autor_id)
    )

--LIBRO
CREATE TABLE IF NOT EXISTS public.libro
(
    libroid integer NOT NULL DEFAULT nextval('libro_libroid_seq'::regclass),
    nombre character varying(255) COLLATE pg_catalog."default" NOT NULL,
    autor character varying(255) COLLATE pg_catalog."default" NOT NULL,
    categoria character varying(255) COLLATE pg_catalog."default",
    precio double precision,
    estado character varying(255) COLLATE pg_catalog."default")

--CATEGORIA
CREATE TABLE IF NOT EXISTS public.categoria
(
    catego_id integer NOT NULL DEFAULT nextval('categoria_catego_id_seq'::regclass),
    nombre character varying(255) COLLATE pg_catalog."default" NOT NULL,
    archivo character varying(255) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT pk_catego_id PRIMARY KEY (catego_id)
    )
