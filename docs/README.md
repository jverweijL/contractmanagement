# Create workspace
`blade init --base /liferay/development/liferay-workspaces  contractmanagement`

# Create service
`blade create --base /liferay/development/liferay-workspaces/contractmanagement -t service-builder -p com.liferay.cm contractmanagement`

# Create MVC Portlet
`blade create --base /liferay/development/liferay-workspaces/contractmanagement/modules/contractmanagement -t mvc-portlet -p com.liferay.cm.web -c ContractmanagementPortlet contractmanagement-web`

# Create Panel App
 blade create --base /liferay/development/liferay-workspaces/contractmanagement/modules/contractmanagement -t panel-app -v 7.2 -p com.liferay.cm.panel -c ContractmanagmentStatusPanel contractmanagment-status-panel

# Run docker
`docker run --name liferay_portal_v7.2 -v /tmp/docker:/etc/liferay/mount -it -p 8282:8080 liferay/portal:7.2.0-ga1`

# Icertis
based on www.icertis.com

# Status
1. draft
1. waiting for approval
1. approved
1. rejected

# Term
1. Not Applicable
1. 1 year contract
2. 2 year contract
3. 3 year contract

# Type
1. Non Disclosure Agreement
1. General Contract
1. Subscription Contract
1. Vendor Contract