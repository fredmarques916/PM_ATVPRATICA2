package academia;

import static java.lang.System.in;
import java.util.ArrayList;
import java.util.Scanner;

public class Academia {
    public static Scanner scan = new Scanner(System.in);
    private static ArrayList<Atividade> atividades = new ArrayList<Atividade>();
    private static ArrayList<Plano> planos = new ArrayList<Plano>();
    
    public static void main(String[] args) {
        iniciar();
        
        int opcao = -1;
        
        do{
            opcao = exibirMenu();
            
            if (opcao == 1){
            
            }
            else if (opcao == 2){
                exibirAtividadesCadastradas();
            }
            else if (opcao == 3){
            
            }
            else if (opcao == 4){
            
            }
            else if (opcao == 5){
            
            }
            else if (opcao == 6){
            
            }
            else if (opcao == 7){
            
            }
            else if (opcao == 0){
                break;
            }
        }while(opcao != 0);
    }
    
    public static void iniciar(){
        Musculacao atv1 = new Musculacao("Musculação - Turma 1", 2, 5, 150.00, StatusAtividade.ATIVA, 9);
        Natacao atv2 = new Natacao("Natação - Turma 1", 1, 5, 250.00, StatusAtividade.ATIVA, 2);
        Spinning atv3 = new Spinning("Spinning - Turma 1", 1, 1, 100.00, StatusAtividade.ATIVA, 1);
        atividades.add(atv1);
        atividades.add(atv2);
        atividades.add(atv3);
        Basico pla1 = new Basico("Plano básico - 1", 250, 2, StatusPlano.ATIVO);
        Premium pla2 = new Premium("Plano premium - 1", 500, 3, StatusPlano.ATIVO);
        planos.add(pla1);
        planos.add(pla2);
    }
    
    public static int exibirMenu(){
        int opcao = -1;
        
        do{
            IO.println("Digite o número referente à ação desejada:");
            IO.println("1 -  Associar atividades a um plano");
            IO.println("2 -  Exibir todas as atividades cadastradas");
            IO.println("3 -  Exibir todos os planos cadastrados");
            IO.println("4 -  Exibir apenas planos ativos");
            IO.println("5 -  Emitir certificado");
            IO.println("6 -  Registrar presença em atividades");
            IO.println("7 -  Remover atividades inativas do sistema");
            IO.println("0 -  Sair");
            
            opcao = scan.nextInt();
            
            if(opcao < 0 || opcao > 7){
                IO.println("Digite uma opção válida!");
            }
        }while(opcao < 0 || opcao > 7);
        
        return opcao;
    }
    
    public static void exibirAtividadesCadastradas(){
        for (int i = 0; i < atividades.size(); i++)
        {
            atividades.get(i).exibirDetalhes();
        }
    }
}
