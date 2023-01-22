package com.samraj.poc.whatsapp.integrate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WhatsAppIntegrateService {

    @Autowired
    RestTemplate restTemplate;

    @Value("${whatsapp.connect.url}")
    private String whatsAppUrl;
    @Value("${whatsapp.connect.token}")
    private String token;

    public ResponseEntity<String> sendWhatsAppMessage(PayloadEntity payloadEntity) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(token);
        HttpEntity<PayloadEntity> request = new HttpEntity<PayloadEntity>(payloadEntity, headers);

        ResponseEntity<String> response = restTemplate.postForEntity(whatsAppUrl, request, String.class);
        return response;
    }
}
