package com.samraj.poc.whatsapp.integrate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PayloadEntity {

    private String messaging_product = "whatsapp";
    private String to;
    private String type = "template";
    private Template template = new Template();
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Template {
    private String name = "hello_world";
    private Language language = new Language();
}
@Data
@AllArgsConstructor
@NoArgsConstructor
class Language {
    private String code = "en_US";
}
