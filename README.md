
O cenário é uma aplicação de desconto quando o orçamento possui mais de 5 itens e quando o valor do orçamento é maior que 500 reais.

Inicialmente se pensou em utilizar o padrão strategy, porém ainda continuariamos com a utilização de Ifs pelo chamador que iria passar as implementações
do calculo de desconto e teriamos que verificar se a aplicação do desconto foi atendida. 

Como não foi possível utilizar o padrão strategy, então recorremos ao padrão chain of responsability que é um padrão de projeto que cria uma cadeia de execução
na qual cada processo será executado até que um seja satisfaça as informações passadas por parametro, se o primeiro método for atendido os outros não serão executados
caso contrário o padrão chain of responsability encaminhará para o próximo.

Resumindo o padrão chain of responsability diz que o primeiro que conseguir processar retorna a informação.

Mas ainda podemos melhorar nosso código aplicando um outro padrão, onde apenas iremos modificar algumas implementações sem quebrar os testes unitários, por isso
a importância de ter um código simples e testável se utilizando das boas práticas de desenvolvimento de software. Os testes unitários nos proporciona uma segurança
na refatoração e, com isso, iremos incluir o padrão template method.
