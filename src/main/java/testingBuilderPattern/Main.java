package testingBuilderPattern;

public class Main {

    public static void main(String[] args) {


        NutritionFacts cocaCola = new NutritionFacts.Builder(250, 4).calories(42).sodium(35).carbohydrate(10).build();
        NutritionFacts pepsiCola=new NutritionFacts.Builder(200,6).calories(32).carbohydrate(8).fat(2).build();
        System.out.println(cocaCola);
        System.out.println(pepsiCola);
    }

}
