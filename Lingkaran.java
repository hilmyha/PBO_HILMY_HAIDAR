package com.haidar.praktikumpbo.pertemuan6.unguided;

public class Lingkaran extends BangunDatar{
    double jari;

    public Lingkaran(double jari) {
        this.jari = jari;
    }

    @Override
    public double keliling() {
        return (2 * Math.PI * jari);
    }

    @Override
    public double luas() {
        return (Math.PI * jari * jari);
    }
}
