package model.getHighlightsResponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ItemsItem{

	@JsonProperty("Order")
	private Integer order;

	@JsonProperty("Events")
	private List<EventsItem> events;

	@JsonProperty("Headers")
	private List<HeadersItem> headers;

	@JsonProperty("Node")
	private String node;

	@JsonProperty("SportTypeId")
	private Integer sportTypeId;

	@JsonProperty("Id")
	private Long id;

	@JsonProperty("Name")
	private String name;

	@JsonProperty("Status")
	private Integer status;

	@JsonProperty("OrgMarketTypeId")
	private Integer orgMarketTypeId;

	@JsonProperty("ColumnCount")
	private Integer columnCount;

	@JsonProperty("MColumnCount")
	private Integer mColumnCount;

	@JsonProperty("ShortName")
	private String shortName;

	@JsonProperty("SpecialOddsValue")
	private String specialOddsValue;

	@JsonProperty("SportMarketId")
	private Integer sportMarketId;

	@JsonProperty("Template")
	private Integer template;

	@JsonProperty("MarketTypeId")
	private String marketTypeId;

	@JsonProperty("SpecialOddsName")
	private String specialOddsName;

	@JsonProperty("Items")
	private List<ItemsItem> items;

	@JsonProperty("MobileColumnNum")
	private Integer mobileColumnNum;

	@JsonProperty("MB")
	private Integer mB;

	@JsonProperty("Price")
	private Object price;

	@JsonProperty("ColumnNum")
	private Integer columnNum;

	@JsonProperty("IsActive")
	private Boolean isActive;

	@JsonProperty("SelectionTypeId")
	private Integer selectionTypeId;

	@JsonProperty("Result")
	private Integer result;

	@JsonProperty("SPOV")
	private String sPOV;
}