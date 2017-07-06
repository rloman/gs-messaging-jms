package hello;

import java.io.Serializable;

public class Feature implements Serializable {
   
   private static final long serialVersionUID = 4859870756839864942L;
   

   private int id;
   private String scenario;
   private String tests;

   public Feature() {
      
   }
   
   public Feature(int id, String scenario, String tests) {
      this.id = id;
      this.scenario = scenario;
      this.tests = tests;
   }

   
   public int getId() {
      return id;
   }
   
   public void setId(int id) {
      this.id = id;
   }
   
   public String getScenario() {
      return scenario;
   }
   
   public void setScenario(String scenario) {
      this.scenario = scenario;
   }
   
   public String getTests() {
      return tests;
   }
   
   public void setTests(String tests) {
      this.tests = tests;
   }

   @Override
   public String toString() {
      return "Feature [id=" + id + ", scenario=" + scenario + "]";
   }
   

}
