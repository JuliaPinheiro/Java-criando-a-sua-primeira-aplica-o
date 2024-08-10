public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2012;
        String tipoPlano = "plus";
        boolean incluidoNoPlano = false;

        if (anoDeLancamento >= 2022 ) {
            System.out.println("Lançamento que clientes estão curtindo.");
        } else {
            System.out.println("filme retrô!");
        }

        if (tipoPlano.equals("plus") && incluidoNoPlano) {
            System.out.println("filme liberado");
        } else {
            System.out.println("deve pagar locação");
            }
        }
    }
