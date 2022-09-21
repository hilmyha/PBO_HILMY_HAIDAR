package com.haidar.praktikumpbo.pertemuan6.unguided;

public class LuSegitiga extends BangunDatar{
    double alas, tinggi;

    public LuSegitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
        return this.alas * this.tinggi;
    }
}
