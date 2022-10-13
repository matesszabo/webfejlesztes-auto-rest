package hu.unideb.inf.autorest.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "autok")
public class AutoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "marka")
    private String marka;

    @Column(name = "tipus")
    private String tipus;

    @Column(name = "rendszam")
    private String rendszam;

    @Column(name = "szin")
    private String szin;

    @Column(name = "teljesitmeny")
    private Integer teljesitmeny;

    @ManyToOne
    @JoinColumn(name = "tulajdonos", nullable = true)
    private TulajdonosEntity tulajdonos;

    public AutoEntity() {
    }

    public AutoEntity(long id, String marka, String tipus, String rendszam, String szin, Integer teljesitmeny) {
        this.id = id;
        this.marka = marka;
        this.tipus = tipus;
        this.rendszam = rendszam;
        this.szin = szin;
        this.teljesitmeny = teljesitmeny;
    }

    public AutoEntity(String marka, String tipus, String rendszam, String szin, Integer teljesitmeny) {
        this.marka = marka;
        this.tipus = tipus;
        this.rendszam = rendszam;
        this.szin = szin;
        this.teljesitmeny = teljesitmeny;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public Integer getTeljesitmeny() {
        return teljesitmeny;
    }

    public void setTeljesitmeny(Integer teljesitmeny) {
        this.teljesitmeny = teljesitmeny;
    }

    public TulajdonosEntity getTulajdonos() {
        return tulajdonos;
    }

    public void setTulajdonos(TulajdonosEntity tulajdonos) {
        this.tulajdonos = tulajdonos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AutoEntity that = (AutoEntity) o;
        return id == that.id && Objects.equals(marka, that.marka) && Objects.equals(tipus, that.tipus) && Objects.equals(rendszam, that.rendszam) && Objects.equals(szin, that.szin) && Objects.equals(teljesitmeny, that.teljesitmeny);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, marka, tipus, rendszam, szin, teljesitmeny);
    }

    @Override
    public String toString() {
        return "AutoEntity{" +
                "id=" + id +
                ", marka='" + marka + '\'' +
                ", tipus='" + tipus + '\'' +
                ", rendszam='" + rendszam + '\'' +
                ", szin='" + szin + '\'' +
                ", teljesitmeny=" + teljesitmeny +
                '}';
    }
}
