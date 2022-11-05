package Authentication;
import static io.restassured.RestAssured.baseURI;

import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject; 
import io.restassured.http.ContentType;

public class PostAuthenticationToken {

	public static void main(String[] args) {
		baseURI="https://api.github.com";
		
		JSONObject obj=new JSONObject();
		obj.put("name","Sprint2");
		
		given().auth().oauth2("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")
		.body(obj).contentType(ContentType.JSON)
		.when().post("/user/repos")
		.then().log().all();
	}

}