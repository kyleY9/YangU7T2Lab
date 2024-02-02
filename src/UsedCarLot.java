import java.util.*;
public class UsedCarLot {
    // instance variables
    private ArrayList<Car> inventory;

    // constructor
    public UsedCarLot() {
        inventory = new ArrayList<Car>();
    }

    // public methods
    public ArrayList<Car> getInventory() {
        return inventory;
    }

    public void addCar(Car car) {
        inventory.add(car);
    }

    public boolean swap(int idxOne, int idxTwo) {
        if ((idxOne < 0 || idxOne >= inventory.size()) || (idxTwo < 0 || idxTwo >= inventory.size())) {
            return false;
        } else {
            Car temp = inventory.set(idxOne, inventory.get(idxTwo));
            inventory.set(idxTwo, temp);
            return true;
        }
    }

    /* Adds a Car to the inventory list at the index specified
       by indexToAdd; this method increases the size of inventory by 1
       PRECONDITION: 0 <= indexToAdd < inventory.size()
       DUE TO THIS PRECONDITION, you do NOT need to check for boundary errors
       like you did the other addCar method; also note that this method is void
   */
    public void addCar(int indexToAdd, Car carToAdd) {
        inventory.add(indexToAdd, carToAdd);
    }

    /* "sells" the Car located at indexOfCarToSell which
        removes it from the inventory list and shifts the remaining
        Cars in the inventory list to the left to fill in the gap;
        this method reduces the size of inventory by 1

        Returns the Car that is being "sold" (removed from lot)

        PRECONDITION: indexOfCarToSell < inventory.size()

        HINT: the ArrayList remove() method returns the removed element while also
              removing it from the ArrayList
      */
    public Car sellCarShift(int indexOfCarToSell) {
        return inventory.remove(indexOfCarToSell);
    }

    /* "sells" the Car located at indexOfCarToSell,
       but instead of removing it and shifting the inventory
       list to the left, REPLACE the Car at indexOfCarToSell
       with NULL, thus creating an "empty parking spot" on the lot;
       this method does NOT reduce the size of inventory by 1

       PRECONDITION: indexOfCarToSell < inventory.size()

       This method returns the Car that is being "sold" (replaced with null)
     */
    public Car sellCarNoShift(int indexOfCarToSell) {
        return inventory.set(indexOfCarToSell, null);
    }

    /* moves Car located at index indexOfCarToMove to index destinationIndex;
       all other cars in the inventory should shift accordingly

       PRECONDITIONS: indexOfCarToMove < inventory.size()
                      destinationIndex < inventory.size()
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex) {
        Car car = inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, car);
    }
}
