package com.ibm.tws.bean;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StaticConst
{
 // public static final String SchedulingFactoryProxyUrl ="http://10.0.244.32:31115/PlanServicesWeb/services/SchedulingFactory";
  public static final String SchedulingFactoryProxyUrl ="http://127.0.0.1:31115/PlanServicesWeb/services/SchedulingFactory";
  public static final String username = "twsuser";
  public static final String password = "passw0rd";
  public static final String job_stream_name = "DRP2016DRP";
  public static final String status_readys = "blocked,waiting,ready,held,suppressed by condition,undecided";
  public static final String status_runnings = "running,started";
  public static final String status_completeds = "completed";
  public static final String status_errors = "error,canceled,cancled";
  public static final String status_waiting = "waiting";
  public static final String status_running = "running";
  public static final String key_jobs = "演练开始:演练\n开始;灾备应用版本检查_桑晓东30M:切换\n检查;开始暂停存储复制:存储\n切换;切断生产广域网_王军10M:网络\n切换;开始启动灾备应用:灾备应\n用启动;短信通知灾备业务验证_王漫5M:灾备切\n换业务\n验证;灾备到生产网络回切_王军20M:网络\n回切;短信通知生产业务验证_王漫5M:生产回\n切业务\n验证;开始停止灾备应用:灾备应\n用停止;开始恢复存储复制:存储\n回切;演练结束:演练\n结束";
  public static final String jobnames = "演练开始;灾备应用版本检查_桑晓东30M;开始暂停存储复制;切断生产广域网_王军10M;开始启动灾备应用;短信通知灾备业务验证_王漫5M;灾备到生产网络回切_王军20M;短信通知生产业务验证_王漫5M;开始停止灾备应用;开始恢复存储复制;演练结束";
  public static final String filtration_job = "完成检查工作;开始暂停存储复制;完成暂停存储复制;开始启动灾备应用;完成启动灾备应用;开始启动生产应用;完成启动生产应用;开始停止灾备应用;完成停止灾备应用;卸载灾备柜面前置存储盘;开始恢复存储复制;完成恢复存储复制;开始备份灾备系统数据;完成备份灾备系统数据";
  public static final String stage_check = "切换前检查";
  public static final String stage_production_sys_shutdown = "生产系统关闭";
  public static final String stage_storage_switch = "存储切换";
  public static final String stage_network_switch = "网络切换";
  public static final String stage_disastreco_sys_startup = "灾备系统启动";
  public static final String stage_disastreco_validated = "灾备业务验证";
  public static final String stage_network_backcut = "网络回切";
  public static final String stage_production_sys_startup = "生产系统启动";
  public static final String stage_production_validated = "生产业务验证";
  public static final String stage_disastreco_sys_shutdown = "灾备系统关闭";
  public static final String stage_storage_backcut = "存储回切";
  public static final String stage_data_backup = "灾备数据备份";
  public static final String system_core = "核心";
  public static final String system_new_credit = "新信贷";
  public static final String system_counter_prepose = "柜面前置";
  public static final String system_transaction_route = "交易路由";
  public static final String system_encrypt_platform = "加密平台";
  public static final String system_all = "ALL 3";
  
  public static String getColorClassByStatus(String state)
  {
    state = state.toLowerCase();
    if (getStatusReady().contains(state)) {
      return "purple";
    }
    if (getStatusRunning().contains(state)) {
      return "blue";
    }
    if (getStatusCompleted().contains(state)) {
      return "green";
    }
    if (getStatusError().contains(state)) {
      return "orange";
    }
    return "";
  }
  
  public static String getStatus(String state)
  {
    state = state.toLowerCase();
    if (getStatusReady().contains(state)) {
      return "未开始";
    }
    if (getStatusRunning().contains(state)) {
      return "进行中";
    }
    if (getStatusCompleted().contains(state)) {
      return "已成功";
    }
    if (getStatusError().contains(state)) {
      return "已失败";
    }
    return "";
  }
  
  public static List<String> getStatusReady()
  {
    String[] status = "blocked,waiting,ready,held,suppressed by condition,undecided".split(",");
    List<String> list = Arrays.asList(status);
    return list;
  }
  
  public static List<String> getStatusRunning()
  {
    String[] status = "running,started".split(",");
    List<String> list = Arrays.asList(status);
    return list;
  }
  
  public static List<String> getStatusCompleted()
  {
    String[] status = "completed".split(",");
    List<String> list = Arrays.asList(status);
    return list;
  }
  
  public static List<String> getStatusError()
  {
    String[] status = "error,canceled,cancled".split(",");
    List<String> list = Arrays.asList(status);
    return list;
  }
  
  public static Map<String, String> getKeyJobs()
  {
    String[] jobs = "演练开始:演练\n开始;完成检查工作:完成\n检查;开始暂停存储复制:存储\n切换;切断生产广域网_王军10M:网络\n切换;开始启动灾备应用:灾备应\n用启动;灾备业务验证_龚本清25M:灾备切\n换业务\n验证;灾备到生产网络回切_王军20M:网络\n回切;开始启动生产应用:生产应\n用启动;生产业务验证_龚本清25M:生产回\n切业务\n验证;短信通知演练结束_王漫5M:演练\n结束;开始停止灾备应用:灾备应\n用停止;开始恢复存储复制:恢复存\n储复制;".split(";");
    Map<String, String> map = new HashMap();
    for (int i = 0; i < jobs.length; i++)
    {
      String[] aa = jobs[i].split(":");
      map.put(aa[0], aa[1]);
    }
    return map;
  }
  
  public static List<String> getJobnames()
  {
    String[] names = "演练开始;完成检查工作;开始暂停存储复制;切断生产广域网_王军10M;开始启动灾备应用;灾备业务验证_龚本清25M;灾备到生产网络回切_王军20M;开始启动生产应用;生产业务验证_龚本清25M;短信通知演练结束_王漫5M;开始停止灾备应用;开始恢复存储复制;".split(";");
    List<String> list = Arrays.asList(names);
    return list;
  }
  
  public static List<String> getFiltrationJobs()
  {
    String[] jobs = "完成检查工作;开始暂停存储复制;完成暂停存储复制;开始启动灾备应用;完成启动灾备应用;开始启动生产应用;完成启动生产应用;开始停止灾备应用;完成停止灾备应用;卸载灾备柜面前置存储盘;开始恢复存储复制;完成恢复存储复制;开始备份灾备系统数据;完成备份灾备系统数据".split(";");
    List<String> list = Arrays.asList(jobs);
    return list;
  }
}
