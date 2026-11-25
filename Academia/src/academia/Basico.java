package academia;

import java.util.ArrayList;

public class Basico extends Plano implements ControladorPresenca{
    private ArrayList<String> presentes;
    
    public Basico(String nome, double valorMensal, int quantidadeMaximaAtividades, StatusPlano status) {
        super(nome, valorMensal, quantidadeMaximaAtividades, status);
        this.presentes = new ArrayList<String>();
    }

    public ArrayList<String> getPresentes() {
        return presentes;
    }

    public void setPresentes(ArrayList<String> presentes) {
        this.presentes = presentes;
    }
    
    @Override
    public void exibirDetalhes() {
        IO.println("Nome: " + super.getNome());
        IO.println("Valor mensal: " + super.getValorMensal());
        IO.println("Quantidade máxima de atividades: " + super.getQuantidadeMaximaAtividades());
        IO.println("Status: " + super.getStatus());
        IO.println("Permite atividade coletiva: Não");
    }

    @Override
    public boolean permiteAtividadeColetiva() {
        return false;
    }
    
    @Override
    public void registrarPresenca(String nomeParticipante) {
        presentes.add(nomeParticipante);
    }
}
