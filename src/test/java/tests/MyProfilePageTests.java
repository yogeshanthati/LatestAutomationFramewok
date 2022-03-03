package tests;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.TestBase;
import utilities.Common;
import utilities.Data;
import utilities.GlobalKeys;

@Listeners({ utilities.TestListener.class })
public class MyProfilePageTests extends Common {

	public static int count = 1;
	private TestBase TestBase;
	private pages.LandingPage TreatLandingPage;
	private pages.SignInPage SignInPage;
	private pages.MyProfilePage MyProfilePage;
	private pages.DiscoverPage DiscoverPage;
	private pages.AppNavPage AppNavPage;
	private pages.CreateProfilePage CreateProfilePage;
	private pages.ForgotPasswordPage ForgotPasswordPage;
	private pages.UpdatePasswordPage UpdatePasswordPage;
	private pages.EmailAddressPage EmailAddressPage;
	private pages.ProfileDetailsPage ProfileDetailsPage;
	private pages.MembershipCongratulationsPage MembershipCongratulationsPage;
	

	private pages.MembershipPlansPage MembershipPlansPage;

	private pages.BuyMembershipPage BuyMembershipPage;


	public Data data;
	public ArrayList<String> datasets;

	@BeforeMethod
	public void testStart(Method method) {
		String name = method.getName();
		data = new Data("TestData");
		datasets = data.getDataSets(name);
	}

	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC036_ValidateMyProfileDetailsForAnUserInTreatApp(String deviceName, String platformName,
			String platFormVersion) {

		String strName = new Exception().getStackTrace()[0].getMethodName();

	 	data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			datasetStart(dataset);

			TreatLandingPage = TestBase.setUp(data);

			SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();

			CreateProfilePage = SignInPage.clickOnCreateAccountButton();

			CreateProfilePage.CreateAProfileInTreat();

			AppNavPage = CreateProfilePage.clickOnSkipForNow();

			MyProfilePage = AppNavPage.clickOnMyAccountButton();

			MyProfilePage.validateUserDetailsInMyProfile();

			MyProfilePage.ValidateDetailsInMyProfileForNonMemberUser();

			MyProfilePage.ValidateAllTheSectionFieldsInMyProfile();

			MembershipPlansPage = MyProfilePage.clickOnBecomeATreatMemberButton();

			MembershipPlansPage.SwipeUpTillSelectMembershipPlan();

			MembershipPlansPage.SelectPlanInMembershipPlans();

			BuyMembershipPage = MembershipPlansPage.clickOnProceedButton();

			BuyMembershipPage.SelectCardToBuyMembership();

			MembershipCongratulationsPage = BuyMembershipPage.clickOnMakePaymentButton();

			AppNavPage = MembershipCongratulationsPage.clickOnDonebutton();


			MyProfilePage = AppNavPage.clickOnMyAccountButton();

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				MyProfilePage.validateUserDetailsInMyProfile();
			} else {

				MyProfilePage.validateUserDetailsInMyProfileForMemberIniOS();
			}

			MyProfilePage.validateDetailsInMyProfileForMember();

			MyProfilePage.ValidateAllTheSectionFieldsInMyProfile();

			MyProfilePage.ValidateNavigationToPrivacyAndSharingSectionScreensInMyProfile();

			MyProfilePage.ValidateNavigationToContactTreatSupportInMyProfile();
			
			MyProfilePage.clickOnManageYourData();
			
			TreatLandingPage=MyProfilePage.ClickOnRequestToDelete();
		
			TestBase.tearDown();

			datasetEnd();

		}

	}
}