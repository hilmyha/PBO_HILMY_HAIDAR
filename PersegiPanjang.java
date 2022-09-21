package com.haidar.praktikumpbo.pertemuan6.unguided;

public class PersegiPanjang extends BangunDatar{
    double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double keliling() {
        return 2 * (this.panjang + this.lebar);
    }

    @Override
    public double luas() {
        return this.panjang * this.lebar;
    }
}
