public class Human {
    private String name;
    private Integer age;
    private Double weight;
    private Double height;
    private Boolean isMale;

    Human(String name, Integer age, Double weight, Double height, Boolean isMale) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.isMale = isMale;
    }


    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getHeight() {
        return height;
    }

    public Boolean getIsMale() {
        return isMale;
    }


}
