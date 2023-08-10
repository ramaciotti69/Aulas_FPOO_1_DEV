package estruturadecisao;

public class switchcase {
    public static void main(String[] args) {
        int temperatura = 15;
        
        switch (temperatura) {
            case 15:
                System.out.println("Frio");
                break;
            case 20:
                System.out.println("Mais ou menos");
                break;
            case 30:
                System.out.println("Calor");
                break;
                
            default:
                System.out.println("Temperatura nao identificada");
                break;
        }
              
        }
    }

