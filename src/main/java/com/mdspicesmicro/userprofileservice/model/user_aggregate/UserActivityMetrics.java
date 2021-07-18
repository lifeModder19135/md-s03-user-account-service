package com.mdspicesmicro.userprofileservice.model.user_aggregate;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Builder
class UserActivityMetrics {

    

    
    private float avgDailyImpressions;

    
    private int daysSinceLastPurchase;

    
    private double totalAmtSpent;

    
    private double avgOrdersPerMonth;

    
    private Long mostPurchasedProductId;


}