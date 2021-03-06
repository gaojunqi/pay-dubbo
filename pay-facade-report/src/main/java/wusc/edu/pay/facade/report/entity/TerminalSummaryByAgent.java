package wusc.edu.pay.facade.report.entity;

import wusc.edu.pay.common.entity.BaseEntity;

/***
 * 根据代理商统计终端报表
 * 
 * @author Administrator
 * 
 */
public class TerminalSummaryByAgent extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7229844185142719715L;
	private String statDate ; // 
	private Integer reportType; // 报表类型
	private String trxDate; // 交易时间
	private String firstAgentNo; // 一级代理商编号
	private String firstAgentName; // 一级代理商名称
	private Integer newMachineNum; // 采购机器
	private Integer ownedMachineNum; // 自备机器
	private Integer machineNum; // 自备机器
	private Integer assignNum; // 分配数量
	private Integer noAssignNum; // 未分配数量
	public String getStatDate() {
		return statDate;
	}
	public void setStatDate(String statDate) {
		this.statDate = statDate;
	}
	public Integer getReportType() {
		return reportType;
	}
	public void setReportType(Integer reportType) {
		this.reportType = reportType;
	}
	public String getTrxDate() {
		return trxDate;
	}
	public void setTrxDate(String trxDate) {
		this.trxDate = trxDate;
	}
	public String getFirstAgentNo() {
		return firstAgentNo;
	}
	public void setFirstAgentNo(String firstAgentNo) {
		this.firstAgentNo = firstAgentNo;
	}
	public String getFirstAgentName() {
		return firstAgentName;
	}
	public void setFirstAgentName(String firstAgentName) {
		this.firstAgentName = firstAgentName;
	}
	public Integer getNewMachineNum() {
		return newMachineNum;
	}
	public void setNewMachineNum(Integer newMachineNum) {
		this.newMachineNum = newMachineNum;
	}
	public Integer getOwnedMachineNum() {
		return ownedMachineNum;
	}
	public void setOwnedMachineNum(Integer ownedMachineNum) {
		this.ownedMachineNum = ownedMachineNum;
	}
	public Integer getMachineNum() {
		return machineNum;
	}
	public void setMachineNum(Integer machineNum) {
		this.machineNum = machineNum;
	}
	public Integer getAssignNum() {
		return assignNum;
	}
	public void setAssignNum(Integer assignNum) {
		this.assignNum = assignNum;
	}
	public Integer getNoAssignNum() {
		return noAssignNum;
	}
	public void setNoAssignNum(Integer noAssignNum) {
		this.noAssignNum = noAssignNum;
	}
}
