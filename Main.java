import java.util.Date;

// To add classes. Add abstract class and other classes outlined in diagrams here :)

public class Main {
    public static void main(String[] args) {
              // Instantiate classes (to be added)
              Trainee trainee = new Trainee();
              FinanceManager financeManager = new FinanceManager();
              Manager manager = new Manager();
              CourseFeedback courseFeedback = new CourseFeedback();

              // Trainee lodges a registration fee 
              trainee.requestRefund();

              // Finance manager checks if the trainee is eligible
              boolean eligibleForRefund = true; // Dummy value, real implementation should check the eligibility
              if (eligibleForRefund) {
                  financeManager.payRefund();
                  System.out.println("Refund has been paid to the trainee.");
              } else {
                  System.out.println("Refund request denied.");
              }

              // Lodge a feedback/complaint
              trainee.provideCourseFeedback();
              manager.accessFeedback();
              courseFeedback.accessFeedbackNotes();
              System.out.println("Feedback/Complaint has been successfully addressed by the Manager.");
    }
}
