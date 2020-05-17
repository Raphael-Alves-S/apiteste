package testapi.api;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import api.base.BaseUri;

import io.restassured.response.Response;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestApi extends BaseUri{
	
	@Test
	public void a_validarUri() {
		baseUri("http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador", 200, "1");		
	}
	

	@Test
	public void b_validarMeses() {
		Response response =
		given()
	    .get (URI)
		.then()
		.extract().response();
		final String mes = response.jsonPath().getString("meses");
		assertEquals(meses(), mes);	
	}
	
	@Test
	public void c_validarValores() {
		Response response =
		given()
	    .get (URI)
		.then()
		.extract().response();
		final String valor = response.jsonPath().getString("valor");
		assertEquals(valores(), valor);	
	}

}
