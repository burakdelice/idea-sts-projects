package com.turkeyjug;

public class Calisan {

    long kimlikNo=11234567890L;
    String adi;
    String soyadi;
    float maas;
    boolean sigorta;

    public Calisan(long kimlikNo, String adi, String soyadi, float maas, boolean sigorta) {
        this.kimlikNo = kimlikNo;
        this.adi = adi;
        this.soyadi = soyadi;
        this.maas = maas;
        this.sigorta = sigorta;
    }

    public long getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(long kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public float getMaas() {
        return maas;
    }

    public void setMaas(float maas) {
        this.maas = maas;
    }

    public boolean isSigorta() {
        return sigorta;
    }

    public void setSigorta(boolean sigorta) {
        this.sigorta = sigorta;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "kimlikNo=" + kimlikNo +
                ", adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", maas=" + maas +
                ", sigorta=" + sigorta +
                '}';
    }
}