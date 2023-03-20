package ev2.parte1.herencia.pez;

    public class Shark extends Fish {
        private Integer teeth;

        public Shark(String especie, String name, Integer teeth) {
            super(name, especie);
            this.teeth = teeth;
        }

        public Integer getTeeth() {
            return teeth;
        }

        public void setTeeth(Integer teeth) {
            this.teeth = teeth;
        }
    }

