package br.com.musication.domain.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

/**
 * @author macrusal on 09/10/21
 * @project musication
 */
@Data
@Builder
public class SongResponse {

    @ApiModelProperty(name = "musicArtist", required = true, example = "Simple Chord CWB")
    private String musicArtist;

    @ApiModelProperty(name = "musicName", required = true, example = "Black")
    private String musicName;

    @ApiModelProperty(name = "urlTrack", required = true, example = "https://65381g.ha.azioncdn.net/3/e/a/8/simplechords-simple-chords-black-f7556596.mp3")
    private String urlTrack;
}
