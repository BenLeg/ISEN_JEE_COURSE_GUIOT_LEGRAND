package yncrea.lab07.web.data;

import yncrea.lab07.web.dto.Slide;

import javax.websocket.Session;

public class SlideSession {

    private Session session;

    public SlideSession(Session s) {
    }

    public void send(Object message) {
        try {
            this.session.getBasicRemote().sendObject(message);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }

}
