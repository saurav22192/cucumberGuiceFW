package azevedorafaela.cucumbermaven.support;

import azevedorafaela.cucumbermaven.pages.LoginPage;
import azevedorafaela.cucumbermaven.support.Context;
import com.google.inject.Inject;

public class POMManager {
    private Context world;
    private LoginPage loginPage;
    @Inject
    public POMManager(Context context) {
        this.world = context;
       getLoginPage();
    }

    public LoginPage getLoginPage() {
        if(loginPage==null)
            loginPage= new LoginPage(world);
         return loginPage;
    }
}
