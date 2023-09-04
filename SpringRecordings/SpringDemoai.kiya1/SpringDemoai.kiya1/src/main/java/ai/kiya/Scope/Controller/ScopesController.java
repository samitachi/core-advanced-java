package ai.kiya.Scope.Controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ai.kiya.Scope.domain.HelloMessageGenerator;

@RestController
public class ScopesController {
	public static final Logger LOG = LoggerFactory.getLogger(ScopesController.class);

	@Resource(name = "requestScopedBean")
	HelloMessageGenerator requestScopedBean;

	@Resource(name = "resourceScopedBean")
	HelloMessageGenerator sessionScopedBean1;

	@Autowired
	@Qualifier(value = "applicationScopedBean")
	HelloMessageGenerator sessionScopedBean;

	@RequestMapping("/scopes/request")
	public String getRequestScopeMessage(final Model model) {
		LOG.info("Inside getRequestScopeMessage method of class ScopesController");
		model.addAttribute("previousMessage",requestScopedBean);
		requestScopedBean.setMessage("Request Scope Message!");
		LOG.info("Setting the request scoped message!");
		model.addAtribute("currentMessage",requestScopedBean.getMessage());
		return "scopesExample";
	}
}




