public class Shawarma{
    // Immutability: I made fields final so they cannot change.
    private final int amount;
    private final Size size;
    private final Meat meat;
    private final Side side;
    private final Sauce sauce;
    private final Wrap wrap;
    private final boolean isGrilled;
    private final boolean hasCheeseWrap;
    private final ServingStyle servingStyle;

    // Encapsulation:I hid the constructor so only the Builder can make a Shawarma.
    Shawarma(ShawarmaBuilder builder){
        this.amount = builder.amount;
        this.size = builder.size;
        this.meat = builder.meat;
        this.side = builder.side;
        this.sauce = builder.sauce;
        this.wrap = builder.wrap;
        this.isGrilled = builder.isGrilled;
        this.hasCheeseWrap = builder.hasCheeseWrap;
        this.servingStyle = builder.servingStyle;
    }

    //Only getters because final product shouldn't change
    public int getAmount() { return amount; }
    public Size getSize() { return size; }
    public Meat getMeat() { return meat; }
    public Side getSide() { return side; }
    public Sauce getSauce() { return sauce; }
    public Wrap getWrap() { return wrap; }
    public boolean isGrilled() { return isGrilled; }
    public boolean hasCheeseWrap() { return hasCheeseWrap; }
    public ServingStyle getServingStyle() { return servingStyle; }

    //Overriding toString method for this class specific needs
    @Override
    public String toString(){
        return String.format("Shawarma with :%dx, %s, %s, %s wrap, %s side, %s sauce. grilled: %b, cheese wrapped: %b, served: %s",
                amount, size, meat, wrap, side, sauce, isGrilled, hasCheeseWrap, servingStyle);
    }

}
