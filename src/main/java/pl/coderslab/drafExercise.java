package pl.coderslab;
import java.util.*;

public class drafExercise {


    public static void main(String[] args) {
        String unsortedNames = "Jan,Katarzyna,Anna,Piotr,Monika,Adam,Iwona,Krzysztof,Barbara,Robert,Marta,Marek,Alicja,Wojciech,Ewa";
        String sortedNames = sortNames(unsortedNames);
        System.out.println("Posortowane imiona: " + sortedNames);
    }

    public static String sortNames(String unsortedNames) {

        String[] namesArray = unsortedNames.split(",");
        Arrays.sort(namesArray);
        String sortedNames = String.join(",", namesArray);
        return sortedNames;
    }
}