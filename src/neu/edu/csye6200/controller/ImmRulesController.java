package neu.edu.csye6200.controller;

import neu.edu.csye6200.views.PanelImmRules;


public class ImmRulesController {

    private PanelImmRules viewStateRules;
    private static ImmRulesController instance;

    static ImmRulesController getInstance(PanelImmRules viewStateRules) {
        instance = new ImmRulesController(viewStateRules);
        return instance;
    }

    private ImmRulesController(PanelImmRules viewStateRules) {
        this.viewStateRules = viewStateRules;
    }
}
