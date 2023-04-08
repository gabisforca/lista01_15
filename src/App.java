import java.util.Scanner;
class Main {
  public static void main(String[] args){
    //passo 1:variavel
    double horastrabalhadas;
    double valorporhoras;
    double salario;
    double salarioliquido;
    double IR;
    double INSS;
    double sindicato;

    //passo 2: entrada de dados 
    Scanner teclado = new Scanner(System.in);
    System.out.println("Quantas horas você trabalha por mês?");
    horastrabalhadas = teclado.nextDouble();
    System.out.println("Qual a valor da hora?");
    valorporhoras = teclado.nextDouble();
    
    // passo 3: calcular salario
    salario = valorporhoras * horastrabalhadas;
    salarioliquido = salario * 0.76;
    IR = salario * 0.11;
    INSS = salario * 0.08;
    sindicato = salario * 0.05;
    // passo 4: exibir salario 
    System.out.println("Seu salário bruto é R$" + salario);
    System.out.println("O desconto do imposto de renda é R$" + IR);
    System.out.println("O desconto do INSS é R$" + INSS);
    System.out.println("O desconto do sindicato é R$" + sindicato);
    System.out.println("Seu salário liquido é R$" + salarioliquido);
    
  }
}