package controle;

import javax.xml.ws.Endpoint;

public class PublicadorCPF {

		public static void main(String[]args) {
			Endpoint.publish("http://localhost:8081/EchoCPF", new EchoCPF());
		
		}
}
