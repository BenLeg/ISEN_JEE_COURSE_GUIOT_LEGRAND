package yncrea.lab07.web.transformation;

import com.fasterxml.jackson.databind.ObjectMapper;
import yncrea.lab07.web.dto.Slide;

import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;
import java.io.IOException;

public class SlideDecoder implements Decoder.Text<Slide> {

    private ObjectMapper objectMapper;
    private Slide slide;

    @Override
    public Slide decode(String s) throws DecodeException {
        try {
            this.slide = objectMapper.readValue( s, Slide.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return slide;
    }

    @Override
    public boolean willDecode(String s) {
        return false;
    }

    @Override
    public void init(EndpointConfig endpointConfig) {
        objectMapper = new ObjectMapper();
    }

    @Override
    public void destroy() {
        objectMapper.disable();
    }
}
