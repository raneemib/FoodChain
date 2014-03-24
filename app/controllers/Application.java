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
	
	public static Result contactus()
	{
		return ok(views.html.contact.render());
	}

	public static Result donate()
	{
		return ok(views.html.donation.render());
	}		
}
