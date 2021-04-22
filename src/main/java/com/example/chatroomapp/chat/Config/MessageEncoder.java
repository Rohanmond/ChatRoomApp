package com.example.chatroomapp.chat.Config;

import com.example.chatroomapp.chat.Model.Message;
import com.google.gson.Gson;
import org.springframework.messaging.converter.GsonMessageConverter;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

public class MessageEncoder implements Encoder.Text<Message> {
    private static Gson gson=new Gson();
    @Override
    public String encode(Message message) throws EncodeException {
        return gson.toJson(message);
    }

    @Override
    public void init(EndpointConfig endpointConfig) {

    }

    @Override
    public void destroy() {

    }
}
