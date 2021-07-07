package com.winConnect.pages;

public class Contractspagelocators {

	public static final String Contractswin ="//*[@id=\"root\"]/div/div[1]/div[2]/div/div/div[2]/ul/li[4]/a/div";
	public static final String addContract_win ="//*[@id=\"root\"]/div/div[1]/div[2]/div/div/div[2]/ul/li[4]/a/div";
	public static final String contrat_Entity_win ="//*[@id=\"contract.contractEntityEa\"]";
	public static final String property_Type_win ="//*[@id=\"formControl_contract.contractJSON.propertyType\"]/div/div/div/div";
	public static final String development_Type_win ="//*[@id=\"formControl_contract.developmentType\"]/div/div/div/div";
	public static final String  aBN_ACN_win="//*[@id=\"contract.abnea\"]";
	public static final String  property_Location_State_win="//*[@id=\"formControl_contract.state\"]/div/div/div/div";
	public static final String progress_Status_win ="//*[@id=\"contract.contractStatus\"]";
	public static final String contract_Type_win ="//*[@id=\"contract.contractType\"]";
	public static final String  distribution_Discount_win="//*[@id=\"contract.contractJSON.distributionDiscount\"]";
	public static final String  Notes_win ="//*[@id=\"contract.contractJSON.notes\"]";
	public static final String  heading_win = "/html/body/div[1]/div/div[2]/header/div/div[2]/a/span[1]";
	//public static final String  buttonOnNxt="//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div[2]/div[2]/button";
	//Firefox browser
	public static final String buttonOnNxt ="/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[2]/div[2]/button";
	
	//UTILITIES
	
	public static final String Electricity_Util ="/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[4]/div[2]/div/div[1]/div[1]/div/label/span[1]/span[1]/input";
	public static final String HotWater_Util ="//*[@id=\"service.serviceJSON.hasHotWater\"]/label/span[1]/span[1]/input";
	public static final String MeteredGas_Util ="//*[@id=\"service.serviceJSON.hasMeteredGas\"]/label/span[1]/span[1]/input";
	public static final String ValueAdds ="//*[@id=\"service.serviceJSON.hasValueAdds\"]/label/span[1]/span[1]/input";
	public static final String EVCharging ="//*[@id=\"service.serviceJSON.hasEV\"]/label/span[1]/span[1]/input";
	public static final String SolarPV ="//*[@id=\"service.serviceJSON.hasSolar\"]/label/span[1]/span[1]/input";
	public static final String Internet ="//*[@id=\"service.serviceJSON.hasInternet\"]/label/span[1]/span[1]/input";
	//service.serviceJSON.hasHotWater
	// Electricity
	public static final String  serviceType_win ="//*[@id=\"formControl_service.electricityProductService\"]/div/div/div/div";
	public static final String  brand_win ="//*[@id=\"formControl_service.electricityBrand\"]/div/div/div/div";
	public static final String  businessMod_win ="//*[@id=\"formControl_service.serviceJSON.electricityBusinessModel\"]/div/div/div/div";
	public static final String  gateMeterpaidBy_win ="//*[@id=\"formControl_service.serviceJSON.electricityGateMeterPaidBy\"]/div/div/div/div";
	
	public static final String  ENOwner_win ="//*[@id=\"service.enOwner\"]";
	public static final String  ENOperator_win ="//*[@id=\"service.enOperator\"]";
	public static final String  ENSeller_win ="//*[@id=\"service.enSeller\"]";
	public static final String  ENOwnerABN_win ="//*[@id=\"service.enOwnerABN\"]";
	public static final String  ENOperatorABN_win ="//*[@id=\"service.enOperatorABN\"]";
	public static final String  ENSellerABN_win ="//*[@id=\"service.enSellerABN\"]";
	public static final String  Tick1 ="//*[@id=\"service.serviceJSON.isOwnerSame\"]/label/span[1]/span[1]/input";
	public static final String  Tick2 ="//*[@id=\"service.serviceJSON.isOperatorSame\"]/label/span[1]/span[1]/input";
	public static final String  Tick3 ="//*[@id=\"service.serviceJSON.isSellerSame\"]/label/span[1]/span[1]/input";
	
	//Hot Water
	public static final String  ServiceTypehotwater_win ="//*[@id=\"formControl_service.hotWaterProductService\"]/div/div/div/div";
	public static final String  businessModhotwater_win ="//*[@id=\"formControl_service.hotWaterBrand\"]/div/div/div/div";
	public static final String  brandHotwater_win ="//*[@id=\"formControl_service.serviceJSON.hotWaterBusinessModel\"]/div/div/div/div";
	
	//Metered Gas
	public static final String  ServiceTypemetGas_win ="//*[@id=\"formControl_service.meteredGasProductService\"]/div/div/div/div";
	public static final String  businessModmetGas_win ="//*[@id=\"formControl_service.serviceJSON.meteredGasBusinessModel\"]/div/div/div/div";
	public static final String  brandmetGas_win ="//*[@id=\"formControl_service.meteredGasBrand\"]/div/div/div/div";
	
	//ValueAdds
	public static final String  ServiceTypewater_win ="//*[@id=\"formControl_service.potableWaterProductService\"]/div/div/div/div";
	public static final String  ServiceTypefairAir_win ="//*[@id=\"formControl_service.fairAirProductService\"]/div/div/div/div";
	public static final String  ServiceTypechilledwater_win ="//*[@id=\"formControl_service.chilledAndHeatedWaterProductService\"]/div/div/div/div";
	
	public static final String  brandwater_win ="//*[@id=\"formControl_service.potableWaterBrand\"]/div/div/div/div";
	public static final String  brandfairAir_win ="//*[@id=\"formControl_service.fairAirBrand\"]/div/div/div/div";
	public static final String  brandchilledwater_win ="//*[@id=\"formControl_service.chilledHeatedWaterBrand\"]/div/div/div/div";
	
	public static final String  addportableWater_win ="//*[@id=\"service.serviceJSON.hasPotableWater\"]/label/span[1]/span[1]/input";
	public static final String  addAir_win ="//*[@id=\"service.serviceJSON.hasFairAir\"]/label/span[1]/span[1]/input";
	public static final String  addchilled_heated_win ="//*[@id=\"service.serviceJSON.hasChilledAndHeatedWater\"]/label/span[1]/span[1]/input";
	
	//EV charging
	public static final String  businessModEV_win ="//*[@id=\"formControl_service.serviceJSON.evChargingBusinessModel\"]/div/div/div/div";
	public static final String  connectionPtEV_win ="//*[@id=\"formControl_service.serviceJSON.evChargingConnectionPoint\"]/div/div/div/div";
	public static final String  opertionModEV_win ="//*[@id=\"formControl_service.serviceJSON.evChargingOperationalModel\"]/div/div/div/div";
	
	//SolarPV
	public static final String  businessModSolar_win ="//*[@id=\"formControl_service.serviceJSON.solarPVBusinessModel\"]/div/div/div/div";
	public static final String   oNgoingSolar_win="//*[@id=\"formControl_service.serviceJSON.solarPVOngoingMaintenance\"]/div/div/div/div";
	public static final String   sysOwnershipSolar_win="//*[@id=\"formControl_service.serviceJSON.solarPVSystemOwnership\"]/div/div/div/div";
	public static final String   connectionPtSolar_win="//*[@id=\"formControl_service.serviceJSON.solarPVConnectionPoint\"]/div/div/div/div";
	
	//Internet
	public static final String  serviceTypeinternet_win ="//*[@id=\"formControl_service.internetProductService\"]/div/div/div/div";
	public static final String  NBNpartner_win ="//*[@id=\"formControl_service.serviceJSON.internetNbnPartner\"]/div/div/div/div";
	
	//Heading
	public static final String Head_hot ="";
	public static final String Head_Electricity ="";
	public static final String Head_Gas ="";
	public static final String Head_valueAds ="";
	public static final String Head_solarPV ="";
	public static final String Head_chargeEV ="";
	public static final String Head_Internet ="";
	
	//
	//WebElement nextContract_Deatils;
	//@FindBy(tagName = "li")
}




