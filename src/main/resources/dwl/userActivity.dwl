%dw 2.0
output application/json
---
{
  "accessInfo": {
    "accessToken": "",
    "secretId": "",
    "secretPass": ""
  },
  "data": {
    "sessionID": "J56565KKKKK;",
    "emailAddress":  vars.userInfo.email,
    "name": vars.userInfo.name,
    "activityType": "Import users",
    "source": "mulesoft",
    "fileName": vars.userMetaDataResponse.userFileName,
    "isComplete": "No",
    "healthSystemTenant": "sContracts",
    "createdDate": now() as String { format: "yyyy-MM-dd HH:mm:ss"},
    "applicationName": "sContract Tooling",
    "processStartDate": now() as String { format: "yyyy-MM-dd HH:mm:ss"},
    "processEndDate": now() as String { format: "yyyy-MM-dd HH:mm:ss"},
     "client": vars.groupDetails.client,
     "environment": vars.groupDetails.environment

  }
}