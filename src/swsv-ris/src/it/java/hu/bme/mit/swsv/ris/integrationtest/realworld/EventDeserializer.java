package hu.bme.mit.swsv.ris.integrationtest.realworld;

import java.lang.reflect.Type;

import org.junit.Assert;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import hu.bme.mit.swsv.ris.integrationtest.assertevents.AssertSegmentStatus;

public class EventDeserializer implements JsonDeserializer<Event> {

	@Override
	public Event deserialize(final JsonElement element, final Type type, final JsonDeserializationContext context)
			throws JsonParseException {
		if (context.deserialize(element.getAsJsonObject().get("type"), EventType.class) == EventType.TRAINAPPEARS)
			return context.deserialize(element, TrainAppearsEvent.class);
		if (context.deserialize(element.getAsJsonObject().get("type"), EventType.class) == EventType.TRAINPROCEEDS)
			return context.deserialize(element, TrainProceedsEvent.class);
		if (context.deserialize(element.getAsJsonObject().get("type"),
				EventType.class) == EventType.TURNOUTCHANGESDIRECTION)
			return context.deserialize(element, TurnoutChangesDirectionEvent.class);
		if (context.deserialize(element.getAsJsonObject().get("type"),
				EventType.class) == EventType.ASSERTSEGMENTSTATUS)
			return context.deserialize(element, AssertSegmentStatus.class);

		Assert.fail("Error when deserializing events.");
		return null;
	}
}
