public class App {
    public static void main(String[] args){
        System.out.println("Digite uma data:");

        String inputDate = System.console().readLine();

        new Holyday().findHolyday(inputDate);

    }
}
