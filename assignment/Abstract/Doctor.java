public class Doctor extends Person {

        public Doctor(String name, String address) {
            super(name, address);
        }

        @Override
        public void role() {

            System.out.println(getName() + " is a Doctor");
        }

        @Override
        public void responsibility() {
            System.out.println(getName() + " has a responsibility to Treat patients");
            System.out.println(getName() + " lives in " + getAddress());

        }
    }
