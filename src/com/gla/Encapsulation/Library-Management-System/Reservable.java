 /**
 * Interface defining reservation behaviour.
 */
interface Reservable {

    void reserveItem(String borrowerName);

    boolean checkAvailability();
}