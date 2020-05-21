package lab.assignment.afterrefactoring;

public class CapuccinoMaker extends CoffeeMakerTemplate {

   @Override
   public void addIngredients() {
      System.out.println("Add hot milk");
      System.out.println("Add cinnamon");

   }

   @Override
   public void finalTouch() {
      System.out.println("Top with milk foam");

   }

}