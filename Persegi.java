package com.haidar.praktikumpbo.pertemuan6.unguided;

public class Persegi extends BangunDatar{
    double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double keliling() {
        return this.sisi * 4;
    }

    @Override
    public double luas() {
        return this.sisi * this.sisi;
    }
}
