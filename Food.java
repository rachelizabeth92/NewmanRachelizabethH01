public class Food extends Item
{  
  //
  private int ;
  //Color of Flower
  private String colour;
   /**
   * Method to get the edibility
   * @return the edibility
   */
  public String getEdible()
  {
    return isEdible;
  }
    /**
   * Method to get the colour of the flower
   * @return the colour of the flower
   */
  public String getColour()
  {
    return colour;
  }
  /**
   * constructor to initialize the isEdible
   * @param edible
   */
  public void setEdible (String edible)
  {
    isEdible = "Not edible";
  }
  /**
   * constructor to initialize the colour
   * @param colour
   */
  public void setColour (String colour)
  {
    colour = "Purple";
  }
}