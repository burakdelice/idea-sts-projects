package org.example.controller;

import org.example.model.Kiralama;
import org.example.service.KiralamaService;

public class KiralamaController {

    private KiralamaService kiralamaService;

    public KiralamaController() {
        this.kiralamaService = new KiralamaService();
    }


    public Kiralama kiralamaOlustur(Kiralama kiralama) {
        return kiralamaService.kiralamaOlustur(kiralama);
    }
}
