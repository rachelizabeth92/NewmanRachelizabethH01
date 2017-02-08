public class Food extends Item
{  
  //nutritional value
  private int nutrition;
  //Color of Flower
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
    nutrition = 1;
  }
  /**
   * constructor to initialize the quantity
   * @param quantity
   */
  public void setQuantity (int quantity)
  {
    if(quantity>=0)
    {
      this.quantity = 1;
    }
    else
    {
      this.quantity = +1;
    }
  }
}
