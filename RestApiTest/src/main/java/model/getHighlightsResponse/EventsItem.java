package model.getHighlightsResponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class EventsItem{

	@JsonProperty("CategoryId")
	private Integer categoryId;

	@JsonProperty("EventDate")
	private String eventDate;

	@JsonProperty("EventType")
	private Integer eventType;

	@JsonProperty("Node")
	private String node;

	@JsonProperty("IsVirtual")
	private Boolean isVirtual;

	@JsonProperty("EventCode")
	private Integer eventCode;

	@JsonProperty("Name")
	private String name;

	@JsonProperty("Competitors")
	private List<CompetitorsItem> competitors;

	@JsonProperty("ChampId")
	private Integer champId;

	@JsonProperty("SportId")
	private Integer sportId;

	@JsonProperty("Items")
	private List<ItemsItem> items;

	@JsonProperty("Status")
	private Integer status;

	@JsonProperty("IsPromo")
	private Boolean isPromo;

	@JsonProperty("ISO")
	private String iSO;

	@JsonProperty("ChampName")
	private String champName;

	@JsonProperty("SportTypeId")
	private Integer sportTypeId;

	@JsonProperty("SportName")
	private String sportName;

	@JsonProperty("IsLiveStream")
	private Boolean isLiveStream;

	@JsonProperty("IsLiveBooked")
	private Boolean isLiveBooked;

	@JsonProperty("SelectionsCount")
	private Integer selectionsCount;

	@JsonProperty("SportIcon")
	private String sportIcon;

	@JsonProperty("ExtId")
	private String extId;

	@JsonProperty("CategoryName")
	private String categoryName;

	@JsonProperty("IsLiveEvent")
	private Boolean isLiveEvent;

	@JsonProperty("DbId")
	private Integer dbId;

	@JsonProperty("IsSafe")
	private Boolean isSafe;

	@JsonProperty("Id")
	private Integer id;

	@JsonProperty("CompetitorsCount")
	private Integer competitorsCount;

	@JsonProperty("CategoryOrder")
	private Integer categoryOrder;

	@JsonProperty("IsParlay")
	private Boolean isParlay;
}