package com.mdspicesmicro.userprofileservice.model.user_aggregate;

import javax.persistence.Embeddable;

@Embeddable
class UserActivityMetrics {

    
    UserActivityMetrics() {
    }

    
    private float avgDailyImpressions;

    
    private int daysSinceLastPurchase;

    
    private double TotalAmtSpent;

    
    private float frequencyOfOrders;

    
    private Long mostPurchasedProductId;


}