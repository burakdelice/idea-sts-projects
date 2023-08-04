package org.example.service;

import org.example.model.Kiralama;
import org.example.repository.KiralamaRepository;

public class KiralamaService {

    private KiralamaRepository kiralamaRepository;

    public KiralamaService() {
        this.kiralamaRepository = new KiralamaRepository();
    }

    public void kiradakiEvler() {
        kiralamaRepository.kiradakiEvler();
    }

    public Kiralama kiralamaOlustur(Kiralama kiralama) {
        return kiralamaRepository.kiralamaOlustur(kiralama);
    }
}
