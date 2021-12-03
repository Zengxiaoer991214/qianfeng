package month11.day30.time.test3;

public class Cake {//实体类  pojo vo entity
	private int id;
	private String produceName;
	public Cake(int id, String produceName) {
		super();
		this.id = id;
		this.produceName = produceName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProduceName() {
		return produceName;
	}
	public void setProduceName(String produceName) {
		this.produceName = produceName;
	}



}
