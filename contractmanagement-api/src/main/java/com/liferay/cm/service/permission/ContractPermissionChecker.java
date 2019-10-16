package com.liferay.cm.service.permission;

// manually added by j. verweij

import com.liferay.portal.kernel.security.auth.AuthException;
import com.liferay.portal.kernel.security.permission.BaseModelPermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.cm.model.Contract;

public interface ContractPermissionChecker
        extends BaseModelPermissionChecker {

    public static final String RESOURCE_NAME = Contract.class.getName();

    public static final String TOP_LEVEL_RESOURCE = RESOURCE_NAME.substring(0, RESOURCE_NAME.lastIndexOf("."));

    public void check(
            PermissionChecker permissionChecker, long groupId, long assignmentId,
            String actionId)
            throws AuthException;

    public void checkTopLevel(
            PermissionChecker permissionChecker, long groupId, String actionId)
            throws AuthException;

    public boolean contains(
            PermissionChecker permissionChecker, long groupId, long assignmentId,
            String actionId);

    public boolean containsTopLevel(
            PermissionChecker permissionChecker, long groupId, String actionId);
}