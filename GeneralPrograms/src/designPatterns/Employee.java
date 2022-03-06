package designPatterns;

public class Employee {

    private int id;
    private String name;
    private boolean isActive;

    private Employee(Builder builderPattern){
        this.id = builderPattern.id;
        this.isActive = builderPattern.isActive;
        this.name = builderPattern.name;
    }

    public static class Builder {
        private int id;
        private String name;
        private boolean isActive;

//        public Builder() {
//        }

        public static Builder newInstance(){
            return new Builder();
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setActive(boolean active) {
            isActive = active;
            return this;
        }


        public Employee build(){
            return new Employee(this);
        }
    }


    public static void main(String[] args) {

        Employee.Builder.newInstance()
                .setActive(true)
                .setId(1)
                .setName("ilena")
                .build();

    }
}
