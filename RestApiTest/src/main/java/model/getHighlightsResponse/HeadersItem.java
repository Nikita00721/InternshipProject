package model.getHighlightsResponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class HeadersItem{

	@JsonProperty("ColumnCount")
	private Integer columnCount;

	@JsonProperty("MarketTypeId")
	private String marketTypeId;

	@JsonProperty("MColumnCount")
	private Integer mColumnCount;

	@JsonProperty("SortOrder")
	private Integer sortOrder;

	@JsonProperty("Items")
	private List<ItemsItem> items;

	@JsonProperty("Template")
	private Integer template;

	@JsonProperty("Name")
	private String name;

	@JsonProperty("SpecOdd")
	private SpecOdd specOdd;
}