
public class smartDebit {
	
	try {
		OkHttpClient client = new OkHttpClient().newBuilder()
		 .build();
		Request request = new Request.Builder()
		 .url("https://secure.ddprocessing.co.uk/")
		 .addHeader("UserName","supertrusttestapi")
		 .addHeader("Password", "Jt7?42waF")
		 .method("GET", null)
		 .build();
		Response response = client.newCall(request).execute();
		System.out.println(response);
		}catch(Exception e){
		System.out.println(e);
		}

}
