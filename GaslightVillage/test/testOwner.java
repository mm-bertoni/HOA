import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Helpers.Unit;


public class testOwner {

  Owner owner = new Owner("Margaret", Unit.Unit2);

  @Test
  public void testSetName() {
    owner.setName("Bertoni");
    Assertions.assertEquals("Bertoni", owner.getName());
  }


  @Test
  public void testSetEmail(){
    owner.setEmail("Bertoni@gmail.com");
    Assertions.assertEquals("Bertoni@gmail.com", owner.getEmail());
  }


  @Test
  public void testSetMonthlyFee(){
    owner.setMonthlyFee(300.00);
    Assertions.assertEquals(300.00, owner.getMonthlyFee());
  }


  @Test
  public void testAddAssessment(){
  }

  @Test
  public void testCalculateNewFee(){}




}
