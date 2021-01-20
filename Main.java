class Main {
  public static void main(String[] args) {
    //Step 1: ask user for firstname
    String forename = Keyboard.getText("Please enter youfirst name");

    String surname = Keyboard.getText("please enter your surname");  //Step 2: ask user for surname
    
    String mothersMaidenName = Keyboard.getText("please enter your mothers maiden name ");
    //Step 3: ask user for mothers maiden name
    String city = Keyboard.getText("what city were you born in");
    //Step 4: ask user for city in which they were born
    
    String firstNameTwo = forename.substring(0,2).toLowerCase();

    String surnameThree = surname.substring(0,3);

    String cityname = city.substring(0,2).toLowerCase();

    String mothername = mothersMaidenName.substring(0,3);
String starwarsname = surnameThree + firstNameTwo + " "  + mothername + cityname;
    
    //Step 5: starwarsname = first 3 letter of surname + first 2 letters of first name + " " + first 3 letters of motehrs maiden name + first 2 letters of town you **were born in

    //Step 6: display "your star wars name is " + starwarsname
    System.out.println("Your Star Wars name is " + starwarsname);
  }
}
