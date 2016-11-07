package hu.bme.mit.swsv.ris.integrationtest.realworld;

import com.google.gson.annotations.SerializedName;

public enum EventType {
	@SerializedName("trainAppears") TRAINAPPEARS,

	@SerializedName("trainProceeds") TRAINPROCEEDS,

	@SerializedName("turnoutChangesDirection") TURNOUTCHANGESDIRECTION,

	@SerializedName("assertSegmentStatus") ASSERTSEGMENTSTATUS
}
