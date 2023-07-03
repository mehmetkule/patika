package modal.Location;

import modal.Player;
import modal.store.Weapon;

public class ToolStore extends DefaultLocation{
    public ToolStore(Player player) {
        super(player, "Tool Store");
    }



    @Override
    public boolean onLocation() {
        System.out.println("You are on the " + getName() + " location.");
        System.out.println("1- Weapons");
        System.out.println("2- Armors");
        System.out.println("0- Exit");
        System.out.print("Choice: ");
        int choice = input.nextInt();
        while (choice < 0 || choice > 2) {
            System.out.print("Invalid choice. Try again: ");
            choice = input.nextInt();
        }
        switch (choice){
            case 1:weapons(); break;
            case 2:armors(); break;
            case 0:return true;
        }
        return true;
    }

    public void weapons(){
        System.out.println("Weapons");
        for (Weapon weapon : Weapon.weapons()) {
            System.out.println(weapon.getId() + "- " + weapon.getName() + " Damage: " + weapon.getDamage() + " Price: " + weapon.getPrice());
        }
        buyWeapon();
    }

    public void buyWeapon(){
        System.out.println("Select weapon: ");
        int choice = input.nextInt();
        while (choice < 0 || choice > 3) {
            System.out.print("Invalid choice. Try again: ");
            choice = input.nextInt();
        }

        Weapon selectedWeapon = Weapon.getWeapon(choice);
        if (selectedWeapon != null){
            if (selectedWeapon.getPrice() > getPlayer().getMoney()){
                System.err.println("You don't have enough money.");
            }else{
                getPlayer().setMoney(getPlayer().getMoney() - selectedWeapon.getPrice());
                System.out.println("You have bought " + selectedWeapon.getName() + " weapon." + "Damage: " + selectedWeapon.getDamage());
                System.out.println("Your new balance is " + getPlayer().getMoney());
                getPlayer().setDamage(getPlayer().getDamage());
                this.getPlayer().getInventory().setWeapon(selectedWeapon);
            }
        }
    }

    public void armors(){
        System.out.println("Armors");
        System.out.println("1- Light Armor");
        System.out.println("2- Medium Armor");
        System.out.println("3- Heavy Armor");
        System.out.println("0- Exit");
    }
}
