package model.getHighlightsResponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GetUpcomingResponse {

	@JsonProperty("Result")
	private Result result;
}