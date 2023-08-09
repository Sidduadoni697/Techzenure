package Com.techzenure.day6;
import java.util.Scanner;
/**
 * program to generate student details in hostler
 * @author siddu
 */

class Student {
    protected int studentId;
    protected String name;
    protected int departmentId;
    protected String gender;
    protected String phone;

    public Student(int studentId, String name, int departmentId, String gender, String phone) {
        this.studentId = studentId;
        this.name = name;
        this.departmentId = departmentId;
        this.gender = gender;
        this.phone = phone;
    }

    // Getters and setters
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setRoomNumber(int roomNumber) {
        // Empty method for inheritance
    }

    public void setPhoneNumber(String phoneNumber) {
        // Empty method for inheritance
    }
}

class Hosteller extends Student {
    private String hostelName;
    private int roomNumber;

    public Hosteller(int studentId, String name, int departmentId, String gender, String phone,
                     String hostelName, int roomNumber) {
        super(studentId, name, departmentId, gender, phone);
        this.hostelName = hostelName;
        this.roomNumber = roomNumber;
    }

    // Getters and setters specific to Hosteller
    public String getHostelName() {
        return hostelName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    @Override
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phone = phoneNumber;
    }
}

public class Main {
    public static Hosteller getHostellerDetails() {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Student Details & Hostel Details:");
        System.out.print("Student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Department Id: ");
        int departmentId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Gender[M/F]: ");
        String gender = scanner.nextLine();
        System.out.print("Phone Number: ");
        String phone = scanner.nextLine();
        System.out.print("Hostel Name: ");
        String hostelName = scanner.nextLine();
        System.out.print("Room Number: ");
        int roomNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        return new Hosteller(studentId, name, departmentId, gender, phone, hostelName, roomNumber);
    }

    public static void main(String[] args) {
        Hosteller hosteller = getHostellerDetails();

        System.out.print("Modify Room Number(Y/N): ");
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        String modifyRoom = scanner.nextLine();
        if (modifyRoom.equalsIgnoreCase("Y")) {
            System.out.print("New Room Number: ");
            int newRoomNumber = scanner.nextInt();
            hosteller.setRoomNumber(newRoomNumber);
        }

        System.out.print("Modify Phone Number(Y/N): ");
        String modifyPhone = scanner.next();
        if (modifyPhone.equalsIgnoreCase("Y")) {
            System.out.print("New Phone Number: ");
            String newPhoneNumber = scanner.next();
            hosteller.setPhoneNumber(newPhoneNumber);
        }

        // Display updated details
        System.out.println("\nUpdated Hosteller Details:");
        System.out.println("Student ID: " + hosteller.getStudentId());
        System.out.println("Name: " + hosteller.getName());
        System.out.println("Department ID: " + hosteller.getDepartmentId());
        System.out.println("Gender: " + hosteller.getGender());
        System.out.println("Phone Number: " + hosteller.getPhone());
        System.out.println("Hostel Name: " + hosteller.getHostelName());
        System.out.println("Room Number: " + hosteller.getRoomNumber());
    }
}
