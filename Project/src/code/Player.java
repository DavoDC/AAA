package code;

/**
 * This class is part of the "Alien Aztec Adventure" application.
 *
 * Used to model the player/user
 *
 * @author David
 */
public class Player extends Entity {

    public Room location = Game.locations.getRoom("whence");

    public void setLocation(Room newroom) {
        location = newroom;
    }

    public Room getLocation() {
        return location;
    }

}
