package labor;

import java.time.LocalDate;

public interface DNA {
	public int evolDistance(DNA y);
	public String getSequence();
	public Place getDiscoveryPlace();
	public LocalDate getDiscoveryDate();
	public String getDescription();
	public void setDescription(String desc);
}
