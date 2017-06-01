package de.metas.material.event;

import org.adempiere.util.lang.impl.TableRecordReference;

import de.metas.material.event.ddorder.DDOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
@Builder
public class DDOrderRequestedEvent implements MaterialEvent
{
	public static final String TYPE = "DDOrderRequestedEvent";

	@NonNull
	private final EventDescr eventDescr;

	private final TableRecordReference reference;

	@NonNull
	private final DDOrder ddOrder;

}
