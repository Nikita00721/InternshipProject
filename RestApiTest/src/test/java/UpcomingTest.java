import clients.FrontendClient;
import com.altenar.sb2.admin.model.UpdateHighlightsConfigRequest;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class UpcomingTest {
    @Test
    public void getUpcomingTest() {
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

        UpdateHighlightsConfigRequest updateHighlightsConfigRequest =
                new UpdateHighlightsConfigRequest();
        updateHighlightsConfigRequest.setConfigId(123);

        com.altenar.sb2.frontend.model.GetUpcomingEventsResults getUpcomingResponse = FrontendClient.getUpcoming(queryParams);

        System.out.println(getUpcomingResponse.getEvents().toString());
    }
}
