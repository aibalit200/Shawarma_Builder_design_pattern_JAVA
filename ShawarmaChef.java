public class ShawarmaChef {
    public Shawarma makeStandardOrder(ShawarmaBuilder builder){
        // Small classes:I kept the chef simple. It only knows the steps, not the ingredients.
        return builder.setAmount(2)
                .makeItToGo()
                .build();
    }
}