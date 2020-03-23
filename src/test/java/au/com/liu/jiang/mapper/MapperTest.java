package au.com.liu.jiang.mapper;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;
import org.mapstruct.factory.Mappers;

import au.com.liu.jiang.model.SimpleDestination;
import au.com.liu.jiang.model.SimpleSource;

public class MapperTest {

	private SimpleSourceDestinationMapper mapper = 
			Mappers.getMapper(SimpleSourceDestinationMapper.class);
	
	@Test
	public void givenSourceToDestination_whenMaps_thenCorrect() {
		SimpleSource source = new SimpleSource();
		source.setName("sourceName");
		source.setDescription("sourceDescription");
		SimpleDestination destination = mapper.sourceToDestination(source);
		assertThat(destination.getName(), is(equalTo(source.getName())));
		assertThat(destination.getDescription(), is(equalTo(source.getDescription())));
	}
	
	@Test
	public void givenDestinationToSource_whenMaps_thenCorrect() {
		SimpleDestination destination = new SimpleDestination();
		destination.setName("DestinationName");
		destination.setDescription("DestinationDescription");
		SimpleSource source = mapper.destinationToSource(destination);
		assertThat(source.getName(), is(equalTo(destination.getName())));
		assertThat(source.getDescription(), is(equalTo(destination.getDescription())));
	}
}
