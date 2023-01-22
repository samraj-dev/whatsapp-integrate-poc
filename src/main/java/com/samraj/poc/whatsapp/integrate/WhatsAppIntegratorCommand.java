package com.samraj.poc.whatsapp.integrate;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
@Slf4j
public class WhatsAppIntegratorCommand {

    @Autowired
    private WhatsAppIntegrateService whatsAppIntegrateService;

    @ShellMethod("Send Message to WhatsApp Number")
    public String send(String number) {
        PayloadEntity payloadEntity = new PayloadEntity();
        payloadEntity.setTo(number);
        ResponseEntity<String> response =  whatsAppIntegrateService.sendWhatsAppMessage(payloadEntity);
        return response.getBody();
    }
}
