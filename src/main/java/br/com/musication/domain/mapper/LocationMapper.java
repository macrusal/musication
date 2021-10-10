package br.com.musication.domain.mapper;


import br.com.musication.domain.Location;
import br.com.musication.domain.request.LocationRequest;
import br.com.musication.domain.response.LocationResponse;
import org.springframework.stereotype.Component;

/**
 * @author macrusal on 09/10/21
 * @project musication
 */
@Component
public class LocationMapper {

    public static Location toEntity( LocationRequest locationRequest ) {
        return Location.builder()
                .latitude( Double.valueOf( locationRequest.getLatitude() ) )
                .longitude( Double.valueOf( locationRequest.getLongitude() ) )
                .build();
    }

    public static LocationResponse toResponse( Location location ) {
        return LocationResponse.builder()
                .latitude( String.valueOf(location.getLatitude()) )
                .longitude( String.valueOf(location.getLongitude()) )
                .build();
    }
}
