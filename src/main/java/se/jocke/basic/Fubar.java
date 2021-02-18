package se.jocke.basic;

public class Fubar {
    private final String name;
    // Constructor
    public Fubar(String name) {
        this.name = name;
    }

    // Builder and Getters
    private Fubar(Builder builder) {
        this.name = builder.name;
    }


    public static Builder builder() {
        return new Builder();
    }


    public String getName() {
        return name;
    }

    public static class Builder {
        private String name;

        private Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder of(Fubar fubar) {
            this.name = fubar.name;
            return this;
        }

        public Fubar build() {
            return new Fubar(this);
        }
    }

    public static void main(String[] args) {
        Fubar fubarUsingConstructor = new Fubar("");
        Fubar fubarUsingBuilder = new Fubar.Builder().setName("").build();
    }
}
