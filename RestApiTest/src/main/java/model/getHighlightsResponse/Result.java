package model.getHighlightsResponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Result{

	@JsonProperty("ShowMoreEventsInt")
	private Boolean showMoreEventsInt;

	@JsonProperty("EventsCount")
	private Integer eventsCount;

	@JsonProperty("Items")
	private List<ItemsItem> items;

	@JsonProperty("IsLiveStream")
	private Boolean isLiveStream;

	@JsonProperty("ShowMoreEvents")
	private Boolean showMoreEvents;
}