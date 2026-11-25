package academia;

import java.util.ArrayList;

public class Spinning extends Atividade implements ControladorPresenca{
    private int quantidadeBicicletas;
    private ArrayList<String> presentes;
    
    public Spinning(String nome, int duracaoAula, int quantidadeMaximaParticipantes, double valorMensal, StatusAtividade status, int quantidadeBicicletas) {
        super(nome, duracaoAula, quantidadeMaximaParticipantes, valorMensal, status);
        this.quantidadeBicicletas = quantidadeBicicletas;
        this.presentes = new ArrayList<String>();
    }
    
    public int getQuantidadeBicicletas() {
        return quantidadeBicicletas;
    }

    public void setQuantidadeBicicletas(int quantidadeBicicletas) {
        this.quantidadeBicicletas = quantidadeBicicletas;
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
        IO.println("Quantidade de bicicletas: " + quantidadeBicicletas);
    }

    @Override
    public boolean atividadeColetiva(){
        return false;
    }
    
    @Override
    public void registrarPresenca(String nomeParticipante) {
        presentes.add(nomeParticipante);
    }
}
