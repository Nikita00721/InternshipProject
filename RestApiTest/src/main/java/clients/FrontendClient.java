package clients;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class FrontendClient {
    public static com.altenar.sb2.frontend.model.GetUpcomingEventsResults getUpcoming(Map<String, String> queryParam) {
        return given()
                .baseUri("https://sb2frontend-altenar2-stage.biahosted.com")
                .queryParams(queryParam)
                .when()
                .get("/api/Sportsbook/GetUpcoming")
                .then()
                .statusCode(200)
                .extract()
                .response()
                .as(com.altenar.sb2.frontend.model.GetUpcomingEventsResults.class);
    }
}
