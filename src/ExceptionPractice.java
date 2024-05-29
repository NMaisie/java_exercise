import java.util.*;

public class ExceptionPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> listOfNumber = new ArrayList<>();

        double sum = 0;
        double number = 0;

        while (number != -999) {
            try {
                System.out.print("Enter a double value (-999 to exit)");
                 number = sc.nextDouble();

                if(listOfNumber.contains(number)) {
                    throw new ArrayStoreException();
                }else if(number!= -999) {
                    listOfNumber.add(number);
                    sum += number;
                }
            } catch (InputMismatchException e) {
                System.out.println("That is not a valid double value");
                sc.next();  // Clear the invalid input
            } catch (ArrayStoreException e) {
                System.out.println("Duplicate value");
            } catch (Exception e) {
                System.out.println("Something unexpected occured");
            }
        }
            sc.close();

            if (listOfNumber.isEmpty()) {
                System.out.println("There no value to process");
            } else {
                System.out.println("\n"+listOfNumber);
                double avarage = sum / listOfNumber.size();
                System.out.printf("Avarage: %.2f\n", avarage);
                System.out.printf("Max: %.2f\n", Collections.max(listOfNumber));
                System.out.printf("Min: %.2f\n", Collections.min(listOfNumber));
            }
        }
    }

