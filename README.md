# EstruturaDados
<h2>Curso de estrutura de dados lineares</h2>

Aqui você encontrará as definições de estrutura de dados lineares.

<strong>Lista Ligada</strong>

É um tipo de estrutura dinâmica onde os seus objetos estão ligados através de
setas, cada objeto dentro dessa lista é referenciado pela anterior.
Diferente do Vetor, os objetos incluídos nessa estrutura não ficam um do lado do outro mas 
cada objeto tem na sua memória a localização do próximo.
A vantagem da lista ligada é que fica mais fácil para inserir e excluir elemento em qualquer
posição, porém, sua desvantagem é a falta de índice, onde temos quer percorrer todas as referências 
para achar o elemento que desejamos.

<strong>Lista Duplamente Ligada</strong>

Basicamente é a mesma estrutura da lista ligada, porém essa estrutura tem como referência dois nós que por sua vez faz
referência a célula anterior e a próxima.
A vantagem dessa lista se da pela maior facilidade para o controle da lista e a principal desvantagem é o espaço em 
memória usado para comportar duas referências para cada célula.

<strong>Pilha</strong>

A pilha é uma estrutura de dados que armazenam seus elementos um em cima do outro igual uma pilha de pratos. A estrutura funciona da seguinte maneira, o primeiro dado a entrar será o último a sair, por exemplo, vamos imaginar uma pilha de pratos que colocamos em cima de uma bancada, não é conveniente tirarmos o prato que está na base pois o perigo de derrubar os outros é muito grande, por isso a melhor maneira de excluir um item de uma pilha será pelo último item que você colocou. Estrutura conhecida como LIFO (Last In Firs Out) Último a entrar Primeiro a Sair.

<strong>Fila</strong>

Diferente da pilha, a fila consiste em uma estrutura de dados onde os elementos ficam enfileirados. Vamos imaginar uma fila de supermercado, quem chega primeiro será o primeiro a ser atendido. Na fila, funciona igual, o primeiro elemento a entrar será o último o primeiro a sair. No mundo da programação isso é denominado de FIFO (First In First Out), para o português "PEPS" - Primeiro a entrar Primeiro a Sair.
