package bdd;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class TestJDBC {

private List<String>  messages = new  ArrayList<String>();
public  List<String>  executerTests(HttpServletRequest request ){
	
	return messages;
}
	

}
