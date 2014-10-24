package controllers;

import models.Task;
import play.*;
import play.mvc.*;
import play.data.*;
import models.*;

import views.html.*;

public class Application extends Controller {

    /*public static Result index() {
        return ok(index.render("Your new application is ready."));
    }*/
	//static Form<Task> taskForm = Form.form(Task.class);
	
	public static Result index() {
		return redirect(routes.Application.tasks());
	  }
	  
	  public static Result tasks() {
	    return TODO;
	  }
	  
	  public static Result newTask() {
	    return TODO;
	  }
	  
	  public static Result deleteTask(Long id) {
	    return TODO;
	  }
}
