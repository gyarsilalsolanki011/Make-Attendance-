package com.gyarsilalsolanki011.make_attendance.activities.modal;

public class AttendanceViewModal {
    public String subject;
    public Integer classesAttended, classesConducted;

    public AttendanceViewModal(String subject, Integer classesAttended, Integer classesConducted) {
        this.subject = subject;
        this.classesAttended = classesAttended;
        this.classesConducted = classesConducted;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getClassesAttended() {
        return classesAttended;
    }

    public void setClassesAttended(Integer classesAttended) {
        this.classesAttended = classesAttended;
    }

    public Integer getClassesConducted() {
        return classesConducted;
    }

    public void setClassesConducted(Integer classesConducted) {
        this.classesConducted = classesConducted;
    }
}