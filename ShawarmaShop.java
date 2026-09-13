public class ShawarmaShop{
    public static void main(String[] args){
        System.out.println("1)Using Builder Directly: \n");
        Shawarma custom = new DietLambShawarmaBuilder()
                .setAmount(1)
                .makeItOnAPlate()
                .build();
        System.out.println(custom);

        System.out.println("\n2)Using Director: \n");
        // Director:I pass the builder to the chef to make a standard order easily.
        ShawarmaChef chef = new ShawarmaChef();
        Shawarma standard = chef.makeStandardOrder(new SpicyBeefShawarmaBuilder());
        System.out.println(standard);

        System.out.println("\n3)Testing Validation: \n");
        try {
            new CheesyChickenShawarmaBuilder().setWrap(null).build();
        } catch (IllegalStateException e) {
            System.out.println("Error caught: " + e.getMessage());
        }
    }
}