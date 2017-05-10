package org.apache.ranger.db;

import org.apache.ranger.common.db.BaseDao;
import org.apache.ranger.entity.XXPolicyItemLimitFilterInfo;

import javax.persistence.NoResultException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 17-4-12.
 */
public class XXPolicyItemLimitFilterInfoDao extends BaseDao<XXPolicyItemLimitFilterInfo> {

    public XXPolicyItemLimitFilterInfoDao(RangerDaoManagerBase daoManager) {
        super(daoManager);
    }

    public List<XXPolicyItemLimitFilterInfo> findByPolicyItemId(Long polItemId) {
        if(polItemId == null) {
            return new ArrayList<XXPolicyItemLimitFilterInfo>();
        }
        try {
            return getEntityManager()
                    .createNamedQuery("XXPolicyItemLimitFilterInfo.findByPolicyItemId", tClass)
                    .setParameter("polItemId", polItemId).getResultList();
        } catch (NoResultException e) {
            return new ArrayList<XXPolicyItemLimitFilterInfo>();
        }
    }

    public List<XXPolicyItemLimitFilterInfo> findByPolicyId(Long policyId) {
        if(policyId == null) {
            return new ArrayList<XXPolicyItemLimitFilterInfo>();
        }
        try {
            return getEntityManager()
                    .createNamedQuery("XXPolicyItemLimitFilterInfo.findByPolicyId", tClass)
                    .setParameter("policyId", policyId).getResultList();
        } catch (NoResultException e) {
            return new ArrayList<XXPolicyItemLimitFilterInfo>();
        }
    }

    public List<XXPolicyItemLimitFilterInfo> findByServiceId(Long serviceId) {
        if(serviceId == null) {
            return new ArrayList<XXPolicyItemLimitFilterInfo>();
        }
        try {
            return getEntityManager()
                    .createNamedQuery("XXPolicyItemLimitFilterInfo.findByServiceId", tClass)
                    .setParameter("serviceId", serviceId).getResultList();
        } catch (NoResultException e) {
            return new ArrayList<XXPolicyItemLimitFilterInfo>();
        }
    }
}
