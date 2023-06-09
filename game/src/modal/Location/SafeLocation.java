package modal.Location;

import modal.Player;

public class SafeLocation extends DefaultLocation{
    public SafeLocation(Player player) {
        super(player, "Safe Location");
    }

    @Override
    public boolean onLocation() {
        System.out.println("You are on the safe location.");
        return super.onLocation();
    }
}
