    import java.util.Scanner;

    public class Vacation {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int number = Integer.parseInt(scanner.nextLine());
            String type = scanner.nextLine();
            String day = scanner.nextLine();

            double price = 0;
            double totalPrice = 0;
            if (type.equals("Students") && day.equals("Friday")){
                price = 8.45;
            }else if (type.equals("Students") && day.equals("Saturday")){
                price = 9.80;
            }else if (type.equals("Students") && day.equals("Sunday")){
                price = 10.46;
            }else if (type.equals("Business") && day.equals("Friday")){
                price = 10.90;
            }else if (type.equals("Business") && day.equals("Saturday")){
                price = 15.60;
            }else if (type.equals("Business") && day.equals("Sunday")){
                price = 16;
            }else if (type.equals("Regular") && day.equals("Friday")){
                price = 15;
            }else if (type.equals("Regular") && day.equals("Saturday")){
                price = 20;
            }else if (type.equals("Regular") && day.equals("Sunday")){
                price = 22.50;
            }
            totalPrice = price * number;

            if (type.equals("Students") && number>=30) totalPrice = totalPrice * 0.85;{

            }if (type.equals("Business") && number>=100)totalPrice = totalPrice * 0.90;{

            }if (type.equals("Regular") && number>=10 && number<=20) totalPrice = totalPrice * 0.95;{

            }
            System.out.printf("Total price: %.2f", totalPrice);
        }
    }
//    int countPeople = Integer.parseInt(scanner.nextLine()); //броят на хората
//        String groupType = scanner.nextLine(); //"Students", "Business", "Regular"
//        String dayOfWeek = scanner.nextLine(); //"Friday", "Saturday", "Sunday"
//
//
//        //крайна цена = броя на хората * цена за 1 нощувка (таблица)
//        double pricePerNight = 0;
//        switch (dayOfWeek) {
//            case "Friday":
//                //проверка за типа на групата
//                switch (groupType) {
//                    case "Students":
//                        pricePerNight = 8.45;
//                        break;
//                    case "Business":
//                        pricePerNight = 10.90;
//                        break;
//                    case "Regular":
//                        pricePerNight = 15;
//                        break;
//                }
//                break;
//            case "Saturday":
//                //проверка за типа на групата
//                switch (groupType) {
//                    case "Students":
//                        pricePerNight = 9.80;
//                        break;
//                    case "Business":
//                        pricePerNight = 15.60;
//                        break;
//                    case "Regular":
//                        pricePerNight = 20;
//                        break;
//                }
//                break;
//            case "Sunday":
//                //проверка за типа на групата
//                switch (groupType) {
//                    case "Students":
//                        pricePerNight = 10.46;
//                        break;
//                    case "Business":
//                        pricePerNight = 16;
//                        break;
//                    case "Regular":
//                        pricePerNight = 22.50;
//                        break;
//                }
//                break;
//        }
//
//        double totalPrice = pricePerNight * countPeople;
//
//        //ОТСТЪПКИ
//        //•   Students – if the group is bigger than or equal to 30 people you should reduce the total price by 15%
//        if (groupType.equals("Students") && countPeople >= 30) {
//            totalPrice = totalPrice - 0.15 * totalPrice; //0.85 * totalPrice;   or  totalPrice *= 0.85
//        }
//        //•   Business – if the group is bigger than or equal to 100 people 10 of them can stay for free.
//        else if (groupType.equals("Business") && countPeople >= 100) {
//            totalPrice = totalPrice - 10 * pricePerNight;
//        }
//        //•   Regular – if the group is bigger than or equal 10 and less than or equal to 20 reduce the total price by 5%
//        else if (groupType.equals("Regular") && countPeople >= 10 && countPeople <= 20) {
//            totalPrice = totalPrice - 0.05 * totalPrice; //0.95 * totalPrice;  or totalPrice *= 0.95
//        }
//
//        System.out.printf("Total price: %.2f", totalPrice);
//    }
//}