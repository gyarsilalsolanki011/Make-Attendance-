package com.gyarsilalsolanki011.make_attendance.activities.modal;

public class AttendanceViewModal {
    public String subject;
    public Integer classesAttended, classesConducted;

    public AttendanceViewModal(String subject, Integer classesAttended, Integer classesConducted) {
        this.subject = subject;
        this.classesAttended = classesAttended;
        this.classesConducted = classesConducted;
    }
}
