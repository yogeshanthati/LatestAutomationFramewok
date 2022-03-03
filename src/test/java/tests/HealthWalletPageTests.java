package tests;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.TestBase;
import pages.*;
import utilities.Common;
import utilities.Data;

public class HealthWalletPageTests extends Common {

	public static int count = 1;
	private TestBase TestBase;
	private LandingPage TreatLandingPage;
	private SignInPage SignInPage;
	private MyProfilePage MyProfilePage;
	private AppNavPage AppNavPage;
	private MembershipPlansPage MembershipPlansPage;
	private BuyMembershipPage BuyMembershipPage;
	private CreateProfilePage CreateProfilePage;
	private MembershipCongratulationsPage MembershipCongratulationsPage;
	private BillingHistoryPage BillingHistoryPage;
	private HealthWalletPage HealthWalletPage;
	private HealthWallet_UploadARecordPage HealthWallet_UploadARecordPage;
	private pages.HealthWallet_HealthRecordsPage HealthWallet_HealthRecordsPage;
	
	private ChatCare_PatientDetails ChatCare_PatientDetails;

	private MembershipDetailsPage MembershipDetailsPage;
	
	private ChatCarePage ChatCarePage;

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
	public void MOB_TC025_ValidateTheHealthWalletFunctionalityForANonMemberUserInTreatApp(String deviceName,
			String platformName, String platFormVersion) {
		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			TreatLandingPage = TestBase.setUp(data);
		
			AppNavPage = TreatLandingPage.clicOnContinueAsGuest();

			HealthWalletPage = AppNavPage.clickOnHealthWalletButton();

			HealthWalletPage.ValidateHealthWalletDetailsForGuestUser();
			
		    SignInPage=HealthWalletPage.clickOnLogInButtonInHealthWallet();

			CreateProfilePage = SignInPage.clickOnCreateAccountButton();

			CreateProfilePage.CreateAProfileInTreat();

			AppNavPage = CreateProfilePage.clickOnSkipForNow(); 
		    
			HealthWalletPage = AppNavPage.clickOnHealthWalletButton();

			HealthWalletPage.ValidateHealthWalletDetailsforNonMemberUser();

			HealthWallet_UploadARecordPage = HealthWalletPage.clickOnUploadARecordButton();

			HealthWalletPage = HealthWallet_UploadARecordPage.clickOnCalcelButtonInUploadARecordPage();

			HealthWallet_UploadARecordPage = HealthWalletPage.clickOnUploadARecordButton();

			HealthWallet_UploadARecordPage.EnterUploadRecordDetailsInUploadARecord();

			HealthWallet_UploadARecordPage.EnterTypeOfRecordAsInsuranceInUploadRecord();

			HealthWallet_HealthRecordsPage = HealthWallet_UploadARecordPage.clickOnUploadButton();

			HealthWallet_HealthRecordsPage.ValidateUploadSuccessMessage();

			HealthWallet_HealthRecordsPage.ValidateUploadedRecordDetailsForSelf();
			
			HealthWallet_HealthRecordsPage.ValidateUpdatedRecordDetails();

			HealthWallet_HealthRecordsPage.ValidateDeleteRecordInRecordDetails();

			HealthWallet_HealthRecordsPage.clickOnNavigateBackButtonInRecordDetails();

			AppNavPage = HealthWallet_HealthRecordsPage.clickOnNavigateBackButtonInHealthRecords();

			MyProfilePage = AppNavPage.clickOnMyAccountButton();

			MyProfilePage.clickOnSignOutButton();

			TestBase.tearDown();

			datasetEnd();
		}

	}

	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC026_ValidateTheHealthWalletFunctionalityForAMemberUserInTreatApp(String deviceName,
			String platformName, String platFormVersion) {

		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			TreatLandingPage = TestBase.setUp(data);

			SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();
			
			CreateProfilePage = SignInPage.clickOnCreateAccountButton();

			CreateProfilePage.CreateAProfileInTreat();

			AppNavPage = CreateProfilePage.clickOnSkipForNow();
		
			MyProfilePage=AppNavPage.clickOnMyAccountButton();
			
			MembershipPlansPage = MyProfilePage.clickOnBecomeATreatMemberButton();

			MembershipPlansPage.SwipeUpTillSelectMembershipPlan();

			MembershipPlansPage.SelectPlanInMembershipPlans();

			BuyMembershipPage = MembershipPlansPage.clickOnProceedButton();

			BuyMembershipPage.SelectCardToBuyMembership();

			MembershipCongratulationsPage = BuyMembershipPage.clickOnMakePaymentButton();

			AppNavPage = MembershipCongratulationsPage.clickOnDonebutton();

			HealthWalletPage = AppNavPage.clickOnHealthWalletButton();
			
			HealthWalletPage.ValidateCapitalRXCardDetailsForAMemeber();
			
			HealthWalletPage.ValidateHealthWalletDetailsForMemberUser();

			HealthWallet_UploadARecordPage = HealthWalletPage.clickOnUploadARecordButton();

			HealthWalletPage = HealthWallet_UploadARecordPage.clickOnCalcelButtonInUploadARecordPage();

			HealthWallet_UploadARecordPage = HealthWalletPage.clickOnUploadARecordButton();

			HealthWallet_UploadARecordPage.EnterUploadRecordDetailsInUploadARecord();

			HealthWallet_UploadARecordPage.EnterTypeOfRecordAsInsuranceInUploadRecord();

			HealthWallet_HealthRecordsPage = HealthWallet_UploadARecordPage.clickOnUploadButton();

			HealthWallet_HealthRecordsPage.ValidateUploadSuccessMessage();

			HealthWallet_HealthRecordsPage.	ValidateUploadedRecordDetailsForSelf();

			HealthWallet_HealthRecordsPage.ValidateUpdatedRecordDetails();

			HealthWallet_HealthRecordsPage.ValidateDeleteRecordInRecordDetails();

			HealthWallet_HealthRecordsPage.clickOnNavigateBackButtonInRecordDetails();

			AppNavPage = HealthWallet_HealthRecordsPage.clickOnNavigateBackButtonInHealthRecords();

			MyProfilePage = AppNavPage.clickOnMyAccountButton();

			MembershipDetailsPage = MyProfilePage.clickOnMembershipDetailsButton();

			MembershipDetailsPage.CancelTheExistingMembershipInMembershipDetails();

			MyProfilePage = MembershipDetailsPage.clickOnBackButton();

			AppNavPage = MyProfilePage.NavigateToAppNavPage();

			HealthWalletPage = AppNavPage.clickOnHealthWalletButton();

			HealthWallet_UploadARecordPage = HealthWalletPage.clickOnUploadARecordButton();

			HealthWalletPage = HealthWallet_UploadARecordPage.clickOnCalcelButtonInUploadARecordPage();

			HealthWallet_UploadARecordPage = HealthWalletPage.clickOnUploadARecordButton();

			HealthWallet_UploadARecordPage.EnterUploadRecordDetailsInUploadARecord();

			HealthWallet_UploadARecordPage.EnterTypeOfRecordAsInsuranceInUploadRecord();

			HealthWallet_HealthRecordsPage = HealthWallet_UploadARecordPage.clickOnUploadButton();

			HealthWallet_HealthRecordsPage.ValidateUploadSuccessMessage();

			HealthWallet_HealthRecordsPage.ValidateUploadedRecordDetailsForSelf();

			HealthWallet_HealthRecordsPage.ValidateUpdatedRecordDetails();

			HealthWallet_HealthRecordsPage.ValidateDeleteRecordInRecordDetails();

			HealthWallet_HealthRecordsPage.clickOnNavigateBackButtonInRecordDetails();

			AppNavPage = HealthWallet_HealthRecordsPage.clickOnNavigateBackButtonInHealthRecords();

			MyProfilePage = AppNavPage.clickOnMyAccountButton();

			MyProfilePage.clickOnSignOutButton();

			TestBase.tearDown();

			datasetEnd();
		}

	}
	
	
	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC027_ValidateTheFieldsInHealthWalletUploadARecord(String deviceName,
			String platformName, String platFormVersion) {

		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			datasetStart(dataset);

			TreatLandingPage = TestBase.setUp(data);

			SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();
			
			SignInPage.EnterUserNameAndPassword();
	
			AppNavPage =SignInPage.clickOnSignInButton();

			HealthWalletPage = AppNavPage.clickOnHealthWalletButton();

			HealthWallet_UploadARecordPage = HealthWalletPage.clickOnUploadARecordButton();

			HealthWallet_UploadARecordPage.ValidateTheFieldsInUploadARecord();
				
			HealthWalletPage = HealthWallet_UploadARecordPage.clickOnCalcelButtonInUploadARecordPage();

			HealthWallet_UploadARecordPage = HealthWalletPage.clickOnUploadARecordButton();
			
			HealthWallet_UploadARecordPage.ValidateEmptySelectImagesToUploadARecord();
			
			AppNavPage=HealthWallet_UploadARecordPage.clickOnNavigateBackButtonInUploadARecord();
			
			MyProfilePage = AppNavPage.clickOnMyAccountButton();
			
			MyProfilePage.clickOnSignOutButton();

			TestBase.tearDown();

			datasetEnd();
		}

	}

	
	
	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC041_ValidateTheHealthWalletFunctionalityForADependent(String deviceName,
			String platformName, String platFormVersion) {

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
		
			MyProfilePage=AppNavPage.clickOnMyAccountButton();
			
			MembershipPlansPage = MyProfilePage.clickOnBecomeATreatMemberButton();

			MembershipPlansPage.SwipeUpTillSelectMembershipPlan();

			MembershipPlansPage.SelectPlanInMembershipPlans();

			BuyMembershipPage = MembershipPlansPage.clickOnProceedButton();

			BuyMembershipPage.SelectCardToBuyMembership();

			MembershipCongratulationsPage = BuyMembershipPage.clickOnMakePaymentButton();

			AppNavPage = MembershipCongratulationsPage.clickOnDonebutton();
			
			ChatCarePage=AppNavPage.clickOnChatCareButton();
			
            ChatCare_PatientDetails=ChatCarePage.SelectChildToAddInChatCare();
			
			ChatCare_PatientDetails.AddChildInChatCarePatientDetailsPage();
			
			AppNavPage=ChatCare_PatientDetails.clickOnChatCareTextPopUpOkButton();
		
			HealthWalletPage = AppNavPage.clickOnHealthWalletButton();
			
			HealthWallet_UploadARecordPage = HealthWalletPage.clickOnUploadARecordButton();

			HealthWallet_UploadARecordPage.EnterUploadRecordDetailsInUploadARecordForDependent();

			HealthWallet_UploadARecordPage.EnterTypeOfRecordAsInsuranceInUploadRecord();

			HealthWallet_HealthRecordsPage = HealthWallet_UploadARecordPage.clickOnUploadButton();

			HealthWallet_HealthRecordsPage.ValidateUploadSuccessMessage();

			HealthWallet_HealthRecordsPage.ValidateUploadedRecordDetailsForDependent();
			
			HealthWallet_HealthRecordsPage.ValidateUpdatedRecordDetails();

			HealthWallet_HealthRecordsPage.ValidateDeleteRecordInRecordDetails();

			HealthWallet_HealthRecordsPage.clickOnNavigateBackButtonInRecordDetails();

			AppNavPage = HealthWallet_HealthRecordsPage.clickOnNavigateBackButtonInHealthRecords();

			MyProfilePage = AppNavPage.clickOnMyAccountButton();

			MembershipDetailsPage = MyProfilePage.clickOnMembershipDetailsButton();

			MembershipDetailsPage.CancelTheExistingMembershipInMembershipDetails();

			MyProfilePage = MembershipDetailsPage.clickOnBackButton();

			AppNavPage = MyProfilePage.NavigateToAppNavPage();

			HealthWalletPage = AppNavPage.clickOnHealthWalletButton();

			HealthWallet_UploadARecordPage = HealthWalletPage.clickOnUploadARecordButton();

			HealthWalletPage = HealthWallet_UploadARecordPage.clickOnCalcelButtonInUploadARecordPage();

			HealthWallet_UploadARecordPage = HealthWalletPage.clickOnUploadARecordButton();

			HealthWallet_UploadARecordPage.EnterUploadRecordDetailsInUploadARecordForDependent();

			HealthWallet_UploadARecordPage.EnterTypeOfRecordAsInsuranceInUploadRecord();

			HealthWallet_HealthRecordsPage = HealthWallet_UploadARecordPage.clickOnUploadButton();

			HealthWallet_HealthRecordsPage.ValidateUploadSuccessMessage();

			HealthWallet_HealthRecordsPage.ValidateUploadedRecordDetailsForDependent();

			HealthWallet_HealthRecordsPage.ValidateUpdatedRecordDetails();

			HealthWallet_HealthRecordsPage.ValidateDeleteRecordInRecordDetails();

			HealthWallet_HealthRecordsPage.clickOnNavigateBackButtonInRecordDetails();

			AppNavPage = HealthWallet_HealthRecordsPage.clickOnNavigateBackButtonInHealthRecords();

			MyProfilePage = AppNavPage.clickOnMyAccountButton();

			MyProfilePage.clickOnSignOutButton();

			TestBase.tearDown();

			datasetEnd();
		}

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
