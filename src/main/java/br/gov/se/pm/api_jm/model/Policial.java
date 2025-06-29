
package br.gov.se.pm.api_jm.model;

import jakarta.persistence.*;

@Entity
public class Policial {
    @Id
    private String matricula;
    private String nomeCompleto;
    @Column(unique = true)
    private String cpf;
    private String endereco;
    private String grau;
    private String tipoSanguineo;

    
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public String getNomeCompleto() { return nomeCompleto; }
    public void setNomeCompleto(String nomeCompleto) { this.nomeCompleto = nomeCompleto; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public String getGrau() { return grau; }
    public void setGrau(String grau) { this.grau = grau; }
    public String getTipoSanguineo() { return tipoSanguineo; }
    public void setTipoSanguineo(String tipoSanguineo) { this.tipoSanguineo = tipoSanguineo; }
}
