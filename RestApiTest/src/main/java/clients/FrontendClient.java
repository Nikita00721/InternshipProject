package clients;

import io.restassured.http.ContentType;
import model.getHighlightsResponse.GetUpcomingResponse;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class FrontendClient {
    public static GetUpcomingResponse getUpcoming(Map<String, String> queryParam) {
        return given()
                .baseUri("https://sb2frontend-altenar2-stage.biahosted.com")
                .contentType(ContentType.URLENC)
                .queryParams(queryParam)
                .post("/api/Sportsbook/GetUpcoming")
                .then()
                .statusCode(200)
                .extract()
                .response()
                .as(GetUpcomingResponse.class);
    }
}
