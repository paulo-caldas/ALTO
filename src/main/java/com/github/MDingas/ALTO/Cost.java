public class Cost extends CostInfo {
    private String value;

    public Cost() {
        super();
        this.value = "";
    }

    public Cost(String value) {
        this.value = value;
    }

    public Cost(CostMode mode, String metric, String description, String value) {
        super(mode, metric, description);
        this.value = value;
    }

    public Cost(CostInfo c, String value) {
        super(c);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


}