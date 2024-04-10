public class Main {
    public static void main(String[] args) {

        //Задача 1
        int clientOS = 0;
        if(clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задача 2
        int clientDeviceYear = 2015;
        if(clientOS == 0){
            if(clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else{
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else{
            if(clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        //Задача 3
        int year = 2021;
        if (year >= 1584){
            if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
                System.out.println(year + " год является високосным.");
            }else {
                System.out.println(year + " год не является високосным.");
            }
        } else {
            System.out.println("В " + year + " году не было понятия високосного года.");
        }

        //Задача 4
        int deliveryDistance = 95;
        if(deliveryDistance > 100){
            System.out.println("Доставки нет.");
        }
        else {
            int deliveryTime = 1;
            if(deliveryDistance > 20 && deliveryDistance <= 60){
                deliveryTime += 1;
            }else if(deliveryDistance > 60 && deliveryDistance <= 100){
                deliveryTime += 2;
            }
            System.out.println("Потребуется дней: " + deliveryTime);
        }

        // Задача 5
        int monthNumber = 12;
        if(monthNumber < 1 && monthNumber > 12){
            System.out.println("Такого месяца нет.");
        }else{
            switch (monthNumber){
                case 1:
                case 2:
                    System.out.println(monthNumber + " месяц принадлежит к сезону зима.");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println(monthNumber + " месяц принадлежит к сезону весна.");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println(monthNumber + " месяц принадлежит к сезону лето.");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println(monthNumber + " месяц принадлежит к сезону осень.");
                    break;
                case 12:
                    System.out.println(monthNumber + " месяц принадлежит к сезону зима.");
                    break;
                default:
                    System.out.println("Такого месяца нет.");
            }
        }
    }
}