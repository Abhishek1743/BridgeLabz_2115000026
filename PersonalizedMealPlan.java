// Interface representing a Meal Plan
interface MealPlan{
    String getMealDetails();
}

// Specific meal plan implementations
class VegetarianMeal implements MealPlan{
    public String getMealDetails(){
        return "Vegetarian Meal: Grilled vegetables with quinoa.";
    }
}

class VeganMeal implements MealPlan{
    public String getMealDetails(){
        return "Vegan Meal: Lentil soup with avocado toast.";
    }
}

class KetoMeal implements MealPlan{
    public String getMealDetails(){
        return "Keto Meal: Grilled salmon with buttered broccoli.";
    }
}

class HighProteinMeal implements MealPlan{
    public String getMealDetails(){
        return "High Protein Meal: Chicken breast with brown rice.";
    }
}

// Generic class to manage meal plans
class Meal<T extends MealPlan>{
    private T meal;
    
    public Meal(T meal){
        this.meal = meal;
    }
    
    public T getMeal(){
        return meal;
    }
}

// Utility class with a generic method for meal validation
class MealPlanGenerator{
    public static <T extends MealPlan> void generateMealPlan(Meal<T> meal){
        System.out.println("Generated Meal Plan: " + meal.getMeal().getMealDetails());
    }
}

// Main class
public class PersonalizedMealPlan{
    public static void main(String[] args){
        Meal<VegetarianMeal> vegetarianMeal = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());
        Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal());
        Meal<HighProteinMeal> highProteinMeal = new Meal<>(new HighProteinMeal());
        
        // Generate meal plans
        MealPlanGenerator.generateMealPlan(vegetarianMeal);
        MealPlanGenerator.generateMealPlan(veganMeal);
        MealPlanGenerator.generateMealPlan(ketoMeal);
        MealPlanGenerator.generateMealPlan(highProteinMeal);
    }
}
