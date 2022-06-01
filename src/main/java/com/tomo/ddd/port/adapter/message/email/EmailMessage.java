package com.tomo.ddd.port.adapter.message.email;

import com.tomo.ddd.email.Message;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.File;

@Getter
@Setter
@NoArgsConstructor
public class EmailMessage implements Message {
    String to;
    String from;
    String subject;
    String body;
    File attachment;

    public EmailMessage(String to, String from, String subject, String body) {
        this.to = to;
        this.from = from;
        this.subject = subject;
        this.body = body;
    }
}
