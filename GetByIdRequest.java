package Stepdefination;

import static org.hamcrest.Matchers.equalTo;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetByIdRequest {
	Response res;
	ValidatableResponse validate;
	@When("User wants to fetch data by using URI as {string}")
	public void user_wants_to_fetch_data_by_using_uri_as(String s1) {
	   res=RestAssured.get(s1);
	}

	@Then("User want to verify the status code as {int}")
	public void user_want_to_verify_the_status_code_as(Integer s2) {
	   validate.assertThat().statusCode(s2);
		 validate.body("message",equalTo("Found Successfully"));
	validate=res.then();
	validate.log().all();
	}
}