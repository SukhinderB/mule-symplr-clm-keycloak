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
    "activityID": vars.userActivityId as String,
    "batchType": "Import users",
    "batchRequest": "Import users",
    "successCount": "0",
    "errorCount": "0",
    "batchDescription": "Import users",
    "processStartdDate":now() as String { format: "yyyy-MM-dd HH:mm:ss"},
    "processEndDate": now() as String { format: "yyyy-MM-dd HH:mm:ss"}
  }
}