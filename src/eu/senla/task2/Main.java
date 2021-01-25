package eu.senla.task2;

import java.util.Scanner;

    public class Main {

        public static void main(String [] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("The rainbow have a 7 numbers of colors: up 1 to 7. Also ");
            System.out.println("the rainbow may have a mixed colors: 1+2, 4+2, etc");
            System.out.println("Enter digits up 1 to 7 or double digits 37, 45, etc");


            // new array for colors
            String [] colours = new String[7];
            colours[0] ="red";
            colours[1] ="orange";
            colours[2] ="yellow";
            colours[3] ="green";
            colours[4] ="blue";
            colours[5] ="indigo";
            colours[6] ="violet";


            int[] arrayOfColours = new int[7];

            System.out.println("Enter first color:");
            arrayOfColours[0] = input.nextInt();

            System.out.println("Enter second color:");
            arrayOfColours[1] = input.nextInt();

            System.out.println("Enter third color:");
            arrayOfColours[2] = input.nextInt();

            System.out.println("Enter fourth color:");
            arrayOfColours[3] = input.nextInt();

            System.out.println("Enter fifth color:");
            arrayOfColours[4] = input.nextInt();

            System.out.println("Enter sixth color:");
            arrayOfColours[5] = input.nextInt();

            System.out.println("Enter seventh color:");
            arrayOfColours[6] = input.nextInt();

            System.out.println("");
            System.out.println("The color palette of our rainbow is: ");
            System.out.println("");
            int indexArrayOfColours = 0;


            while (indexArrayOfColours < arrayOfColours.length) {
                switch ( arrayOfColours[indexArrayOfColours] ){
                    case 1:
                        System.out.println(colours[0]);
                        break;
                    case 2:
                        System.out.println(colours[1]);
                        break;
                    case 3:
                        System.out.println(colours[2]);
                        break;
                    case 4:
                        System.out.println(colours[3]);
                        break;
                    case 5:
                        System.out.println(colours[4]);
                        break;
                    case 6:
                        System.out.println(colours[5]);
                        break;
                    case 7:
                        System.out.println(colours[6]);
                        break;
                    case 11:
                        System.out.println(colours[0] + "/" + colours[0]);
                        break;
                    case 12, 21:
                        System.out.println(colours[0] + "/" + colours[1]);
                        break;
                    case 13, 31:
                        System.out.println(colours[0] + "/" + colours[2]);
                        break;
                    case 14, 41:
                        System.out.println(colours[0] + "/" + colours[3]);
                        break;
                    case 15, 51:
                        System.out.println(colours[0] + "/" + colours[4]);
                        break;
                    case 16, 61:
                        System.out.println(colours[0] + "/" + colours[5]);
                        break;
                    case 17, 71:
                        System.out.println(colours[0] + "/" + colours[6]);
                        break;
                    case 22:
                        System.out.println(colours[1] + "/" + colours[1]);
                        break;
                    case 23, 32:
                        System.out.println(colours[1] + "/" + colours[2]);
                        break;
                    case 24, 42:
                        System.out.println(colours[1] + "/" + colours[3]);
                        break;
                    case 25, 52:
                        System.out.println(colours[1] + "/" + colours[4]);
                        break;
                    case 26, 62:
                        System.out.println(colours[1] + "/" + colours[5]);
                        break;
                    case 27, 72:
                        System.out.println(colours[1] + "/" + colours[6]);
                        break;
                    case 33:
                        System.out.println(colours[2] + "/" + colours[2]);
                        break;
                    case 34, 43:
                        System.out.println(colours[2] + "/" + colours[3]);
                        break;
                    case 35, 53:
                        System.out.println(colours[2] + "/" + colours[4]);
                        break;
                    case 36, 63:
                        System.out.println(colours[2] + "/" + colours[5]);
                        break;
                    case 37, 73:
                        System.out.println(colours[2] + "/" + colours[6]);
                        break;
                    case 44:
                        System.out.println(colours[3] + "/" + colours[3]);
                        break;
                    case 45, 54:
                        System.out.println(colours[3] + "/" + colours[4]);
                        break;
                    case 46, 64:
                        System.out.println(colours[3] + "/" + colours[5]);
                        break;
                    case 47, 74:
                        System.out.println(colours[3] + "/" + colours[6]);
                        break;
                    case 55:
                        System.out.println(colours[4] + "/" + colours[4]);
                        break;
                    case 56, 65:
                        System.out.println(colours[4] + "/" + colours[5]);
                        break;
                    case 57, 75:
                        System.out.println(colours[4] + "/" + colours[6]);
                        break;
                    case 66:
                        System.out.println(colours[5] + "/" + colours[5]);
                        break;
                    case 67, 76:
                        System.out.println(colours[5] + "/" + colours[6]);
                        break;
                    case 77:
                        System.out.println(colours[6] + "/" + colours[6]);
                        break;

                }
                indexArrayOfColours++;
            }
        }
    }


