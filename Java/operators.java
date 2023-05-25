// Write a program using nested switch case which covers the following operators with expressions :
// a. Mathematical
// b. Logical
// c. Reational

import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the operator type (M for Mathematical, L for Logical, R for Relational): ");
        char operatorType = scanner.next().charAt(0);

        switch (operatorType) {
            case 'M':
            case 'm':
                System.out.print("Enter the mathematical operator (+, -, *, /): ");
                char mathOperator = scanner.next().charAt(0);

                System.out.print("Enter the first operand: ");
                double mathOperand1 = scanner.nextDouble();

                System.out.print("Enter the second operand: ");
                double mathOperand2 = scanner.nextDouble();

                double mathResult;

                switch (mathOperator) {
                    case '+':
                        mathResult = mathOperand1 + mathOperand2;
                        System.out.println("Result: " + mathResult);
                        break;
                    case '-':
                        mathResult = mathOperand1 - mathOperand2;
                        System.out.println("Result: " + mathResult);
                        break;
                    case '*':
                        mathResult = mathOperand1 * mathOperand2;
                        System.out.println("Result: " + mathResult);
                        break;
                    case '/':
                        if (mathOperand2 == 0) {
                            System.out.println("Error: Division by zero is not allowed.");
                        } else {
                            mathResult = mathOperand1 / mathOperand2;
                            System.out.println("Result: " + mathResult);
                        }
                        break;
                    default:
                        System.out.println("Error: Invalid mathematical operator.");
                        break;
                }
                break;

            case 'L':
            case 'l':
                System.out.print("Enter the logical operator (&&, ||): ");
                String logicalOperator = scanner.next();

                System.out.print("Enter the first operand (true or false): ");
                boolean logicalOperand1 = scanner.nextBoolean();

                System.out.print("Enter the second operand (true or false): ");
                boolean logicalOperand2 = scanner.nextBoolean();

                boolean logicalResult;

                switch (logicalOperator) {
                    case "&&":
                        logicalResult = logicalOperand1 && logicalOperand2;
                        System.out.println("Result: " + logicalResult);
                        break;
                    case "||":
                        logicalResult = logicalOperand1 || logicalOperand2;
                        System.out.println("Result: " + logicalResult);
                        break;
                    default:
                        System.out.println("Error: Invalid logical operator.");
                        break;
                }
                break;

            case 'R':
            case 'r':
                System.out.print("Enter the relational operator (<, >, <=, >=, ==, !=): ");
                String relationalOperator = scanner.next();

                System.out.print("Enter the first operand: ");
                double relationalOperand1 = scanner.nextDouble();

                System.out.print("Enter the second operand: ");
                double relationalOperand2 = scanner.nextDouble();

                boolean relationalResult;

                switch (relationalOperator) {
                    case "<":
                        relationalResult = relationalOperand1 < relationalOperand2;
                        System.out.println("Result: " + relationalResult);
                        break;
                    case ">":
                        relationalResult = relationalOperand1 > relationalOperand2;
                        System.out.println("Result: " + relationalResult);
                        break;
                    case "<=":
                        relationalResult = relationalOperand1 <= relationalOperand2;
                        System.out.println("Result: " + relationalResult);
                        break;
                    case ">=":
                        relationalResult = relationalOperand1 >= relationalOperand2;
                        System.out.println("Result: " + relationalResult);
                        break;
                    case "==":
                        relationalResult = relationalOperand1 == relationalOperand2;
                        System.out.println("Result: " + relationalResult);
                        break;
                    case "!=":
                        relationalResult = relationalOperand1 != relationalOperand2;
                        System.out.println("Result: " + relationalResult);
                        break;
                    default:
                        System.out.println("Error: Invalid relational operator.");
                        break;
                }
                break;

            default:
                System.out.println("Error: Invalid operator type.");
                break;
        }
    }
}

                       
