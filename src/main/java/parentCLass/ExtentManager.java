package parentCLass;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

import java.util.Date;

public class ExtentManager {
    private static ExtentReports extent;
    static String VARIABLE_Reportpath = System.getProperty("user.dir") + "\\Reports\\";

    public static ExtentReports getInstance() {
        System.out.println(System.getProperty("user.dir"));
        if (extent == null) {
            Date d = new Date();
            String fileName = d.toString().replace(":", "_").replace(" ", "_")
                    + ".html";
            extent = new ExtentReports(VARIABLE_Reportpath + fileName, true, DisplayOrder.NEWEST_FIRST);
        }
        return extent;
    }
}
