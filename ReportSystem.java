public class ReportSystem {
    public static void main(String[] args) {
        String[] departments = {"HR", "Finance", "Sales"};
        for (int i = 0; i < departments.length; i++) {
            String report = "";
            switch (departments[i]) {
                case "HR":
                    report = "Staff performance analysis";
                    break;
                case "Finance":
                    report = "Budget and expense trends";
                    break;
                case "Sales":
                    report = "Monthly sales KPIs";
                    break;
                default:
                    report = "Department data not available";
            }
            System.out.println(departments[i] + ": " + report);
        }
    }
}
