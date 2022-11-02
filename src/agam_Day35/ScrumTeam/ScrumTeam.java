package agam_Day35.ScrumTeam;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    private String PO, BA, SM;
    private ArrayList<Tester> testers;
    private ArrayList<Developer> developers;

    public ScrumTeam(String PO, String BA, String SM) {
        setPO(PO);
        setBA(BA);
        setSM(SM);
        testers = new ArrayList<>(); // ArrayList' Object has to be created to use the ArrayList
        developers = new ArrayList<>(); // ArrayList' Object has to be created to use the ArrayList
    }

    public String getPO() {
        return PO;
    }

    public void setPO(String PO) {
        this.PO = PO;
    }

    public String getBA() {
        return BA;
    }

    public void setBA(String BA) {
        this.BA = BA;
    }

    public String getSM() {
        return SM;
    }

    public void setSM(String SM) {
        this.SM = SM;
    }

    // Not generating getters for tester/developers arrayList because they should only be set when tester/developer is added/removed


    public ArrayList<Developer> getDevelopers() {
        return developers;
    }

    public ArrayList<Tester> getTesters() {
        return testers;
    }

    public void hireTester(Tester tester) {
        testers.add(tester);
    }

    public void hireTesters(Tester[] testers) {
        this.testers.addAll(Arrays.asList(testers));
    }

    public void removeTester(int id) {
        testers.removeIf(p -> p.getId() == id);
    }

    public void hireDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void hireDevelopers(Developer[] Developers) {
        this.developers.addAll(Arrays.asList(Developers));
    }

    public void removeDeveloper(int id) {
        developers.removeIf(p -> p.getId() == id);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", number of testers=" + testers.size() +
                ", number of developers=" + developers.size() +
                '}';
    }
}
/*
4. ScrumTeam Task:
    re-do the Scrum task by making all the fields private in each custom classes


    Encapsulate all the field
        (salary cannot be set to negative)
        (employeeId cannot be set to negative or zero)

    Avoid any duplicated code fragments in each class

*/