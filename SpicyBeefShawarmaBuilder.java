public class SpicyBeefShawarmaBuilder extends ShawarmaBuilder{
    public SpicyBeefShawarmaBuilder(){
        this.amount = 1;
        this.size = Size.MEDIUM;
        this.meat = Meat.BEEF;
        this.side = Side.FRIES;
        this.sauce = Sauce.SPICY;
        this.wrap = Wrap.LAVASH;
        this.isGrilled = true;
        this.hasCheeseWrap = false;
    }
}