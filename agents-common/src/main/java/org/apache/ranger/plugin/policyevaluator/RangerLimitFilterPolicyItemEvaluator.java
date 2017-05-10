package org.apache.ranger.plugin.policyevaluator;

import org.apache.ranger.plugin.model.RangerPolicy;

/**
 * Created by root on 17-4-12.
 */
public interface RangerLimitFilterPolicyItemEvaluator extends RangerPolicyItemEvaluator{
    void init();

    RangerPolicy.RangerPolicyItemLimitFilterInfo getLimitFilterInfo();

}
