import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ages = Integer.parseInt(scanner.nextLine());
        String bounder = "";

        if (ages>=0 && ages<=2){
            bounder = "baby";

        } else if (ages>=3 && ages<=13){
            bounder = "child";

        }else if (ages>=14 && ages<=19) {
            bounder = "teenager";

        }else if (ages>=20 && ages <= 65){
            bounder = "adult";

        }else if (ages>=66){
            bounder = "elder";
        }
        System.out.println(bounder);

    }
}
