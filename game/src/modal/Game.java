package modal;

import modal.Location.*;

import java.util.Scanner;

public class Game {
    private Player player;
    private Location location;

    private Scanner input = new Scanner(System.in);

    public Game() {
    }

    public Game(Player player, Location location) {
        this.player = player;
        this.location = location;
    }

    public void start() {
        System.out.println("Welcome to the game!");
        System.out.print("Please enter your name: ");
        String playerName = input.nextLine();
        player = new Player(playerName);
        System.out.println(player.getName() + " has been created.");
        player.selectChar();
        selectLocation();
    }

    public void selectLocation() {
        System.out.println();
        System.out.println("################ - Locations - ################");;

        while (true) {
            player.getInfo();
            Location[] locations = {new SafeLocation(this.player), new Cave(this.player), new Forest(this.player), new River(this.player), new ToolStore(this.player)};
            for (Location l : locations) {
                System.out.println("Locations : " + ". Name:  " + l.getName());
            }

            System.out.print("Select your location: ");
            int sLoc = input.nextInt();
            switch (sLoc) {
                case 1 -> locations[0].onLocation();
                case 2 -> locations[1].onLocation();
                case 3 -> locations[2].onLocation();
                case 4 -> locations[3].onLocation();
                case 5 -> locations[4].onLocation();
                default -> {
                    if (sLoc > locations.length) {
                        System.err.print("Invalid location selection. \nPlease try again : ");
                        sLoc = input.nextInt();
                    }else if (!locations[sLoc].onLocation()){
                        System.out.println("Game Over!");
                    }
                }
            }
            System.out.println("Your location is " + locations[sLoc-1].getName());

        }

    }
}
