public class Day2{

    // enum for the days of the week
    public enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY};
    // StringBuilder for the output
    private StringBuilder output = new StringBuilder();
    // Wrapper class [Automatic Boxing and Unboxing]
    Integer first = new Integer(1);
    int second = 1 + first;
    Integer third = first + second;
    // String array
    String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    // String array with enum
    Day[] days2 = {Day.SUNDAY, Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY, Day.SATURDAY};
    // int array
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    // Constructor 1 - takes a Day enum
    public Day2(Day day){
        output.append("The day is: " + day);
    }
    // Constructor 2 - no parameter and uses this keyword to call the first constructor
    public Day2(){
        this(Day.MONDAY);
    }

    // main method
    public static void main(String[] args){
        // Create a new Day2 object
        Day2 day2 = new Day2();
        Day2 day3 = new Day2(Day.TUESDAY);
        // Print the output
        System.out.println(day2.output);
        System.out.println(day3.output);
    }
}