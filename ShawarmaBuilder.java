public abstract class ShawarmaBuilder{
    // Encapsulation:I used protected so only builders can see these fields.
    protected int amount;
    protected Size size;
    protected Meat meat;
    protected Side side;
    protected Sauce sauce;
    protected Wrap wrap;
    protected boolean isGrilled;
    protected boolean hasCheeseWrap;
    protected ServingStyle servingStyle = ServingStyle.ON_PLATE;

    // Small methods:I made each setter do one job and return this to allow method chaining.
    public ShawarmaBuilder setAmount(int amount) {
        this.amount = amount;
        return this;
    }
    public ShawarmaBuilder setSize(Size size){
        this.size = size;
        return this;
    }
    public ShawarmaBuilder setMeat(Meat meat){
        this.meat = meat;
        return this;
    }
    public ShawarmaBuilder setSide(Side side){
        this.side = side;
        return this;
    }
    public ShawarmaBuilder setSauce(Sauce sauce){
        this.sauce = sauce;
        return this;
    }
    public ShawarmaBuilder setWrap(Wrap wrap) {
        this.wrap = wrap;
        return this;
    }
    public ShawarmaBuilder setGrilled(boolean grilled){
        this.isGrilled = grilled;
        return this;
    }
    public ShawarmaBuilder setCheeseWrap(boolean cheeseWrap){
        this.hasCheeseWrap = cheeseWrap;
        return this;
    }
    // Meaningful names:I used clear names like makeItToGo() so it reads like English.
    public ShawarmaBuilder makeItToGo() {
        this.servingStyle = ServingStyle.TO_GO;
        return this;
    }
    public ShawarmaBuilder makeItOnAPlate(){
        this.servingStyle = ServingStyle.ON_PLATE;
        return this;
    }
    // Validated construction:I check for missing parts and throw an error to stop bad builds.
    public Shawarma build(){
        if (meat == null) throw new IllegalStateException("Can't build a Shawarma without meat!");
        if (size == null) throw new IllegalStateException("Can't build a Shawarma without a size!");
        if (sauce == null) throw new IllegalStateException("Shawarma must have a sauce!");
        if (wrap == null) throw new IllegalStateException("Shawarma must have a wrap!");
        return new Shawarma(this);
    }
}
