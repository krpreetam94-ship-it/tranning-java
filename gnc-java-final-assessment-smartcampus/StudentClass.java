
class StudentClass {
    int studentId;
    String name;
    String email;

    public StudentClass(int studentId, String name, String email) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
    }

    public String toString() {
        return studentId + " - " + name + " - " + email;
    }

    public static void main(String[] args) {
        StudentClass s1 = new StudentClass(1, "Preeta", "preeta@gmail.com");
        System.out.println(s1);
    }
}