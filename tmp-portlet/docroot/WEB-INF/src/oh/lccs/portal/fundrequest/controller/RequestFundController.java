package oh.lccs.portal.fundrequest.controller;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class RequestFundController extends MVCPortlet  {

	
    public void sendEmail(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException
    {
    	SessionErrors.add(actionRequest, "email_error");    	
    }

}
