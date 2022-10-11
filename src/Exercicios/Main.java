package Exercicios;

public class Main {
    public static void main(String[] args) {

        //Calculadora
        System.out.println("----- Exercício Calculadora -----");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(5, 8);
        Calculadora.multiplicacao(8, 10);
        Calculadora.divisao(12, 15);

        //Mensagem
        System.out.println("----- Exercício Mensagem -----");
        Saudacao.obterMensagem(9);
        Saudacao.obterMensagem(14);
        Saudacao.obterMensagem(18);

        //Emprestimo
        System.out.println("----- Exercício Empréstimo -----");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000,5);

    }
}


