package academia;

public class Musculacao extends Atividade {
    private int quantidadeAparelhos;

    public Musculacao(String nome, int duracaoAula, int quantidadeMaximaParticipantes, double valorMensal, StatusAtividade status, int quantidadeAparelhos) {
        super(nome, duracaoAula, quantidadeMaximaParticipantes, valorMensal, status);
        this.quantidadeAparelhos = quantidadeAparelhos;
    }
    
    public void Musculacao(int quantidadeAparelhos){
        this.quantidadeAparelhos = quantidadeAparelhos;
    }
    
    public int getQuantidadeAparelhos() {
        return quantidadeAparelhos;
    }
    
    public void setQuantidadeAparelhos(int quantidadeAparelhos) {
        this.quantidadeAparelhos = quantidadeAparelhos;
    }
    
    @Override
    public void exibirDetalhes(){
        IO.println("Nome: " + super.getNome());
        IO.println("Duração da aula: " + super.getDuracaoAula());
        IO.println("Quantidade máxima de participantes: " + super.getQuantidadeMaximaParticipantes());
        IO.println("Valor mensal: " + super.getValorMensal());
        IO.println("Status: " + super.getStatus());
        IO.println("Quantidade de aparelhos: " + quantidadeAparelhos);
    }

    @Override
    public boolean atividadeColetiva(){
        return true;
    }
}
