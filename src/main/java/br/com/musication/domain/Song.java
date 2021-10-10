package br.com.musication.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;

/**
 * @author macrusal on 07/10/21
 * @project musication
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Song {

    @Id
    private ObjectId id;

    @NotNull
    private String musicArtist;

    @NotNull
    private String musicName;

    @NotNull
    private String urlTrack;
}
