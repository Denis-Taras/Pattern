package memento.gameSaver;

public class Snapshot {

    private String name;
    private int armor;
    private int artilleryShells;
    private int machineGunAmmo;
    private Missions mission;

    public Snapshot(String name, int armor, int artilleryShells, int machineGunAmmo, Missions mission) {
        this.name = name;
        this.armor = armor;
        this.artilleryShells = artilleryShells;
        this.machineGunAmmo = machineGunAmmo;
        this.mission = mission;
    }

    public String getName() {
        return name;
    }

    public int getArmor() {
        return armor;
    }

    public int getArtilleryShells() {
        return artilleryShells;
    }

    public int getMachineGunAmmo() {
        return machineGunAmmo;
    }

    public Missions getMission() {
        return mission;
    }
}