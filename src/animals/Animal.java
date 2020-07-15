package animals;

public class Animal {

        protected final String name;
        private final String type="";
        protected int numberOfLegs = 4;

        protected Animal(String name){
            this.name = name;
        }


        protected void eat(){
            System.out.println(name+" is eating ");
        }

        protected void sleep(){
            System.out.println(name+ " the " + type );
        }

        public void speak(){
            System.out.println(name+" the "+type+" is saying i can play");
        }

        public String getName(){ return name; }

        public String getType(){
            return type;
        }
}
