import java.io.IOException;
public class Employee {
    private Job[] jobs = new Job[5]; // Creates an array of Job Objects.
                                     // Length chosen arbitrarily and can be changed as needed
    private int lastIndex = 0;
    private String firstName, lastName, empID;

    public Employee(String fName, String lName, String ID) {
        firstName = fName;
        lastName = lName;
        empID = ID;
    }

    public Employee(String fName, String lName) { // Second constructor in case IDs are not used or are assigned later
        firstName = fName;
        lastName = lName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {// Returns the full name as 'first last'
        return firstName + " " + lastName;
    }

    public String getLegalName() { // Returns the employees name as 'last, first'
        return lastName + ", " + firstName;
    }

    public String getEmpID() {
        return empID;
    }

    public void listJobs() {
        for (int i = 0; i < jobs.length; i++) {
            System.out.println(jobs[i] + "\n");
        }
    }

    public void addJob(Job job) {
        if (lastIndex + 1 == jobs.length) { // If the jobs array is full, it will expand as to conserve memory
                                            // while also not restricting the user to a job limit
            Job[] temp = new Job[jobs.length + 5];
            for (int i = 0; i < jobs.length; i++)
                temp[i] = jobs[i];
            jobs = temp;
        }
        jobs[lastIndex] = job;
        lastIndex++;
    }

    public void testAllJobs() throws IOException {
        int i = 0; // Loops through the entirety of the jobs array, executing each method based on
                   // the job's type
        while ((i < jobs.length) && (jobs[i] != null)) {
            jobs[i].testAll();
            i++;

        }
    }
}
