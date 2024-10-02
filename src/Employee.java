public class Employee {
    private int ID;
    private String Phone;
    private String name;
    private int experience;

    public Employee( int ID, String name, String phone, int experience) {
        this.ID = ID;
        this.name = name;
        this.Phone = phone;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", name=" + name +
                ", Phone=" + Phone +
                ", experience='" + experience + '\'' +
                '}';
    }

    public int getExperience() {
        return experience;
    }

    public String getID() {
        return Integer.toString(this.ID);
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return Phone;
    }
}
