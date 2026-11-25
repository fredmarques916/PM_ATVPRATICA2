package academia;

import java.util.ArrayList;

public class Natacao extends Atividade implements Certificavel, ControladorPresenca{
    private int profundidadePiscina;
    private ArrayList<String> presentes;
    
    public Natacao(String nome, int duracaoAula, int quantidadeMaximaParticipantes, double valorMensal, StatusAtividade status, int profundidadePiscina) {
        super(nome, duracaoAula, quantidadeMaximaParticipantes, valorMensal, status);
        this.profundidadePiscina = profundidadePiscina;
        this.presentes = new ArrayList<String>();
    }
    
    public int getProfundidadePiscina() {
        return profundidadePiscina;
    }

    public void setProfundidadePiscina(int profundidadePiscina) {
        this.profundidadePiscina = profundidadePiscina;
    }
    
    public ArrayList<String> getPresentes() {
        return presentes;
    }

    public void setPresentes(ArrayList<String> presentes) {
        this.presentes = presentes;
    }
    
    @Override
    public void exibirDetalhes(){
        IO.println("Nome: " + super.getNome());
        IO.println("Duração da aula: " + super.getDuracaoAula());
        IO.println("Quantidade máxima de participantes: " + super.getQuantidadeMaximaParticipantes());
        IO.println("Valor mensal: " + super.getValorMensal());
        IO.println("Status: " + super.getStatus());
        IO.println("Profundidade da piscina: " + profundidadePiscina + " metros");
    }

    @Override
    public boolean atividadeColetiva(){
        return true;
    }
    
    @Override
    public void emitirCertificado(String nomeParticipante){
        IO.println("CERTIFICADO DE NATAÇÃO");
        IO.println("Participante: " + nomeParticipante);
    }

    @Override
    public void registrarPresenca(String nomeParticipante) {
        presentes.add(nomeParticipante);
    }
}
