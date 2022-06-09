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
    "emailAddress": vars.userMetaDataResponse.userInfo.email,
    "name": vars.userMetaDataResponse.userInfo.name,
    "activityType": "Import users",
    "source": "mulesoft",
    "fileName": vars.userMetaDataResponse.userFileName,
    "isComplete": "No",
    "healthSystemTenant": "sContracts",
    "createdDate": now() as String { format: "yyyy-MM-dd HH:mm:ss"},
    "applicationName": "sContract Tooling",
    "activityDetails": {
      "activityDetailType": "",
      "activityDescription": "",
      "isSuccess": "",
      "errorDescription": "",
      "requestDetails": "",
      "createdDate": "",
      "completedDate": ""
    }
  }
}