package drunkenrobot.miscellaneous;

public class Alcohol {

	private String alcoholType;
	private String alcoholBrand;
	private double alcoholPercentage;

	public Alcohol(String alcoholType, String alcoholBrand,
			double alcoholPercentage) {
		super();
		this.alcoholType = alcoholType;
		this.alcoholBrand = alcoholBrand;
		this.alcoholPercentage = alcoholPercentage;
	}

	public String getAlcoholType() {
		return alcoholType;
	}
	// returns alcohol  development
	public String getAlcoholBrand() {
		return alcoholBrand;
	}

	public String getAlcoholPercentage() {
		return (double) Math.round(alcoholPercentage * 10) / 10 + "%";
	}

}
