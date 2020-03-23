package au.com.liu.jiang.mapper;

import org.mapstruct.Mapper;

import au.com.liu.jiang.model.SimpleDestination;
import au.com.liu.jiang.model.SimpleSource;

@Mapper
public interface SimpleSourceDestinationMapper {

	SimpleDestination sourceToDestination(SimpleSource source);
	SimpleSource destinationToSource(SimpleDestination destination);
}
