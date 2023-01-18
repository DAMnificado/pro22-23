package ev2.herencia.pez;

    public class Shark extends Fish {

        private Integer teeth;

        public Shark(String name, Integer teeth) {
            super(name);
            this.teeth = teeth;
        }

        public Integer getTeeth() {
            return teeth;
        }

        public void setTeeth(Integer teeth) {
            this.teeth = teeth;
        }
    }

