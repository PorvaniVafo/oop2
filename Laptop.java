class Laptop extends Device {
    private String processor;
    private int ram;

    /**
     * @param type
     * @param price
     * @param weight
     * @param processor
     * @param ram
     */
    public Laptop(String type, double price, double weight, String processor, int ram) {
        super(type, price, weight);
        this.processor = processor;
        this.ram = ram;
    }
}