package hu.unideb.inf.autorest.Dto;

import java.io.Serializable;
import java.util.Objects;

public class AutoDto implements Serializable {

    private long id;
    private String marka;
    private String tipus;
    private String rendszam;
    private String szin;
    private Integer teljesitmeny;
    private TulajdonosDto tulajdonos;

    public AutoDto() {
    }

    public AutoDto(String marka, String tipus, String rendszam, String szin, Integer teljesitmeny, TulajdonosDto tulajdonos) {
        this.marka = marka;
        this.tipus = tipus;
        this.rendszam = rendszam;
        this.szin = szin;
        this.teljesitmeny = teljesitmeny;
        this.tulajdonos = tulajdonos;
    }

    public AutoDto(long id, String marka, String tipus, String rendszam, String szin, Integer teljesitmeny, TulajdonosDto tulajdonos) {
        this.id = id;
        this.marka = marka;
        this.tipus = tipus;
        this.rendszam = rendszam;
        this.szin = szin;
        this.teljesitmeny = teljesitmeny;
        this.tulajdonos = tulajdonos;
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

    public TulajdonosDto getTulajdonos() {
        return tulajdonos;
    }

    public void setTulajdonos(TulajdonosDto tulajdonos) {
        this.tulajdonos = tulajdonos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AutoDto autoDto = (AutoDto) o;
        return id == autoDto.id && Objects.equals(marka, autoDto.marka) && Objects.equals(tipus, autoDto.tipus) && Objects.equals(rendszam, autoDto.rendszam) && Objects.equals(szin, autoDto.szin) && Objects.equals(teljesitmeny, autoDto.teljesitmeny) && Objects.equals(tulajdonos, autoDto.tulajdonos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, marka, tipus, rendszam, szin, teljesitmeny, tulajdonos);
    }

    @Override
    public String toString() {
        return "AutoDto{" +
                "id=" + id +
                ", marka='" + marka + '\'' +
                ", tipus='" + tipus + '\'' +
                ", rendszam='" + rendszam + '\'' +
                ", szin='" + szin + '\'' +
                ", teljesitmeny=" + teljesitmeny +
                ", tulajdonos=" + tulajdonos +
                '}';
    }
}
