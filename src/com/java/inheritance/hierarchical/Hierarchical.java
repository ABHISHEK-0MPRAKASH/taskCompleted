package com.java.inheritance.hierarchical;

public class Hierarchical {
    public static void main(String[] args) {
        DepartOFComputerScience departOFComputerScience = new DepartOFComputerScience();
        DepartOFElectronics departOFElectronics = new DepartOFElectronics();

        System.out.println("Department of computerScience teaches " + departOFComputerScience.sub1 + " " + departOFComputerScience.sub2 + " " +
                departOFComputerScience.sub3 + " at the classroom " + departOFComputerScience.classrooom);
        System.out.println("Department of Electronics teaches " + departOFElectronics.sub1 + " " + departOFElectronics.sub2 + " " +
                departOFElectronics.sub3 + " at the classroom " + departOFElectronics.classrooom1);

    }
}

