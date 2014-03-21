package controllers;

import play.*;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

    public static Result index() 
	{
        return ok(views.html.index.render());
    }
	
	public static Result aboutus()
	{
		return ok(views.html.about.render());
	}
	
	public static Result login()
	{
		return ok(views.html.login.render());
	}
									
	public static Result signup()
	{
		return ok(views.html.signup.render());
	}
	
	public static Result help()
	{
		return ok(views.html.help.render());
	}	
}
