package cl.duoc.alameda.core.model;
public class Item {
    private Long id; private String sku; private String name; private int stock; private double price; private boolean active;
    public Item(Long id, String sku, String name, int stock, double price, boolean active) {
        this.id = id; this.sku = sku; this.name = name; this.stock = stock; this.price = price; this.active = active;
    }
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getSku() { return sku; }
    public void setSku(String sku) { this.sku = sku; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }
}
