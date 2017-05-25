package silio.pokedex;

public class Move extends Object {
    private final String name;
    private final String method;
    private final int power;
    private final int accuracy;
    private final int pp;
    private final Type type;
    private final Category category;

    public enum Category {
        physical("physical"),
        special("special"),
        status("status");

        private String category;
        private int color;

        Category(String category) {
            switch (category) {
                case "physical":
                    this.color = R.color.colorPhysicalMove;
                case "special":
                    this.color = R.color.colorSpecialMove;
                case "status":
                    this.color = R.color.colorStatusMove;
            }
        }

        public int color() {
            return color;
        }

        public String category() {
            return category;
        }
    }

    public Move(String name, String method, int power, int accuracy, int pp, Type type, Category category) {
        this.name = name;
        this.method = method;
        this.power = power;
        this.accuracy = accuracy;
        this.pp = pp;
        this.type = type;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getMethod() {
        return method;
    }

    public int getPower() {
        return power;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public int getPp() {
        return pp;
    }

    public Type getType() {
        return type;
    }

    public Category getCategory() {
        return category;
    }
}
