package lab3.homework;

public class ExtrinsicState {
    private Integer age;
    private Integer index;
    private Boolean dead;
    private Integer daysInHospital;

    public ExtrinsicState(int a, int i) {
        setAge(a);
        setIndex(i);
        setDead(false);
        setDaysInHospital(-1);
    }

    public Integer getDaysInHospital() {
        return daysInHospital;
    }

    public void setDaysInHospital(Integer daysInHospital) {
        this.daysInHospital = daysInHospital;
    }

    public Boolean getDead() {
        return dead;
    }

    public void setDead(Boolean dead) {
        this.dead = dead;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
