package br.com.musication.controller;

import br.com.musication.api.MusicationAPI;
import br.com.musication.domain.mapper.LocationMapper;
import br.com.musication.domain.request.LocationRequest;
import br.com.musication.domain.response.LocationResponse;
import br.com.musication.domain.response.SongResponse;
import br.com.musication.service.MusicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.text.ParseException;
import java.util.List;

/**
 * @author macrusal on 09/10/21
 * @project musication
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(value="/musication")
public class MusicationController implements MusicationAPI {

    private final MusicationService musicationService;

    @Override
    @RequestMapping(value ="/location" ,method= RequestMethod.POST)
    public ResponseEntity< LocationResponse > insert( @Valid LocationRequest locationRequest ) throws ParseException {
        return musicationService.insert( LocationMapper.toEntity(locationRequest));
    }

    @Override
    @RequestMapping(value="/song/{id}", method= RequestMethod.GET)
    public ResponseEntity< SongResponse > find( String id ) {
        return musicationService.find( id );
    }

    @Override
    @RequestMapping(value="/song", method= RequestMethod.GET)
    public ResponseEntity< List< SongResponse > > findAll() {
        return musicationService.findAll();
    }
}
