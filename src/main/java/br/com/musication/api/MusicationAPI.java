package br.com.musication.api;

import br.com.musication.domain.request.LocationRequest;
import br.com.musication.domain.response.LocationResponse;
import br.com.musication.domain.response.SongResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.text.ParseException;
import java.util.List;

/**
 * @author macrusal on 09/10/21
 * @project musication
 */
@Api(tags = "User")
public interface MusicationAPI {

    @ApiOperation(value = "Enviar localização", notes = "", httpMethod = "POST", produces = "application/json")
    @ApiResponses({
            @ApiResponse(code = 201, message = "Localização recebida com sucesso", response = Void.class),
            @ApiResponse(code = 500, message = "Erro interno", response = Void.class)
    })
    ResponseEntity< LocationResponse > insert( @Valid @RequestBody LocationRequest locationRequest ) throws ParseException;

    @ApiOperation(value = "Procurar músicapor id", notes = "", httpMethod = "GET", produces = "application/json")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Busca pela música executada com sucesso", response = Void.class),
            @ApiResponse(code = 204, message = "Música não encontrada", response = Void.class),
            @ApiResponse(code = 404, message = "Erro na busca, música não encontrada", response = Void.class),
            @ApiResponse(code = 500, message = "Erro interno", response = Void.class)
    })
    ResponseEntity< SongResponse > find(
            @ApiParam(value = "Song id.", required = true, example = "9999") @PathVariable final String id );


    @ApiOperation(value = "Retorna lista de músicas", notes = "", httpMethod = "GET", produces = "application/json")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Lista de músicas encontradas com sucesso", response = Void.class),
            @ApiResponse(code = 204, message = "Lista de músicas não encontrada", response = Void.class),
            @ApiResponse(code = 404, message = "Erro na busca, músicas não encontradas", response = Void.class),
            @ApiResponse(code = 500, message = "Erro interno", response = Void.class)
    })
    ResponseEntity< List<SongResponse> > findAll( );
}
