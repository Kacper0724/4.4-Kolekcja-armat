import java.util.*;

public class Main {
    public static void main(String[] args) {

        Cannon cannon1 = new Cannon();
        Cannon cannon2 = new Cannon();
        Cannon cannon3 = new Cannon();
        Cannon cannon4 = new Cannon();

        List<Cannon> CannonList = new LinkedList<>();

        CannonList.add(cannon1);
        CannonList.add(cannon2);
        CannonList.add(cannon3);
        CannonList.add(cannon4);

        for (Cannon cannon : CannonList) {
            cannon.fire();
        }

        for (Cannon cannonShoot : CannonList) {
            cannonShoot.fire();
        }
    }
}

class Cannon {
    private boolean loaded;

    public void fire() {
        if(!loaded) {
            System.out.println("The cannon is not loaded! Loading a cannon...");
            loaded = true;
        } else {
            System.out.println("Shoot!");
            loaded = false;
        }
    }

    public boolean getLoaded(){
        return loaded;
    }
}