package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import static play.data.Form.*;
import views.html.*;
import play.data.validation.Constraints.*;

public class Application extends Controller {
	
	public static class MyForm {
		@Required
		public String name;
		public String mail;
		public String tel;
		
		public String toString() {
			return "NAME:" + name + " MAIL:" + mail + " TEL:" + tel;
		}
	}

    public static Result index() {
    	String title = "Play sample Page";
    	String msg = "フォームのサンプルです。";
    	/*String[] contents = new String[]{
    		"PlayはJSP/サーブレットとは異なる新しいフレームワークです。",
    		"Scalaというスクリプト言語を用い簡単にコーディングできます。",
    		"HerokuなどのIaasにも簡単にデプロイできます。"    			
    	};*/
        //return ok(index.render(title,msg,contents));
    	return ok(index.render(title, msg, form(MyForm.class)));
    }
    
    public static Result sendform() {
    	String title = "Play send Form Page";
    	Form<MyForm> form = form(MyForm.class).bindFromRequest();
    	if (form.hasErrors()) {
    		String msg = "入力に問題があります。";
    		return badRequest(index.render(title, msg, form));
    	} else {
    		MyForm data = form.get();
    		String msg = data.toString();
    		return ok(index.render(title, msg, form));
    	}
    }
}
