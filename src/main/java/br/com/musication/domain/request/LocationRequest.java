package br.com.musication.domain.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

/**
 * @author macrusal on 09/10/21
 * @project musication
 */
@Data
@Builder
public class LocationRequest {

    @ApiModelProperty(name = "latitude", required = true, example = "-22.8184393")
    private String latitude;

    @ApiModelProperty(name = "longitude", required = true, example = "47.0669093")
    private String longitude;
}
