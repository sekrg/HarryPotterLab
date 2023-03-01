package buildings;
import enums.*;

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

    public static class room{
        private String name;

        public room(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class hall{
        private String name;
        private RoomStatus roomstatus;

        public hall(String name, RoomStatus roomstatus) {
            this.name = name;
            this.roomstatus = roomstatus;
        }

        public RoomStatus getRoomstatus() {
            return roomstatus;
        }

        public void setRoomstatus(RoomStatus roomstatus) {
            this.roomstatus = roomstatus;
        }

        public hall(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }


}

