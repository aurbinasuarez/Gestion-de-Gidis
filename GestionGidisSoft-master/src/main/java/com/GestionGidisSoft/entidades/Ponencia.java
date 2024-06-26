package com.GestionGidisSoft.entidades;

import javax.persistence.*;


@Entity
@Table(name = "ponencias")
public class Ponencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idponencia")
    private Long idPonencia;

    private String titulo;

    private String autor;

    private Long idAutor;

    private String ambito;

    private String institucion;

    private String lugar;

    private String anio;

    private String mes;

    public Long getIdPonencia() {
        return idPonencia;
    }

    public void setIdPonencia(Long idPonencia) {
        this.idPonencia = idPonencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Long getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Long idAutor) {
        this.idAutor = idAutor;
    }

    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Ponencia(String titulo, String autor, Long idAutor, String ambito, String institucion, String lugar, String anio, String mes) {
        this.titulo = titulo;
        this.autor = autor;
        this.idAutor = idAutor;
        this.ambito = ambito;
        this.institucion = institucion;
        this.lugar = lugar;
        this.anio = anio;
        this.mes = mes;
    }

    public Ponencia() {
    }
}
