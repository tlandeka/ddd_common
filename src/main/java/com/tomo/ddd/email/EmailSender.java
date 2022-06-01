package com.tomo.ddd.email;

public interface EmailSender<T extends Message> {

    void send(T message);

}
