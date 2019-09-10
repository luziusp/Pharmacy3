package pharmacy.services;

import com.helmedica.common.types.MimeType;
import com.helmedica.services.web.action.WebAction;
import com.helmedica.services.web.action.WebActionRequest;
import com.helmedica.services.web.action.WebActionResponse;

public class DoctorWebActionConfig implements WebAction {

    @Override
    public void perform(WebActionRequest request, WebActionResponse response) throws Exception {

        /**
         * The expected path in query URLs
         */
        final String REPO_URL_PATH = "/Pharmacy/Doctor";
        
        /**
         * The name of the time zone to use for date ranges with times or dates without
         * explicit time zone information.
         */
         final  String DEFAULT_TIME_ZONE = "Europe/Zurich";
        
         response.setContentType(MimeType.json);
         

    }

}
