package org.apache.ranger.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by root on 17-4-12.
 */
@Entity
@Cacheable
@XmlRootElement
@Table(name = "x_policy_item_limitfilter")
public class XXPolicyItemLimitFilterInfo extends XXDBBase implements
        java.io.Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * id of the XXPolicyItemLimitFilterInfo
     * <ul>
     * </ul>
     *
     */
    @Id
    @SequenceGenerator(name = "x_policy_item_limitfilter_SEQ", sequenceName = "x_policy_item_limitfilter_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "x_policy_item_limitfilter_SEQ")
    @Column(name = "id")
    protected Long id;

    /**
     * policyItemId of the XXPolicyItemLimitFilterInfo
     * <ul>
     * </ul>
     *
     */
    @Column(name = "policy_item_id")
    protected Long policyItemId;

    /**
     * filter_expr of the XXPolicyItemLimitFilterInfo
     * <ul>
     * </ul>
     *
     */
    @Column(name = "filter_expr")
    protected String filterExpr;

    /**
     * This method sets the value to the member attribute <b> id</b> . You
     * cannot set null to the attribute.
     *
     * @param id
     *            Value to set member attribute <b> id</b>
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Returns the value for the member attribute <b>id</b>
     *
     * @return Long - value of member attribute <b>id</b> .
     */
    public Long getId() {
        return this.id;
    }

    /**
     * This method sets the value to the member attribute <b> policyItemId</b> .
     * You cannot set null to the attribute.
     *
     * @param policyItemId
     *            Value to set member attribute <b> policyItemId</b>
     */
    public void setPolicyItemId(Long policyItemId) {
        this.policyItemId = policyItemId;
    }

    /**
     * Returns the value for the member attribute <b>policyItemId</b>
     *
     * @return Long - value of member attribute <b>policyItemId</b> .
     */
    public Long getPolicyItemId() {
        return this.policyItemId;
    }

    /**
     * This method sets the value to the member attribute <b> filterExpr</b> .
     * You cannot set null to the attribute.
     *
     * @param filterExpr
     *            Value to set member attribute <b> filterExpr</b>
     */
    public void setFilterExpr(String filterExpr) {
        this.filterExpr = filterExpr;
    }

    /**
     * Returns the value for the member attribute <b>filterExpr</b>
     *
     * @return String - value of member attribute <b>filterExpr</b> .
     */
    public String getFilterExpr() {
        return this.filterExpr;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        XXPolicyItemLimitFilterInfo other = (XXPolicyItemLimitFilterInfo) obj;
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        if (filterExpr == null) {
            if (other.filterExpr != null) {
                return false;
            }
        } else if (!filterExpr.equals(other.filterExpr)) {
            return false;
        }
        if (policyItemId == null) {
            if (other.policyItemId != null) {
                return false;
            }
        } else if (!policyItemId.equals(other.policyItemId)) {
            return false;
        }
        return true;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "XXPolicyItemLimitFilterInfo [" + super.toString() + " id=" + id
                + ", policyItemId=" + policyItemId + ", filterExpr=" + filterExpr + "]";
    }

}
