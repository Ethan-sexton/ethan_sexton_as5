
public class TestProgram {

    public static void main(String[] args) {

        FullTimeJob f = new FullTimeJob("Corporation X", "Janitor", "01022012", "12212016", 40000);
        ContractJob c = new ContractJob("Corporation Y", "Salesman", "01022017", "01252017", 1200);
        PartTimeJob p = new PartTimeJob("Corporation Z", "Nepo baby", "02242021", 12.5);

        Employee em = new Employee("Test", "User", "112312");

        em.addJob(f);
        em.addJob(c);
        em.addJob(p);
        em.listJobs();

        try {
            em.testAllJobs();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
