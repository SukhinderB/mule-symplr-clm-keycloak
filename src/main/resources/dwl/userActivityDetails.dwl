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
    "activityID":vars.userActivityId as String,
    "batchID":vars.batchId default 0,
    "activityDetailType": "Import users",
    "activityDescription": "Import users",
    "isSuccess": "",
    "errorDescription": "",
    "requestDetails": "",
    "createdDate": now() as String { format: "yyyy-MM-dd HH:mm:ss"},
    "processStartdDate": now() as String { format: "yyyy-MM-dd HH:mm:ss"},
    "processEndDate": now() as String { format: "yyyy-MM-dd HH:mm:ss"},
    "recordNum":"0"
  }
}