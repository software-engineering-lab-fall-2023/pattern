package edu.sharif.sel;

import edu.sharif.sel.state.InTransitState;
import edu.sharif.sel.state.State;
import edu.sharif.sel.strategy.ExpressStrategy;
import edu.sharif.sel.strategy.StandardStrategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome!\nEnter your package weight: ");
        double weight = scanner.nextDouble();
        Package pkg = new Package(weight);
        State state = new InTransitState(pkg);
        pkg.setState(state);
        while (true) {
            System.out.println("Enter 1 for Standard and 2 for Express: ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                pkg.setStrategy(new StandardStrategy());
            } else if (choice == 2) {
                pkg.setStrategy(new ExpressStrategy());
            } else {
                System.out.println("Invalid input!");
            }
            System.out.println("Enter 1 for next state and any other number for staying in the same state: ");
            choice = scanner.nextInt();
            if (choice == 1) {
                boolean end = pkg.nextState();
                if (end) {
                    break;
                }
            }
        }
        System.out.println("Price: " + pkg.getPrice());
    }
}