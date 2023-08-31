/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoobjetos.atividade;

/**
 *
 * @author Aluno
 */
public class Post implements ClassificacaoPost{

    private String descricao;
    private String nome;
    private ClassificacaoPost estrelas;
    private EnumTipoPost tipoPost;

    public Post(String descricao, String nome, EnumTipoPost tipoPost) {
        this.descricao = descricao;
        this.nome = nome;
        this.tipoPost = tipoPost;
    }

    @Override
    public String toString() {
        return "Post{" + "descricao=" + descricao + ", nome=" + nome + ", estrelas=" + estrelas + ", tipoPost=" + tipoPost + '}';
    }

    public int classificarPost(int estrelas) {
        switch (estrelas) {
            case 1:
                System.out.println("Seu post é horrível");
                break;
            case 3:
                System.out.println("Seu post é mediano");
                break;
            case 5:
                System.out.println("Seu post é bom");
                break;
            default:
                break;

        }
        return estrelas;
    }
}
