public class DietLambShawarmaBuilder extends ShawarmaBuilder{
    public DietLambShawarmaBuilder() {
        this.amount = 1;
        this.size = Size.SMALL;
        this.meat = Meat.LAMB;
        this.side = Side.SALAD;
        this.sauce = Sauce.GARLIC;
        this.wrap = Wrap.PITA;
        this.isGrilled = true;
        this.hasCheeseWrap = false;
    }
}