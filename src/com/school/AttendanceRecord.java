package com.school;

public class AttendanceRecord {
    private int studentId;
    private int courseId;
    private String status;

    public AttendanceRecord(int studentId, int courseId, String status) {
        this.studentId = studentId;
        this.courseId = courseId;

        if (status == null) {
            this.status = "Invalid";
            System.out.println("⚠️ Warning: Invalid status entered (null). Allowed values: Present/Absent.");
        } else if (status.equalsIgnoreCase("Present") || status.equalsIgnoreCase("Absent")) {
            // keep original case or normalize if you prefer
            this.status = status;
        } else {
            this.status = "Invalid";
            System.out.println("⚠️ Warning: Invalid status entered. Allowed values: Present/Absent.");
        }
    }

    public int getStudentId() {
        return studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getStatus() {
        return status;
    }

    public void displayRecord() {
        System.out.println("Student ID: " + studentId +
                           ", Course ID: " + courseId +
                           ", Status: " + status);
    }
}
