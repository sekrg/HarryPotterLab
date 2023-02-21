package Buildings;

public class Hogwarts {
    private String name;

    public Hogwarts(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static class office{
        private String name;

        public office(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class hall{
        private String name;

        public hall(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
