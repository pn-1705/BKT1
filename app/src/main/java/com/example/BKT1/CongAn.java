package com.example.BKT1;

public class CongAn {
    String ten,capBac,noiCongTac,quocGia;
    int soSaoBinhChon,hinhAnh;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCapBac() {
        return capBac;
    }

    public void setCapBac(String capBac) {
        this.capBac = capBac;
    }

    public String getNoiCongTac() {
        return noiCongTac;
    }

    public void setNoiCongTac(String noiCongTac) {
        this.noiCongTac = noiCongTac;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public int getSoSaoBinhChon() {
        return soSaoBinhChon;
    }

    public void setSoSaoBinhChon(int soSaoBinhChon) {
        this.soSaoBinhChon = soSaoBinhChon;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public CongAn(String ten, String capBac, String noiCongTac, String quocGia, int soSaoBinhChon, int hinhAnh) {
        this.ten = ten;
        this.capBac = capBac;
        this.quocGia = quocGia;
        this.soSaoBinhChon = soSaoBinhChon;
        this.hinhAnh = hinhAnh;
    }
}
