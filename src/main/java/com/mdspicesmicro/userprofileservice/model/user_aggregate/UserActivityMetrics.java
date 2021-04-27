package com.mdspicesmicro.userprofileservice.model.user_aggregate;

import java.time.Instant;

class UserActivityMetrics {


    UserActivityMetrics() {
    }

    private Long userId;
    
    
    private Instant joinedDate; 
    

    private float avgDailyImpressions;
    
    
    private int daysSinceJoined;


    private int daysSinceLastPurchase;


    private double totalAmtSpent;


    private float frequencyOfOrders;


    private Long mostPurchasedProductId;


	public UserActivityMetrics(Long userId) {
		super();
		this.joinedDate=Instant.now();
		this.daysSinceJoined = 0
		this.userId = userId;		
		this.avgDailyImpressions = 0.0f;
		this.daysSinceLastPurchase = 0;
		this.totalAmtSpent = 0.00;
		this.frequencyOfOrders = 0.0f;
		this.mostPurchasedProductId = null;
	}
	
	public void updateAvgDailyImpressions() {}
	
	public void updateDaysSinceJoined() {}
	
	public void updateDaysSinceLastPurchase() {}
	
	public void updateTotalAmtSpent() {}
	
	public void updateFrequencyOfOrders() {}
	
	public void updateMostPurchasedProductId() {}
	
	


}