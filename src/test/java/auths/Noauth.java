package auths;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;

public class Noauth {
	
@Test
	public void getcall() {
	
	given()
	
	
	.when().get("https://reqres.in/api/users?page=1")
	
	.then().statusCode(200).log().all();
	
	
}
@Test
public void postcall() {
	given().contentType("application/json").body("{\r\n"
			+ "    \"name\": \"morpheus\",\r\n"
			+ "    \"job\": \"zion resident\"\r\n"
			+ "}")
	.when().post("https://reqres.in/api/users")
	.then().statusCode(201).log().all();
}
@Test
public void putcall() {
	given().contentType("application/json").body("{\r\n"
			+ "    \"name\": \"morpheus\",\r\n"
			+ "    \"job\": \"toronto resident\"\r\n"
			+ "}")
	.when().put("https://reqres.in/api/users/2")
	.then().statusCode(200).log().all();
}

@Test
public void deletecall() {
	
given()


.when().delete("https://reqres.in/api/users/2")

.then().statusCode(204).log().all();


}

}
