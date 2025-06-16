package model.getHighlightsResponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CompetitorsItem{

	@JsonProperty("Order")
	private Integer order;

	@JsonProperty("Id")
	private Integer id;

	@JsonProperty("Name")
	private String name;

	@JsonProperty("Logo")
	private String logo;
}