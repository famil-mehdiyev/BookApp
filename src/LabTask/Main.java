package LabTask;

import java.sql.SQLOutput;
import java.util.NavigableMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Human human = new Human("Famil","Mehdiyev",30,"Baku");
        System.out.println(human.isStudent());

        Human human1 = new Human("Elvin","Huseynov",23,"Baku");
        System.out.println(human1.isStudent());

        Human human2 = new Human("Ferid","Rzazade",24,"Lenkeran");
        System.out.println(human2.isStudent());

        Human human3 = new Human("Elnur","Mirzeyev",25,"Shemkir");
        System.out.println(human3.isStudent());

        Human human4 = new Human("Tural","Imanov",22,"Fuzuli");
        System.out.println(human4.isStudent());


        Human human5 = new Human("Cavid","Cavidli",33,"Lenkeran");

        Human human6 = new Human("Elnur","Bedelli",23,"Zaqatala");

        Human human7 = new Human("Zeka","Zekali",30,"Baku");

        Human human8 = new Human("Elxan","Shirinov",19,"Baku");

        Human human9 = new Human("Elshad","Mahmudov",45,"Fuzuli");

        Human[] humans = {human,human1,human2,human3,human4,human5,human6,human7,human8,human9};
        getCountByCity(humans);
    }

public static void getCountByCity(Human[] humans){

    System.out.println("Sheher adini daxil edin");
        String cityName = new Scanner(System.in).nextLine();
        for(int i =0;i< humans.length;i++){
            if(humans[i].city.contains(cityName)&&humans[i].isStudent()){
                System.out.println(humans[i].name);
            }
        }
}
}
