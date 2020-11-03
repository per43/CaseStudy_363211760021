public class EXchangeCurrencyApp {

    public static void main(String[] args) {
        ExchangeAP ex = new ExchangeAP();

        // test conection with THB
        if (ex.getConnection("")) {
            System.out.println(ex.getResult());


        }





    }


}
