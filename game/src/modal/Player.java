package modal;

import modal.Characters.Arrows;
import modal.Characters.GameChar;
import modal.Characters.Knight;
import modal.Characters.Samurai;
import modal.Location.*;

import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int money;
    private Inventory inventory;
    private GameChar characters;
    private String name;
    private Scanner input = new Scanner(System.in);

    public Player() {
    }

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }


    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public GameChar getCharacters() {
        return characters;
    }

    public void setCharacters(GameChar characters) {
        this.characters = characters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void selectChar() {

        GameChar[] charactersList = {new Samurai(), new Arrows(), new Knight()};
        System.out.println("Characters:");
        for (GameChar c : charactersList) {
            System.out.println(c.getId() + ". Name:  " + c.getName() + "\t Damage:  " + c.getDamage() + "\t Health:  " + c.getHealth() + " \t Money:  " + c.getMoney());

        }
        System.out.println("Select your character: ");
        int sChar = input.nextInt();
        switch (sChar) {
            case 1 -> initCharacter(charactersList[0]);
            case 2 -> initCharacter(charactersList[1]);
            case 3 -> initCharacter(charactersList[2]);
            default -> {
                if (sChar > 3) {
                    System.err.print("Invalid character selection. \nPlease try again : ");
                    sChar = input.nextInt();

                }
            }
        }
        System.out.println("You have selected " + this.getName() + " as your character.");
    }

    public void initCharacter(GameChar character) {
        this.setDamage(character.getDamage());
        this.setHealth(character.getHealth());
        this.setMoney(character.getMoney());
        this.setName(character.getName());
    }

    public void getInfo() {
        System.out.println("Name: " + this.getName() + "\t Damage: " + this.getDamage() + "\t Health: " + this.getHealth() + "\t Money: " + this.getMoney());
    }

    public int getDamage() {
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    @Override
    public String toString() {
        return "Player{" +
                "inventory=" + inventory +
                ", characters=" + characters +
                ", name='" + name + '\'' +
                ", input=" + input +
                '}';
    }
}
