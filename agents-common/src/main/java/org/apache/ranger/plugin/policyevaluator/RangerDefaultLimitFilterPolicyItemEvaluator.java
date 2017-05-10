package org.apache.ranger.plugin.policyevaluator;

import org.apache.ranger.plugin.model.RangerPolicy;
import org.apache.ranger.plugin.model.RangerServiceDef;
import org.apache.ranger.plugin.policyengine.RangerPolicyEngineOptions;

/**
 * Created by root on 17-4-12.
 */
public class RangerDefaultLimitFilterPolicyItemEvaluator extends RangerDefaultPolicyItemEvaluator implements RangerLimitFilterPolicyItemEvaluator{
    final private RangerPolicy.RangerLimitFilterPolicyItem limitFilterPolicyItem;

    public RangerDefaultLimitFilterPolicyItemEvaluator(RangerServiceDef serviceDef, RangerPolicy policy, RangerPolicy.RangerLimitFilterPolicyItem policyItem, int policyItemIndex, RangerPolicyEngineOptions options) {
        super(serviceDef, policy, policyItem, RangerPolicyItemEvaluator.POLICY_ITEM_TYPE_LIMITFILTER, policyItemIndex, options);

        limitFilterPolicyItem = policyItem;
    }

    @Override
    public RangerPolicy.RangerPolicyItemLimitFilterInfo getLimitFilterInfo() {
        return limitFilterPolicyItem == null ? null : limitFilterPolicyItem.getLimitFilterInfo();
    }
}
