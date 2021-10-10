package br.com.musication.exception;

/**
 * @author macrusal on 10/10/21
 * @project musication
 */
public class SoundNotFoundException extends RuntimeException {

    public SoundNotFoundException() {
    }

    public SoundNotFoundException(String message) {
        super(message);
    }
}
