package SimpleShop;

public class Product {
    private Long id;
    private String productName;
    private double price;
    private double weight;
    private String color;
    private int productCount;

    // dunno if to leave public... if private inheritance fails
    public Product(Long id,String productName, double price,double weight,String color,int productCount){
        this.id=id;
        this.productName=productName;
        this.price=price;
        this.weight=weight;
        this.color=color;
        this.productCount=productCount;
    }

    public static class Builder {
        private Long id;
        private String productName;
        private double price;
        private double weight;
        private String color;
        private int productCount;

        public Builder(){
        }
        public Builder setPrice(double price){
            this.price=price;
            return this;
        }
        public Builder setProductCount(int productCount){
            this.productCount=productCount;
            return this;
        }

        public Builder setId(Long id) {
            this.id=id;
            return this;
        }

        public Builder setProductName(String productName) {
            this.productName = productName;
            return this;
        }

        public Builder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public Builder setColor(String color) {
            this.color=color;
            return this;
        }

        public Product build(){
            return new Product(id,productName,price,weight,color,productCount);
        }

    }

    public void setPrice(double price){
        this.price=price;
    }

    public void setProductCount(int productCount){
        this.productCount=productCount;
    }
    public Long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public int getProductCount() {
        return productCount;
    }

    public String toString(){
        return "Product id: " + id +"\n" + "Product name: " + productName +"\n" + "Product price: " + price + "\n" +"Product color: " + color + "\n" + "Product count: " + productCount;
    }

}
