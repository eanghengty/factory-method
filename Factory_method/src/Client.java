import car.phea.java.*;
import house.phea.java.*;
import land.phea.java.CommercialCreator;
import land.phea.java.Land;
import land.phea.java.LandCreator;
import land.phea.java.ResidentialCreator;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        menu();
        String apartment= printHouse(new ApartmentCreator());
        String condo=printHouse(new CondoCreator());
        ArrayList<String> list= new ArrayList<>();

        list.add(condo);
        list.add(apartment);
        list.add(printCar(new FamilyCarCreator()));
        list.add(printCar(new SportCarCreator()));
        list.add(printLand(new CommercialCreator()));
        list.add(printLand(new ResidentialCreator()));

        ArrayList<String>rentList = new ArrayList<>();

        while(true){
            System.out.println("=====> Menu:");
            System.out.println("1. add rent");
            System.out.println("2. display rent");
            System.out.println("3. exit");
            System.out.print("input valid choice: ");

            int choice = scanner.nextInt();
            if(choice==3){
                    break;
            }
            else if(choice==1){
                menu();
                    int choice2=scanner.nextInt();
                    if (choice2 == 1) {
                        rentList.add(list.get(0));
                    } else if (choice2 == 2) {
                        rentList.add(list.get(1));
                    } else if (choice2 == 3) {
                        rentList.add(list.get(2));
                    } else if (choice2 == 4) {
                        rentList.add(list.get(3));
                    } else if (choice2 == 5) {
                        rentList.add(list.get(4));
                    } else if (choice2 == 6) {
                        rentList.add(list.get(5));

                    }
            }
            else if(choice==2){
                System.out.println("=====>show rent list:");
                System.out.println(rentList);
            }
        }

    }
    public static String printHouse(HouseCreator houseCreator){
        House house = houseCreator.getHouseInfo();
        System.out.println(house.getHouseInfo());
        return house.getHouseInfo();
    }
    public static String printCar(CarCreator carCreator){
        Car car= carCreator.getCarInfo();
        System.out.println(car.getCarInfo());

        return car.getCarInfo();
    }
    public static String printLand(LandCreator landCreator){
        Land land=landCreator.getLandInfo();
        System.out.println(land.getLandInfo());

        return land.getLandInfo();
    }
    public static void menu(){
        System.out.println("=====> All Products:");
        System.out.println("+House Product:");
        System.out.print("1.");
        printHouse(new CondoCreator());
        System.out.print("2.");
        printHouse(new ApartmentCreator());
        System.out.println("+Car Product:");
        System.out.print("3.");
        printCar(new FamilyCarCreator());
        System.out.print("4.");
        printCar(new SportCarCreator());
        System.out.println("+Land Product");
        System.out.print("5.");
        printLand(new CommercialCreator());
        System.out.print("6.");
        printLand(new ResidentialCreator());

    }


}
