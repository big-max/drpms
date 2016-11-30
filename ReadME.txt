待优化功能：

1.完整流程缩率图显示，同时展现详细流程和完整流程的进度；
2.演练结束后的烟花或类似效果，可定制；
3.正在进行中任务的呼吸灯闪烁功能；



当天演示出现的问题：
1.流程图刷新频率需增加，当前为30s；
2.完成检查工作之后，“短信通知灾备演练开始”不能立即开始，需设置时间限制，类似于23:59启动生产；



process流程图中uuid与mysql job_config uuid保持一致，但无需与TWS数据库中job uuid一致；
mysql job_config中job name需与TWS工作流中job name保持一致；

planStartTime为时间转换后的时间戳表示；

serial显示为1时，Task页面的折线图的横轴将显示此任务；前提是此任务属于StatConst.java中filter显示字段中。