package api.base;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.http.ContentType;


public class BaseUri {

	protected static String URI;


	public String baseUri(String baseuri, int status, String id) {
		URI=baseuri;
		given()
		.relaxedHTTPSValidation()
		.get(URI)
		.then()
		.statusCode(status)
		.contentType(ContentType.JSON)
		.assertThat()
        .body("id",equalTo(new Integer(id)));	
		return URI;
	}
		
	public String meses() {
		String meses = "[112, 124, 136, 148]";
		return meses;	
	}
	
	public String valores() {
		String valores = "[2.802, 3.174, 3.564, 3.971]";
		return valores;
	}
}
