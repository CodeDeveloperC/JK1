package cn.itcast.jk.domain;

import java.util.Date;

/**
 * Created by root on 2017/5/24.
 */
public class Contract {
    private String id;
    private String offeror;
    private String contractNo;
    private Date signingDate;
    private String inputBy;
    private String checkBy;
    private String inspector;
    private Double totalAmount;
    private Integer importNum;
    private String crequest;
    private String customerName;
    private Date deliverPeriod;
    private Date shipTime;
    private String tradeTerms;
    private String remark;
    private String printStyle;
    private Integer oldState;
    private Integer state;
    private Integer outState;//归档后状态

    private String createBy;
    private String createDept;
    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOfferor() {
        return offeror;
    }

    public void setOfferor(String offeror) {
        this.offeror = offeror;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public Date getSigningDate() {
        return signingDate;
    }

    public void setSigningDate(Date signingDate) {
        this.signingDate = signingDate;
    }

    public String getInputBy() {
        return inputBy;
    }

    public void setInputBy(String inputBy) {
        this.inputBy = inputBy;
    }

    public String getCheckBy() {
        return checkBy;
    }

    public void setCheckBy(String checkBy) {
        this.checkBy = checkBy;
    }

    public String getInspector() {
        return inspector;
    }

    public void setInspector(String inspector) {
        this.inspector = inspector;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getImportNum() {
        return importNum;
    }

    public void setImportNum(Integer importNum) {
        this.importNum = importNum;
    }

    public String getCrequest() {
        return crequest;
    }

    public void setCrequest(String crequest) {
        this.crequest = crequest;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getDeliverPeriod() {
        return deliverPeriod;
    }

    public void setDeliverPeriod(Date deliverPeriod) {
        this.deliverPeriod = deliverPeriod;
    }

    public Date getShipTime() {
        return shipTime;
    }

    public void setShipTime(Date shipTime) {
        this.shipTime = shipTime;
    }

    public String getTradeTerms() {
        return tradeTerms;
    }

    public void setTradeTerms(String tradeTerms) {
        this.tradeTerms = tradeTerms;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPrintStyle() {
        return printStyle;
    }

    public void setPrintStyle(String printStyle) {
        this.printStyle = printStyle;
    }

    public Integer getOldState() {
        return oldState;
    }

    public void setOldState(Integer oldState) {
        this.oldState = oldState;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getOutState() {
        return outState;
    }

    public void setOutState(Integer outState) {
        this.outState = outState;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getCreateDept() {
        return createDept;
    }

    public void setCreateDept(String createDept) {
        this.createDept = createDept;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
