package yncrea.lab07.web.data;

import yncrea.lab07.web.dto.Slide;

import javax.websocket.Session;

public class SlideSession {

    private Session session;

    public SlideSession(Session session) {
        this.session = session;
    }

    public void send(Object message) {
        try {
            if(message !=null) {
                session.getBasicRemote().sendObject(message);
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }

}
