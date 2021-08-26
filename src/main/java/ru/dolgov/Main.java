package ru.dolgov;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }
    public static void starProgram(){
        Staff[] staff = new Staff[5];
        staff[0] = new Staff("Ivanov ivan","Enginer", "ivivan@mailbox.com", "892312310", 30000, 30);
        staff[1] = new Staff("Ivanov ivan1","Enginer1", "ivivan@mailbox.com1", "892312311", 30001, 31);
        staff[2] = new Staff("Ivanov ivan2","Enginer2", "ivivan@mailbox.com2", "892312312", 30002, 31);
        staff[3] = new Staff("Ivanov ivan3","Enginer3", "ivivan@mailbox.com3", "892312313", 30003, 32);
        staff[4] = new Staff("Ivanov ivan4","Enginer4", "ivivan@mailbox.com4", "892312314", 30004, 34);
        for (int i=0;i<staff.length; i++){
            System.out.println(Arrays.toString(staff));
        }
    }
}
