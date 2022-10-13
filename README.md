# Sprint 3
## Passos de como testar Entrega
### 1. Criação dos Bancos de dados
CREATE TABLE IF NOT EXISTS public.usuario

(
    idusuario integer NOT NULL DEFAULT nextval('usuario_idusuario_seq'::regclass),
    
    email character varying(100) COLLATE pg_catalog."default" NOT NULL,
    
    nomeusuario character varying(20) COLLATE pg_catalog."default" NOT NULL,
    
    senha character varying(50) COLLATE pg_catalog."default" NOT NULL,
    
    primeironome character varying(30) COLLATE pg_catalog."default" NOT NULL,
    
    sobrenome character varying(50) COLLATE pg_catalog."default",
    
    CONSTRAINT usuario_pkey PRIMARY KEY (idusuario),
    
    CONSTRAINT usuario_email_key UNIQUE (email),
    
    CONSTRAINT usuario_nomeusuario_key UNIQUE (nomeusuario)
    
)

CREATE TABLE IF NOT EXISTS public.categoria
(
    idcategoria integer NOT NULL,
    categoria character varying(200) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT categoria_pkey PRIMARY KEY (idcategoria)
)


CREATE TABLE IF NOT EXISTS public.artigo
(
    idartigo integer NOT NULL DEFAULT nextval('artigo_idartigo_seq'::regclass),
    categoria integer,
    palavrachave character varying(50) COLLATE pg_catalog."default",
    tag character varying(200) COLLATE pg_catalog."default" NOT NULL,
    texto text COLLATE pg_catalog."default" NOT NULL,
    titulo character varying(20) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT artigo_pkey PRIMARY KEY (idartigo),
    CONSTRAINT fk_artigoo FOREIGN KEY (categoria)
        REFERENCES public.categoria (idcategoria) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

Create table Faq(
	idfaq serial Primary key,
	pergunta VARCHAR(500) NOT NULL, 
	resposta VARCHAR(500)
);

insert into categoria values (0, 'Dia-a-dia')
insert into categoria values (1, 'Configuracoes')
insert into categoria values (2, 'Cuidados')

### 2. Verificar no arquivo DAO se o username e senha estão corretos
.
### 3. Acessar o localhost na porta indicada e colocar \usuario para verificar a pagina do CRUD de usuário, \artigo para verificar a pagina do CRUD de artigos e  \faq para verificar a pagina do CRUD de FAQ
