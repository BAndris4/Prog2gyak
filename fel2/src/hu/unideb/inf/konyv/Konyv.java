package hu.unideb.inf.konyv;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Konyv {
    private String cim;
    private String szerzo;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy.MM.dd")
    private LocalDate kiadasDatuma;
    private int oldalszam;
    private String kiado;
    @JsonProperty("ISBN")
    private double ISBN;

    public Konyv() {
    }

    public Konyv(String cim, String szerzo, LocalDate kiadasDatuma, int oldalszam, String kiado, double ISBN) {
        this.cim = cim;
        this.szerzo = szerzo;
        this.kiadasDatuma = kiadasDatuma;
        this.oldalszam = oldalszam;
        this.kiado = kiado;
        this.ISBN = ISBN;
    }

    public String getCim() {
        return cim;
    }

    public String getSzerzo() {
        return szerzo;
    }

    public LocalDate getKiadasDatuma() {
        return kiadasDatuma;
    }

    public int getOldalszam() {
        return oldalszam;
    }

    public String getKiado() {
        return kiado;
    }

    public double getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Konyv{");
        sb.append("cim='").append(cim).append('\'');
        sb.append(", szerzo='").append(szerzo).append('\'');
        sb.append(", kiadasDatuma=").append(kiadasDatuma);
        sb.append(", oldalszam=").append(oldalszam);
        sb.append(", kiado='").append(kiado).append('\'');
        sb.append(", ISBN='").append(ISBN).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
