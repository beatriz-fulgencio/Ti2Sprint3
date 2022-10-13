package app;

import static spark.Spark.*;

import service.*;


public class Aplicacao {
	
	private static UsuarioService usuarioService = new UsuarioService();
	private static FaqService faqService = new FaqService();
	private static ArtigoService artigoService = new ArtigoService();
	

	
    public static void main(String[] args) {
        port(6789);
        
        staticFiles.location("/public");
        
        
    
        
        get("/artigo", (request, response) -> artigoService.getHome());
        
		post("/artigo/insert", (request, response) -> artigoService.insert(request, response));

        get("/artigo/:idUsuario", (request, response) -> artigoService.get(request, response));
        
        get("/artigo/list/:orderby", (request, response) -> artigoService.getAll(request, response));

        get("/artigo/update/:idUsuario", (request, response) -> artigoService.getToUpdate(request, response));
        
        post("/artigo/update/:idUsuario", (request, response) -> artigoService.update(request, response));
           
        get("/artigo/delete/:idUsuario", (request, response) -> artigoService.delete(request, response));
        

        
        get("/usuario", (request, response) -> usuarioService.getHome());
        
        post("/usuario/insert", (request, response) -> usuarioService.insert(request, response));

        get("/usuario/:idUsuario", (request, response) -> usuarioService.get(request, response));
        
        get("/usuario/list/:orderby", (request, response) -> usuarioService.getAll(request, response));

        get("/usuario/update/:idUsuario", (request, response) -> usuarioService.getToUpdate(request, response));
        
        post("/usuario/update/:idUsuario", (request, response) -> usuarioService.update(request, response));
           
        get("/usuario/delete/:idUsuario", (request, response) -> usuarioService.delete(request, response));
        
        
        
        get("/faq", (request, response) -> faqService.getHome());
        
        post("/faq/insert", (request, response) -> faqService.insert(request, response));

        get("/faq/:idUsuario", (request, response) -> faqService.get(request, response));
        
        get("/faq/list/:orderby", (request, response) -> faqService.getAll(request, response));

        get("/faq/update/:idUsuario", (request, response) -> faqService.getToUpdate(request, response));
        
        post("/faq/update/:idUsuario", (request, response) -> faqService.update(request, response));
           
        get("/faq/delete/:idUsuario", (request, response) -> faqService.delete(request, response));
    }
}