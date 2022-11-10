package hu.unideb.inf.autorest.Dto;

import java.util.Date;
import java.util.Objects;

public class TulajdonosDto {

    private long id;
    private String nev;
    private String szemelyi;
    private Date szuldatum;

    public TulajdonosDto() {
    }

    public TulajdonosDto(String nev, String szemelyi, Date szuldatum) {
        this.nev = nev;
        this.szemelyi = szemelyi;
        this.szuldatum = szuldatum;
    }

    public TulajdonosDto(long id, String nev, String szemelyi, Date szuldatum) {
        this.id = id;
        this.nev = nev;
        this.szemelyi = szemelyi;
        this.szuldatum = szuldatum;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getSzemelyi() {
        return szemelyi;
    }

    public void setSzemelyi(String szemelyi) {
        this.szemelyi = szemelyi;
    }

    public Date getSzuldatum() {
        return szuldatum;
    }

    public void setSzuldatum(Date szuldatum) {
        this.szuldatum = szuldatum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TulajdonosDto that = (TulajdonosDto) o;
        return id == that.id && Objects.equals(nev, that.nev) && Objects.equals(szemelyi, that.szemelyi) && Objects.equals(szuldatum, that.szuldatum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nev, szemelyi, szuldatum);
    }

    @Override
    public String toString() {
        return "TulajdonosDto{" +
                "id=" + id +
                ", nev='" + nev + '\'' +
                ", szemelyi='" + szemelyi + '\'' +
                ", szuldatum=" + szuldatum +
                '}';
    }
}
