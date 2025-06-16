import clients.FrontendClient;
import model.getHighlightsResponse.GetUpcomingResponse;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class HighlightsTests {
    @Test
    public void getHighlightsTest() {
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("timezoneOffset", "-180");
        queryParams.put("langId", "8");
        queryParams.put("skinName", "betsonic");
        queryParams.put("configId", "1");
        queryParams.put("culture", "en-gb");
        queryParams.put("countryCode", "RU");
        queryParams.put("deviceType", "Desktop");
        queryParams.put("numformat", "en");
        queryParams.put("integration", "skintest");
        queryParams.put("sportId", "67");
        queryParams.put("showAllEvents", "false");
        queryParams.put("count", "10");
        queryParams.put("hasStreaming", "false");

        GetUpcomingResponse getUpcomingResponse = FrontendClient.getUpcoming(queryParams);

        /* Место для ассертов (подсказывать не буду)
         Вот вам вывод в консоль для наглядности */

        System.out.println(getUpcomingResponse.getResult().toString());
    }
}
