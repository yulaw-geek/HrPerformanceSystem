import json
import pandas as pd

#rewardDataJson和employeeTableJson是从java代码中传递过来的JSON字符串

#将rewardDataJson转化为DataFrame
rewardData = pd.DataFrame(json.loads(rewardDataJson))
#将employeeTableJson转化为DataFrame
employeeTable = pd.DataFrame(json.loads(employeeTableJson))


merged_df = pd.merge(employeeTable, rewardData, on='department', how='inner')

json_data = merged_df.to_json(orient='records')