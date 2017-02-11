public class Food extends Item
{  
  //nutritional value
  private int nutrition;
  //amount of food
  private int quantity;
   /**
   * Method to get the nutritional value
   * @return the nutrition
   */
  public int getNutrition()
  {
    return nutrition;
  }
    /**
   * Method to get the quantity of Food
   * @return the quantity
   */
  public int getQuantity()
  {
    return quantity;
  }
  /**
   * constructor to initialize nutrition
   * @param nutrition
   */
  public void setNutrition (int nutrition)
  {
    this.nutrition = nutrition;
  }
  /**
   * constructor to initialize the quantity
   * @param quantity
   */
  public void setQuantity (int quantity)
  {
    this.quantity = quantity;
  }
}
