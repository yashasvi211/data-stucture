package Factory;

class EmployeeFactory {
    public static Employee getEmployee(String emp) {
        if (emp.trim().equalsIgnoreCase("Android Devoloper")) {
            return new AndroidDev();
        } else if (emp.trim().equalsIgnoreCase("Web Devoloper")) {
            return new WebDev();
        }
        return null;
    }
}
