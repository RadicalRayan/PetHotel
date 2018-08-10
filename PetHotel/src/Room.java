public class Room {
    private String name;
    private Pet[] pets;

    public Room(String name) {
        this.name = name;
        pets = new Pet[3];
    }

    public String getName(){
        return name;
    }

    public String getName(boolean check) {
        // (row col)
        if (check)
            return "" + (Integer.parseInt(name.substring(name.indexOf(' ') + 1)) + 1);
        return "" + (Integer.parseInt(name.substring(9, (name.indexOf(' ')))) + 1);
    }

    public String toString() {
        return "            ";
    }

    public Pet[] getPets() {return pets;}

    public String addPet(Pet pet) {
        return null;
    }
}
