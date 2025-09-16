package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create students
        Student s1 = new Student("Nikhil");
        Student s2 = new Student("Ravi");

        // Create courses
        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        // Display students & courses
        s1.displayStudent();
        s2.displayStudent();
        c1.displayCourse();
        c2.displayCourse();

        // Attendance log
        List<AttendanceRecord> attendanceLog = new ArrayList<>();

        // valid records
        attendanceLog.add(new AttendanceRecord(s1.getStudentId(), c1.getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(s2.getStudentId(), c2.getCourseId(), "Absent"));

        // invalid status to test validation
        attendanceLog.add(new AttendanceRecord(s1.getStudentId(), c2.getCourseId(), "Late"));

        System.out.println("\nAttendance Records:");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }
    }
}
