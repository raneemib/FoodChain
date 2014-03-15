package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

	  public static void index() {
        render();
    }

    public static void showUser(String id) {
         render();
    }   

    public static void deleteUser(String id) {
        render();
    }

    public static void createUser(User user) {
        render();     
    } 

}
