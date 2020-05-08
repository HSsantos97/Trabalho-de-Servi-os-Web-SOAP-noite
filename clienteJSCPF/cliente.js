const soap = require("soap");
const url = "http://localhost:8081/EchoCPF?wsdl"; //url do seu serviço
soap.createClient(url,  (err, client) => {
  if(err){
    console.log(err)
  }else{
    console.log('Digite o CPF no formato: xxxxxxxxxxx')
    client.CPF({
    }, (err, res) => {
      console.log('CPF Valido')
    })
  }
})
