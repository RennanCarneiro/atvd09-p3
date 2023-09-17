package atvd09.questao01;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import atvd09.questao01.Funcionario;

public class Main {
    public static void main(String[] args) {
         // Crie uma lista de objetos Funcionario
        List<Funcionario> listaFuncionarios = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
         // Usando um loop para criar e adicionar objetos Funcionario à lista
         for (int i = 1; i <= 2; i++) { 
            Funcionario funcionario = new Funcionario("Funcionario " + sc.next(), sc.nextInt(),sc.nextFloat()); 
            listaFuncionarios.add(funcionario);
        }

         // Utilize um loop for-each para verificar e exibir funcionários 
         for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario.getSalarioAnual() > 50000 && funcionario.getIdade() < 30) {
                System.out.println("Nome do Funcionário: " + funcionario.getNome());
            }
        }
    }
}
