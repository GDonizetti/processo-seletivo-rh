public class ProcessoSeletivo {
    public static void main(String[] args) {

    }
    static void selecaoDeCandidatos () {
    String[] candidatos = {"FELIPE" , "MARCIA" , "JULIA" , "PAULO" , "DANIELA", "MONICA" , "GUSTAVO" , "CARLOS" , "RODRIGO" };
    int candidatosSelecionados = 0;
    int candidatosAtual = 0;
    double salarioBase = 2000.0;
    while (candidatosSelecionados < 5) {
        String candidato = candidatos[candidatosAtual];
        double salarioPretendido = valorPretendido();

    System.out.println("O Candidato " + candidato + " Solicitou este valor de salario " + salarioPretendido );
    candidatosAtual++;
    if (salarioBase == valorPretendido) {
        System.out.println("O Candidato " + candidato + " foi selecionado para a vaga");
        candidatosAtual = 0;
    }
    }

        analisarCandidato(salarioPretendido);
    }
    static void analisarCandidato (double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if  (salarioBase == salarioPretendido) {
                System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
            }  else {
                 System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");


    }
  }

}
