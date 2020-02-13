public interface ZooInterface {
    public class Enclosure implements ZooInterface {
        public static Enclosure getInstance() {
            Object instance;
            if (instance == null) {
                instance = new Enclosure();
            }
            return null;
        }
    }
}