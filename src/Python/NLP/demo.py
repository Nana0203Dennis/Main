import pyodbc

# 连接数据库
cnxn = pyodbc.connect("DSN=YourDataSourceName")
cursor = cnxn.cursor()

# 提取数据
cursor.execute("SELECT * FROM job_ads")
rows = cursor.fetchall()
