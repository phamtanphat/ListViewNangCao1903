package com.ptp.phamtanphat.listviewnangcao1903;

/**
 * Created by KhoaPhamPC on 18/4/2018.
 */

public class Monan {
    private int Id;
    private int Hinhanh;
    private String Tenmonan;
    private int Giamonan;

    public Monan(int id, int hinhanh, String tenmonan, int giamonan) {
        Id = id;
        Hinhanh = hinhanh;
        Tenmonan = tenmonan;
        Giamonan = giamonan;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getHinhanh() {
        return Hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        Hinhanh = hinhanh;
    }

    public String getTenmonan() {
        return Tenmonan;
    }

    public void setTenmonan(String tenmonan) {
        Tenmonan = tenmonan;
    }

    public int getGiamonan() {
        return Giamonan;
    }

    public void setGiamonan(int giamonan) {
        Giamonan = giamonan;
    }
}
