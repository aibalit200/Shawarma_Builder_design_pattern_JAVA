public class CheesyChickenShawarmaBuilder extends ShawarmaBuilder{
    // instead of writing 8 setter calls in every builder
    public CheesyChickenShawarmaBuilder(){
        this.amount = 1;
        this.size = Size.LARGE;
        this.meat = Meat.CHICKEN;
        this.side = Side.CHEESE;
        this.sauce = Sauce.CHEESY;
        this.wrap = Wrap.TORTILLA;
        this.isGrilled = false;
        this.hasCheeseWrap = true;
    }
}