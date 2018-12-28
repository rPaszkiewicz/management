package SimpleShop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Product product = new Product.Builder()
                .setPrice(250.99)
                .setProductCount(22)
                .setId(564564456454L)
                .setColor("Black")
                .setProductName("Trzewiki")
                .setWeight(200.5)
                .build();
        System.out.println(product.toString());

        Cloth tShirt = new Cloth.Builder()
                .setSize("L")
                .setMaterial("Cotton")
                .setProductCount(10)
                .build();
        System.out.println(tShirt);

        User user = new User(1234567,"Tobiasz","babajagaPatrzy123");

        System.out.println(user.toString());

    }
}
