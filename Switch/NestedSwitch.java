package com.Switch;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.print("Enter employee ID: ");
        int empID = input.nextInt();
        //System.out.println("Enter Department: ");
        String dpt = input.next();

        switch (empID) {
            case 1:
                System.out.println("Jackson");
                break;
            case 2:
                System.out.println("Beep");
                break;
            case 3:
                System.out.println("Enter ID 3");
                switch (dpt){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Managment Department");
                        break;
                    default:
                        System.out.println("enter valid department");
                }
                break;
            default:
                System.out.println("Enter valid EmpID: ");
        }
    }
}
