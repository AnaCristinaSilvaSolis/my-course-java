package Temario.Collections.List.ArrayList.Ejercicios;

import java.util.ArrayList;
import java.util.List;

public class MainOne {
    public static void main(String[] args) {
        List<String> friends = new ArrayList<>();

        friends.add("Luis");
        friends.add("Angie");
        friends.add("David");
        friends.add("Carlos");
        friends.add("Paola");

        for (String friend : friends){
            System.out.println("Amigo: " + friend);
        }

        System.out.println(friends.get(0));
        System.out.println(friends.get(4));

    }
}
