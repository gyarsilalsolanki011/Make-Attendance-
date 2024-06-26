package com.gyarsilalsolanki011.make_attendance.database;

import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;
import com.gyarsilalsolanki011.make_attendance.database.modal.User;

public interface UserRepository {
    Task<DocumentSnapshot> getStudentData();
    void setStudentData(User user);
    Task<DocumentSnapshot> getFacultyData();
    void setFacultyData(User user);
    Task<DocumentSnapshot> getAttendanceData();
    void setAttendanceData(User user, String subject);
}
