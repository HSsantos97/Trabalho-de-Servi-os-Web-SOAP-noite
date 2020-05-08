from suds.client import Client
print((Client("http://localhost:8081/EchoCPF?wsdl")).service.CPF())
