package com.arzds.model;

import java.util.Map;

public class Model {
private int modelId;
private String modelCode;
private Map<Integer,Margin> marginMap;
public int getModelId() {
	return modelId;
}
public void setModelId(int modelId) {
	this.modelId = modelId;
}
public String getModelCode() {
	return modelCode;
}
public void setModelCode(String modelCode) {
	this.modelCode = modelCode;
}
public Map<Integer, Margin> getMarginMap() {
	return marginMap;
}
public void setMarginMap(Map<Integer, Margin> marginMap) {
	this.marginMap = marginMap;
}

}
