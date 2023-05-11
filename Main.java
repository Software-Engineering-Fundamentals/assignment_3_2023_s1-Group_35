import java.util.Date;

// To add classes. Add abstract class and other classes outlined in diagrams here :)
abstract class GenericUser {

    int ID;

    String name;

    String password;

    Date DOB;

    String emergencyContactInfo;

    void requestHelp() {

    // Request help from IT Administrator

    }

}






public class Main {
    public static void main(String[] args) {
        // Instantiate classes
        Trainee trainee = new Trainee();
        FinanceManager financeManager = new FinanceManager();
        Manager manager = new Manager();
        CourseFeedback courseFeedback = new CourseFeedback();

        // Trainee lodges a registration fee refund request which is addressed by the finance manager
        trainee.requestRefund();
		
        // Finance manager checks if the trainee is eligible for a refund
        boolean eligibleForRefund = true; // Dummy value, real implementation should check the eligibility
        if (eligibleForRefund) {
            financeManager.payRefund();
            System.out.println("Refund has been paid to the trainee.");
        } else {
            System.out.println("Refund request denied.");
        }

        // Lodge a feedback/complaint which is successfully addressed by the Manager
        trainee.provideCourseFeedback();
        manager.accessFeedback();
        courseFeedback.accessFeedbackNotes();
        System.out.println("Feedback/Complaint has been successfully addressed by the Manager.");
    }
}
