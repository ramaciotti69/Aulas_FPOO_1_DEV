/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoobjetos.atividade;

/**
 *
 * @author Aluno
 */
public enum EnumTipoPost {
    NOTICIA("Notícia"), 
    ANUNCIO("Anúncio"),  
    MUSICA("Música"),
    ENTRETENIMENTO("Entretenimento"), 
    COZINHA("Cozinha");
    
    private String tipoPost;
    
    private EnumTipoPost(String tipoPost) {
        this.tipoPost = tipoPost;
    }
}
