package com.haidar.praktikumpbo.pertemuan6.unguided;

public class KelSegitiga extends BangunDatar{
    double sisi;

    public KelSegitiga(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double keliling() {
        return this.sisi * 3;
    }
}
