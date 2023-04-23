import java.util.Scanner;

class rClass{
        // task 1 n is an int where n is the number of people on a room >=1
        //        each person n shakes hands once with every other person
        //         h(n) = total handshakes 
        //          ex: h(1) = 0 ,  h(2) = 1
        
        // I will solve it using fibonacci series //h(n) = h(n-1) + h(n-2)
        //failed
        //h(n) = (n-1) + h(n-1)

        public static int fibonacciHandshake(int total){            
            
            if(total <= 1){
                return 0;
            }
            else{
                return (total - 1) + fibonacciHandshake(total -1);     
            }
        }

        public static int combinationsR(int n, int r){  
            if (r == 0 || r == n) {
                return 1;
            } else {
                return combinationsR(n-1, r-1) + combinationsR(n-1, r);
            }
            // If r is less than n, then the number of ways of choosing r different things from a set of n things is equal
            // to the sum of the number of ways of choosing r-1 different things from a set of n-1 things,
            // and the number of ways of choosing r different things from a set of n-1 things.
        }

        public static void main(String[] args) {

            //TASK1 START
            Scanner scan = new Scanner(System.in);

                try{ // just in case
                    System.out.println("How many people are in the room:");
                    int n = scan.nextInt();
                    int h = fibonacciHandshake(n);
                    System.out.println("If everyone shakes hands once, there will be " + h + " handshakes.");
                }
                catch(Exception e){         
                    e.printStackTrace();
                }
            
            // TASK1 DONE


            //TASK2 START
            Scanner scan2 = new Scanner(System.in);
                try{ // just in case
                    System.out.println("Enter value for n, should be greater than r:"); 
                    int n = scan2.nextInt();
                    System.out.println("Enter value for h:"); 
                    int h = scan2.nextInt();

                    int totalC = combinationsR(n, h);

                    System.out.println("There are " + totalC + " possible combinations");
                }
                catch(Exception e){         
                    e.printStackTrace();
                }
            scan2.close();
            //TASK2 DONE
        }
}