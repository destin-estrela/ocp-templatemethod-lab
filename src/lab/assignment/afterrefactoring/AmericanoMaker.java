package lab.assignment.afterrefactoring;

public class AmericanoMaker extends CoffeeMakerTemplate {

   @Override
   public void addIngredients() {
      System.out.println("Add more hot water");
   }

   @Override
   public void finalTouch() {
      System.out.println("Add sugar and cream");
   }

}