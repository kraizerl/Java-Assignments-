import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.StringTokenizer;

import java.time.YearMonth; //used to check valid days in certain months


public class Controller {
    public static void main(String[] args) {
        boolean done = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date to parse (MM/DD/YYYY format): ");

        while (!done) { //rerun as long as the code has exceptions
            try {
                String userInput = scanner.nextLine();
                dateParse(userInput);  //method to parse the date and throws exceptions if invalid date

                done = true; // while loop success
            } catch (MonthException | DayException | YearException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                e.fillInStackTrace();  // better than nothing I guess
            }

        }

    }

    //using stringTokenizer to parse date and print in MONTH DAY, YEAR
    public static void dateParse(String dateString) throws MonthException, DayException, YearException {
        Scanner scanner = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(dateString, "/");   //how to use tokenizer

        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());
        int year = Integer.parseInt(st.nextToken());

        boolean validMonth = false;
        boolean validDay = false;
        boolean validYear = false;

        while (!validMonth || !validDay || !validYear) {
            // test invalid month
            if (!validMonth) {
                if (month < 1 || month > 12) {
                    System.out.println("Invalid month. Reenter a valid month:");
                    month = scanner.nextInt();
                } else {
                    validMonth = true;
                }
            }

            // test invalid day
            if (!validDay) {
                YearMonth yearMonth = YearMonth.of(year, month);
                int maxDays = yearMonth.lengthOfMonth();
                if (day < 1 || day > maxDays) {
                    System.out.println("Invalid day. Reenter a valid day: ");
                    day = scanner.nextInt();
                } else {
                    validDay = true;
                }
            }

            // test invalid year
            if (!validYear) {
                if (year > 2023) {
                    System.out.println("Invalid year. Reenter a valid yes ");

                    year = scanner.nextInt();
                } else {
                    validYear = true;
                }
            }
            // Create date object and format it as string
            LocalDate date = LocalDate.of(year, month, day);
            System.out.print("Parsed date: ");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
            String formattedDate = date.format(formatter);
            System.out.println(formattedDate);

        }
    }
}
