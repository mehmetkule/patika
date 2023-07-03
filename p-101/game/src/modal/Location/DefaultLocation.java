package modal.Location;

import modal.Player;

public abstract class DefaultLocation extends Location{
    public DefaultLocation(Player player, String name) {
        super(player, name);
    }

    @Override
    public boolean onLocation() {
        System.out.println("You are on the " + getName() + " location.");
        return true;
    }
}
