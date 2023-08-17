/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public class AtividadeEnum {

    enum MesesDoAno {
        JANEIRO, FEVEREIRO, MARCO, ABRIL, MAIO, JUNHO,
        JULHO, AGOSTO, SETEMBRO, OUTUBRO, NOVEMBRO, DEZEMBRO
    }

    enum Livros {
        FICCAO, NAO_FICCAO, ROMANCE, MISTERIO, FANTASIA
    }

    enum ProdutosCantina {
        SALGADOS, DOCES, BEBIDAS, SANDUICHES, FRUTAS, LANCHES, SOPAS, REFEICOES
    }

    enum RedesSociais {
        AMIZADE, FOTOS, NOTICIAS
    }

    public class ExemploEnumeracoes {

        public static void main(String[] args) {

            System.out.println("Meses do ano:");
            for (MesesDoAno mes : MesesDoAno.values()) {
                System.out.println(mes);
            }

            System.out.println("\nCategorias de livros:");
            for (Livros categoria : Livros.values()) {
                System.out.println(categoria);
            }

            System.out.println("\nCategorias de produtos para cantina:");
            for (ProdutosCantina categoria : ProdutosCantina.values()) {
                System.out.println(categoria);
            }

            System.out.println("\nCategorias de redes sociais:");
            for (RedesSociais categoria : RedesSociais.values()) {
                System.out.println(categoria);
            }
        }
    }
}
