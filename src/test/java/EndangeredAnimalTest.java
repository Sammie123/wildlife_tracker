import org.junit.*;
import static org.junit.Assert.*;
import org.sql2o.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class EndangeredAnimalTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test
  public void EndangeredAnimal_instantiatesCorrectly_false() {
    EndangeredAnimal testEndangeredAnimal = new EndangeredAnimal("Deer","","");
    assertEquals(true, testEndangeredAnimal instanceof EndangeredAnimal);
  }

  @Test
  public void getName_EndangeredAnimalInstantiatesWithName_Deer() {
    EndangeredAnimal testEndangeredAnimal = new EndangeredAnimal("Deer","","");
    assertEquals("Deer", testEndangeredAnimal.getName());
  }

  @Test
  public void equals_returnsTrueIfNameIsTheSame_false() {
    EndangeredAnimal firstEndangeredAnimal = new EndangeredAnimal("Deer","","");
    EndangeredAnimal anotherEndangeredAnimal = new EndangeredAnimal("Deer","","");
    assertTrue(firstEndangeredAnimal.equals(anotherEndangeredAnimal));
  }

  @Test
  public void find_returnsEndangeredAnimalWithSameId_secondEndangeredAnimal() {
    EndangeredAnimal firstEndangeredAnimal = new EndangeredAnimal("Deer","","");
    firstEndangeredAnimal.save();
    EndangeredAnimal secondEndangeredAnimal = new EndangeredAnimal("Black Bear","","");
    secondEndangeredAnimal.save();
    assertEquals(EndangeredAnimal.find(secondEndangeredAnimal.getId()), secondEndangeredAnimal);
  }

  @Test
  public void delete_deletesEndangeredAnimalFromDatabase_0() {
    EndangeredAnimal testEndangeredAnimal = new EndangeredAnimal("Deer","","");
    testEndangeredAnimal.save();
    testEndangeredAnimal.delete();
    assertEquals(0, EndangeredAnimal.all().size());
  }

  @Test
  public void find_returnsNullWhenNoEndangeredAnimalFound_null() {
    assertTrue(EndangeredAnimal.find(999) == null);
  }

}
