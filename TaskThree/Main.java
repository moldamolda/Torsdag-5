import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //3.g In your main method, instantiate at least three different rooms.
        Room room1 = new Room(1,2,3);
        Room room2 = new Room(1,2,1);
        Room room3 = new Room(1,4,4);

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building buildingOne = new Building(rooms,2,2,false);

        int i = countLampsInBuilding(buildingOne);
        System.out.println(i);

        boolean b = isNormal(buildingOne);
        System.out.println(b);
    }

    public static int countLampsInBuilding(Building building) {
        int result = 0;

        for(Room rooms: building.getRooms()) {
                result += rooms.getNumberOfLamps();
            }
        return result;
       //Building.Room.rooms.getNumberOfLamps();
    }
    public static boolean isNormal(Building building) {

        if(building.getNumberOfFloors() > building.getRooms().size()) {
            return true;
        }
        System.out.println("This is an odd house");
        return false;

    }

}

//3.k create another static method in Main, isNormal, that takes an object of type Building.
// The method should return true if the Building's numberOfFloors is greater than its number of Rooms.
// If not it should print "This is an odd building" and return false.
