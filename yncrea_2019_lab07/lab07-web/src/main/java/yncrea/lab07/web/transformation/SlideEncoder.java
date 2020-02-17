package yncrea.lab07.web.transformation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import yncrea.lab07.web.dto.Slide;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

public class SlideEncoder implements Encoder.Text<Slide>{

    private ObjectMapper objectMapper;
    private Slide slide;
    private String slideAsString;

    @Override
    public String encode(Slide slide) throws EncodeException {
        try {
            String slideAsString = objectMapper.writeValueAsString(this.slide);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return slideAsString;
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
