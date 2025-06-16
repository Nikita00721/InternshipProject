package model.getHighlightsResponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SpecOdd{

	@JsonProperty("TypeId")
	private Integer typeId;

	@JsonProperty("Name")
	private String name;
}