package predicateassignment;

public class Response {
	
	String responseBody;
	int statusCode;
	String responseType;
	
	public Response(String responseBody,int statusCode,String responseType)
	{
		this.responseBody=responseBody;
		this.statusCode=statusCode;
		this.responseType=responseType;
	}
/*
	@Override
	public String toString() {
		return "(response=" + responseBody + ", statusCode=" + statusCode + ", responseType="
				+ responseType + ")";
	}*/
	
	
	

}
