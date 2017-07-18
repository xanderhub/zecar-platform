package com.zecar.platform.entities.dto.car;

public final class CarDbCsvModelDTO {
	public String manufacturer_name;
    public String manufacturer_logo;
    public String model_name;
    public String model_sub_name;
    public int model_manufactured_since;
    public Integer model_manufactured_until;
    public String model_picture_0;
    public String model_picture_1;
    public String model_picture_2;
    public String model_picture_3;
    public String model_picture_4;
    public String model_picture_5;
	@Override
	public final String toString() {
		return "CarDbCsvModelDTO [manufacturer_name=" + manufacturer_name + ", manufacturer_logo=" + manufacturer_logo
				+ ", model_name=" + model_name + ", model_sub_name=" + model_sub_name + ", model_manufactured_since="
				+ model_manufactured_since + ", model_manufactured_until=" + model_manufactured_until
				+ ", model_picture_0=" + model_picture_0 + ", model_picture_1=" + model_picture_1 + ", model_picture_2="
				+ model_picture_2 + ", model_picture_3=" + model_picture_3 + ", model_picture_4=" + model_picture_4
				+ ", model_picture_5=" + model_picture_5 + "]";
	}
}
