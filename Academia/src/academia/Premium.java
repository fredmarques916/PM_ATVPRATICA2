package academia;

public class Premium extends Plano{
    public Premium(String nome, double valorMensal, int quantidadeMaximaAtividades, StatusPlano status) {
        super(nome, valorMensal, quantidadeMaximaAtividades, status);
    }
    
    @Override
    public void exibirDetalhes() {
        IO.println("Nome: " + super.getNome());
        IO.println("Valor mensal: " + super.getValorMensal());
        IO.println("Quantidade máxima de atividades: " + super.getQuantidadeMaximaAtividades());
        IO.println("Status: " + super.getStatus());
        IO.println("Permite atividade coletiva: Sim");
    }

    @Override
    public boolean permiteAtividadeColetiva() {
        return true;
    }
}
