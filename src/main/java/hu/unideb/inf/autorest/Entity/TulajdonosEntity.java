package hu.unideb.inf.autorest.Entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "tulajdonosok")
public class TulajdonosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "nev")
    private String nev;
    @Column(name = "szemelyi")
    private String szemelyi;
    @Column(name = "szuldatum")
    private Date szuldatum;

    public TulajdonosEntity() {
    }


    public TulajdonosEntity(long id, String nev, String szemelyi, Date szuldatum) {
        this.id = id;
        this.nev = nev;
        this.szemelyi = szemelyi;
        this.szuldatum = szuldatum;
    }

    public TulajdonosEntity(String nev, String szemelyi, Date szuldatum) {
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
    public String toString() {
        return "TulajdonosEntity{" +
                "id=" + id +
                ", nev='" + nev + '\'' +
                ", szemelyi='" + szemelyi + '\'' +
                ", szuldatum=" + szuldatum +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TulajdonosEntity that = (TulajdonosEntity) o;
        return id == that.id && Objects.equals(nev, that.nev) && Objects.equals(szemelyi, that.szemelyi) && Objects.equals(szuldatum, that.szuldatum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nev, szemelyi, szuldatum);
    }
}
