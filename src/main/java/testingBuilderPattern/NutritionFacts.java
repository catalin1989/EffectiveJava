package testingBuilderPattern;
//The Builder pattern is used when you have a class with a lot of variables and you don't
//know which variables you will need in the constructor. Maybe you want to, maybe you want 5.
//You can use the Telescope pattern, but this is ok when you have a maximum of 4-5 variables.
//If you have 20 variables, it is better to use the Builder pattern
public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder{
        //required parameters
        private final int servingSize;
        private final int servings;
        //optional parameters, initialized to default values;
        private int calories=0;
        private int fat=0;
        private int sodium=0;
        private int carbohydrate=0;
        public Builder(int servingSize,int servings){
            this.servingSize=servingSize;
            this.servings=servings;
        }
        public Builder calories(int value){
            calories=value;
            return this;
        }
        public Builder fat(int value){
            fat=value;
            return this;
        }
        public Builder sodium(int value){
            sodium=value;
            return this;
        }
        public Builder carbohydrate(int value){
            carbohydrate=value;
            return this;
        }
        public NutritionFacts build(){
            return new NutritionFacts(this);
        }
    }
    private NutritionFacts(Builder builder){
        servingSize=builder.servingSize;
        servings=builder.servings;
        calories=builder.calories;
        fat= builder.fat;
        sodium=builder.sodium;
        carbohydrate= builder.carbohydrate;
    }

    @Override
    public String toString() {
        return "NutritionFacts{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }
}
