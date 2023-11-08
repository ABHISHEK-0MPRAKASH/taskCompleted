package com.java.encapsulation;

public class Student {
    private String name;
    private String lastname;
    private String usn;
    private String section;
    private long moblienumber;

    public Student(String name, String lastname, String usn, String section, long moblienumber, String emailid) {
        this.name = name;
        this.lastname = lastname;
        this.usn = usn;
        this.section = section;
        this.moblienumber = moblienumber;
        this.emailid = emailid;
    }

    private String emailid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsn() {
        return usn;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public long getMoblienumber() {
        return moblienumber;
    }

    public void setMoblienumber(long moblienumber) {
        this.moblienumber = moblienumber;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", usn='" + usn + '\'' +
                ", section='" + section + '\'' +
                ", moblienumber=" + moblienumber +
                ", emailid='" + emailid + '\'' +
                '}';
    }
}
