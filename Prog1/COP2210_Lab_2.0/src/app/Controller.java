package app;

public class Controller {


    public static void main(String[] args){

        yourInfoHeader();

        int minutes = 33;
        int hours = 15;
        int days = 4;

        int secondsInMinutes = minutes * 60;
        int secondsInHour = hours * 3600;
        int secondsInDays = days * 3600*24;
        int totalSeconds = secondsInDays + secondsInHour + secondsInMinutes;

        printStepHeader(3);

        System.out.printf("Number of seconds in %-1s days , %-3s hours and %-3s minutes is %-13s",days, hours,minutes, totalSeconds);

        printStepHeader(4);

        double initialInvestment = 125000;

        double year1InterestRate = 0.05;
        double year2InterestRate = 0.09;
        double year3InterestRate = -0.035;
        double year4InterestRate = 0.07;

        double year1InterestValue = initialInvestment * year1InterestRate + initialInvestment;
        double year2InterestValue = year1InterestValue  * year2InterestRate + year1InterestValue;
        double year3InterestValue = year2InterestValue * year3InterestRate + year2InterestValue;
        double year4InterestValue = year3InterestValue  * year4InterestRate + year3InterestValue;

        double totalInterestEarned = year4InterestValue - initialInvestment;

        System.out.println("USING PRINTLN");
        System.out.println("initialInvestment:\t\t "  + initialInvestment);
        System.out.println("year1InvestmentValue:\t "  + year1InterestValue);
        System.out.println("year2InvestmentValue:\t "  + year2InterestValue);
        System.out.println("year3InvestmentValue:\t "  + year3InterestValue);
        System.out.println("year4InvestmentValue:\t "  + year4InterestValue);
        System.out.println("totalInterestEarned:\t "  + totalInterestEarned);

        System.out.printf("\nUSING PRINTF with format -> right justified, 10 min places,2 decimal places\n");
        System.out.printf("initialInvestment: \t\t %10.2f\n", initialInvestment);
        System.out.printf("year1InvestmentValue: \t %10.2f\n", year1InterestValue);
        System.out.printf("year2InvestmentValue: \t %10.2f\n", year2InterestValue);
        System.out.printf("year3InvestmentValue: \t %10.2f\n", year3InterestValue);
        System.out.printf("year4InvestmentValue: \t %10.2f\n", year4InterestValue);
        System.out.printf("totalInterestEarned: \t %10.2f\n", totalInterestEarned);

        printStepHeader(5);

        double circleDiameter = 17.3543;
        double circleRadius = circleDiameter/2;
        double circleCircumference = 2*Math.PI*circleRadius; //2𝜋𝑟 where r is the radius
        double circleArea = Math.PI*Math.pow(circleRadius, 2) ; //𝜋𝑟^2

        System.out.printf("USING PRINTF with format -> left justified, 10 min places,4 decimal places\n");
        System.out.printf("circleDiameter:\t\t\t %-10.4f\n", circleDiameter);
        System.out.printf("circleRadius:\t\t\t %-10.4f\n", circleRadius);
        System.out.printf("circleCircumference:\t %-10.4f\n", circleCircumference);
        System.out.printf("circleArea:\t\t\t\t %-10.4f\n", circleArea);

        printStepHeader(6);

        double rectangleHeight = 19.4;
        double rectangleWidth = 34.7;

        double triangleHeight = 16.4;
        double triangleBase = 20.1;

        double rectanglePerimeter = (rectangleWidth + rectangleHeight)*2;
        double rectangleArea = rectangleHeight*rectangleWidth;

        double triangleHypotenuse = Math.sqrt(triangleBase*triangleBase+triangleHeight*triangleHeight);

        double trianglePerimeter = triangleHeight+triangleBase+triangleHypotenuse;
        double triangleArea = 0.5*(triangleHeight*triangleBase);

        double totalPerimeter = trianglePerimeter+rectanglePerimeter;
        double totalArea = triangleArea+rectangleArea;

        System.out.printf("USING PRINTF with format -> right justified, 8 min places,1 decimal places\n");
        System.out.printf("rectangleHeight:\t\t%8.1f\n",rectangleHeight);
        System.out.printf("rectangleWidth:\t\t\t%8.1f\n",rectangleWidth);
        System.out.printf("triangleHeight:\t\t\t%8.1f\n",triangleHeight);
        System.out.printf("rectanglePerimeter:\t\t%8.1f\n",rectanglePerimeter);
        System.out.printf("rectangleArea:\t\t\t%8.1f\n",rectangleArea);
        System.out.printf("triangleHypotenuse:\t\t%8.1f\n",triangleHypotenuse);
        System.out.printf("trianglePerimeter:\t\t%8.1f\n",trianglePerimeter);
        System.out.printf("triangleArea:\t\t\t%8.1f\n",triangleArea);
        System.out.printf("totalPerimeter:\t\t\t%8.1f\n",totalPerimeter);
        System.out.printf("totalArea:\t\t\t\t%8.1f\n",totalArea);

        printStepHeader(7);

        double airflow = 1.253;
        double x = 1.392;
        double y = 0.72;
        double z = 4.2932;

        double temp1 = Math.cos(Math.pow(airflow,3));
        double temp2 = 9.435739;   //
        double temp3 = 2*Math.sqrt(7*x*Math.pow(y,5.23)*z);
        double temp4 = 1.8*x*y*z;
        double temp5 = Math.pow(0.75,Math.pow(2,x*y*z));
        double temp6 = Math.sqrt(airflow+x);

        double boost = temp1*((temp2+temp3)/temp6)+temp4+temp5;

        System.out.printf("USING PRINTF with format -> left justified, 8 min places,6 decimal places\n");
        System.out.printf("airflow:\t\t\t\t%-8.6f\n",airflow);
        System.out.printf("x:\t\t\t\t\t\t%-8.6f\n",x);
        System.out.printf("y:\t\t\t\t\t\t%-8.6f\n",y);
        System.out.printf("z:\t\t\t\t\t\t%-8.6f\n",z);
        System.out.printf("temp1:\t\t\t\t\t%-8.6f\n",temp1);
        System.out.printf("temp2:\t\t\t\t\t%-8.6f\n",temp2);
        System.out.printf("temp3:\t\t\t\t\t%-8.6f\n",temp3);
        System.out.printf("temp4:\t\t\t\t\t%-8.6f\n",temp4);
        System.out.printf("temp5:\t\t\t\t\t%-8.6f\n",temp5);
        System.out.printf("temp6:\t\t\t\t\t%-8.6f\n",temp6);
        System.out.printf("boost:\t\t\t\t\t%-8.6f\n",boost);

    }



    //----------------------------------------------------
    //beginning of yourInfoReader() method

    public static void yourInfoHeader() {

        System.out.println();
        System.out.println("===================================");
        System.out.println("PROGRAMMER: " + " ZAIDOWICZ LORENZO");
        System.out.println("PANTHER ID: " + " 6350603");
        System.out.println();
        System.out.println("CLASS: \t\t COP2210");
        System.out.println("SECTION: \t " + "U02");
        System.out.println("SEMESTER: \t " + "FALL");
        System.out.println("CLASSTIME \t " + "6:20-9:20");
        System.out.println();
        System.out.println("Assigments: " + " LAB 2");
        System.out.println();
        System.out.println("CERTIFICATION: \nI understand FIU's academic policies, and I certify");
        System.out.println("that this work is my own and that none of it is the");
        System.out.println("work of any other.");
        System.out.println("===================================");
        System.out.println();

    }//end yourInfoHeader

    //----------------------------------------------------
    // beginning of printStepHeader(int stepNumber) method

    public static void printStepHeader(int stepNumber){

        System.out.println();
        System.out.println();
        System.out.println("===================================");
        System.out.println("Step: " + stepNumber);
        System.out.println("===================================");

    }//end printStep Header

    //----------------------------------------------------

}// end Controller
