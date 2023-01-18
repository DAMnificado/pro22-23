package ev2.herencia.pez;

    public class Fish {
        private static int fishNumber;
        private String name;

        public Fish(String name) {
            fishNumber++;
            this.name = name;
        }

        public static int getFishNumber() {
            return fishNumber;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

