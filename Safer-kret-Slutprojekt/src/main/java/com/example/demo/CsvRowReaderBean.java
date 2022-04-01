package com.example.demo;


public class CsvRowReaderBean {

	//States
	private String OrderDate;
	private String Region;
	private String Rep1;
	private String Rep2;
	private String Item;
	private String Units;
	private String UnitCost;
	private String Total;

	//Constructor 1
	public CsvRowReaderBean() {

	}

	//Constructor 2
	public CsvRowReaderBean(String orderDate, String region, String rep1, String rep2, String item, String units,
			String unitCost, String total) {
		OrderDate = orderDate;
		Region = region;
		Rep1 = rep1;
		Rep2 = rep2;
		Item = item;
		Units = units;
		UnitCost = unitCost;
		Total = total;
	}

	//Behaviors: Getters
	public String getOrderDate() {
		return OrderDate;
	}

	public String getRegion() {
		return Region;
	}

	public String getRep1() {
		return Rep1;
	}

	public String getRep2() {
		return Rep2;
	}

	public String getItem() {
		return Item;
	}

	public String getUnits() {
		return Units;
	}

	public String getUnitCost() {
		return UnitCost;
	}

	public String getTotal() {
		return Total;
	}
}
