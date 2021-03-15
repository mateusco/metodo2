public class metodo {
    public static void main(String[] args) {
        int idade = 16;
        String nacionalidade = "brasileiro";
        String disponibilidade = "Tarde";

        if (cadastro(idade, nacionalidade, disponibilidade)) {
            System.out.println("Cadastro Aprovado");
        } else {
            System.out.println("Cadastro recusado");
        }

    }

    private static  boolean cadastro(int idade, String nacionalidade, String disponibilidade) {

        if (verificarIdade(idade)) {

            if (verificarDisponibilidade(disponibilidade)) {

                if (verificarNacionalidade(nacionalidade)) {
                    return true;

                }
            }
        }
        return false;
    }


    private static boolean verificarDisponibilidade(String disponibilidade) {
        if (disponibilidade != "Tarde") {
            System.out.println("Não possui disponibilidade");

            return false;
        } else {
            System.out.println("disponibilidade aprovada");

            return true;
        }
    }


    private static boolean verificarNacionalidade(String nacionalidade) {
        if (nacionalidade.equals("brasileiro")) {
            System.out.println(" é brasileiro");
            return true;
        } else {
            System.out.println("não é brasileiro");
            return false;
        }
    }

    private static boolean verificarIdade(int idade) {


        if (idade >= 18) {
            System.out.println(" É maior de idade");

            return true;
        } else {
            System.out.println("não é maior de idade");

            return false;
        }
    }

}


