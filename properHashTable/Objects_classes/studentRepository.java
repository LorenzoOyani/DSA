package properHashTable.Objects_classes;

interface studentRepository {

    void addStudentRecord(StudentRecord newStudentRecord);

    StudentRecord RecordWithNumber(int num);

    void removeRecord(int num);

}
