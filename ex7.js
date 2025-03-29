var salariofixo = 2000;
var bonusporcarro = 100;

var salariototal = salariofixo + (qtdCarrosVendidos * bonusporcarro);

var qtdCarrosVendidos = parseInt(prompt("Digite a quantidade de carros vendidos à vista: "));
console.log("O salário do vendedor é: R$", salariototal);
alert("O salário do vendedor é: R$"+ salariototal);