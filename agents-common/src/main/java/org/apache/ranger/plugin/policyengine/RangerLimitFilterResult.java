package org.apache.ranger.plugin.policyengine;

import org.apache.commons.lang.StringUtils;
import org.apache.ranger.plugin.model.RangerPolicy;
import org.apache.ranger.plugin.model.RangerServiceDef;

/**
 * Created by root on 17-4-12.
 */
public class RangerLimitFilterResult extends RangerAccessResult{

    private String filterExpr = null;


    public RangerLimitFilterResult(final String serviceName, final RangerServiceDef serviceDef, final RangerAccessRequest request) {
        this(serviceName, serviceDef, request, null);
    }

    public RangerLimitFilterResult(final String serviceName, final RangerServiceDef serviceDef, final RangerAccessRequest request, final RangerPolicy.RangerPolicyItemLimitFilterInfo limitFilterInfo) {
        super(serviceName, serviceDef, request);

        if(limitFilterInfo != null) {
            setFilterExpr(limitFilterInfo.getFilterExpr());
        }
    }

    /**
     * @return the filterExpr
     */
    public String getFilterExpr() {
        return filterExpr;
    }

    /**
     * @param filterExpr the filterExpr to set
     */
    public void setFilterExpr(String filterExpr) {
        this.filterExpr = filterExpr;
    }

    public boolean isLimitFilterEnabled() {
        return StringUtils.isNotEmpty(filterExpr);
    }

    @Override
    public String toString( ) {
        StringBuilder sb = new StringBuilder();

        toString(sb);

        return sb.toString();
    }

    public StringBuilder toString(StringBuilder sb) {
        sb.append("RangerLimitFilterResult={");

        super.toString(sb);

        sb.append("filterExpr={").append(filterExpr).append("} ");

        sb.append("}");

        return sb;
    }
}
