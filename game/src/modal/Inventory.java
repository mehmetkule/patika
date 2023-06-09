package modal;
import modal.store.*;
public class Inventory {
    private Weapon weapon;
    private Armors armor;

    public Inventory() {
        this.weapon = new Weapon("Thump",1,2,5);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armors getArmor() {
        return armor;
    }

    public void setArmor(Armors armor) {
        this.armor = armor;
    }
}
