package auths;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class BearerTest {
	@Test
	public void getcall() {
		String token ="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";
	given().header("Authorization","Bearer "+token)
	.when().get("https://api.github.com/users/repos")
	
	.then().statusCode(200).log().all();
	
	
}

}
