public class RouteLinkedList<T extends Checkpoint> {

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> head;
    private int size;

    public void addCheckpoint(T checkpoint) {
        Node<T> newNode = new Node<>(checkpoint);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) current = current.next;
            current.next = newNode;
        }
        size++;
    }

    public boolean removeCheckpoint(String checkpointId) {
        if (head == null) return false;

        if (head.data.getCheckpointId().equals(checkpointId)) {
            head = head.next;
            size--;
            return true;
        }

        Node<T> current = head;
        while (current.next != null) {
            if (current.next.data.getCheckpointId().equals(checkpointId)) {
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public T findCheckpoint(String checkpointId) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.getCheckpointId().equals(checkpointId)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public double computeTotalDistance() {
        double total = 0.0;
        Node<T> current = head;
        while (current != null) {
            total += current.data.getDistanceFromLast();
            current = current.next;
        }
        return total;
    }

    public double computeTotalPenalty() {
        double total = 0.0;
        Node<T> current = head;
        while (current != null) {
            total += current.data.calculatePenalty();
            current = current.next;
        }
        return total;
    }

    public boolean isConsistent() {
        boolean hasDelivery = false;
        boolean hasFuel = false;

        Node<T> current = head;
        while (current != null) {
            String type = current.data.getType();
            if (type.equals("DeliveryCheckpoint")) hasDelivery = true;
            if (type.equals("FuelCheckpoint")) hasFuel = true;
            current = current.next;
        }
        return hasDelivery && hasFuel;
    }

    public void printRoute() {
        if (head == null) {
            System.out.println(" (No checkpoints in route)");
            return;
        }
        Node<T> current = head;
        int index = 1;
        while (current != null) {
            System.out.printf(" %d. %s%n", index++, current.data);
            current = current.next;
        }
    }

    public int getSize() { return size; }

    public boolean isEmpty() { return head == null; }

    public T getHead() { return head == null ? null : head.data; }
}


