package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return redirect(routes.Application.test(2));
    }
    
    public static Result test(Long id){
    	return ok(index.render(id+"Tetetetete"));
    }

}
