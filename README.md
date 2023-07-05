# MedVoll
<p align="center">
  <img alt="MedVoll" src="https://github.com/Julianamcs/medVoll/blob/main/src/main/resources/img/img_bg.png" width="100%">
</p>
Spring Boot 3: desenvolva uma API Rest em Java!

#Objetivos
Desenvolvimento de uma API Rest
CRUD (Create, Read, Update e Delete)
Validações
Paginação e ordenação
O objetivo neste curso é usarmos o Spring Boot para desenvolvermos uma API Rest, com algumas . A ideia é desenvolver um CRUD, sendo as quatro operações fundamentais das aplicações: cadastro, listagem, atualização e exclusão de informações.

#funcionalidades

usando o Bean Validation. conceito de paginação e ordenação das informações que a nossa API vai devolver.

#Tecnologias
Spring Boot 3
Java 17
Lombok
MySQL/ Flyway
JPA/Hibernate
Maven
Insomnia

Faremos tudo isso usando algumas tecnologias, como Spring Boot 3, sendo a última versão disponibilizada pelo framework. Usaremos, também, o Java 17 sendo a última versão LTS (Long-term support, em português "Suporte de longo prazo") que possui maior tempo de suporte disponível para o Java.

Aprenderemos a usar alguns recursos das últimas versões do Java para deixarmos o nosso código mais simples. Utilizaremos em conjunto com o projeto o Lombok, responsável por fazer a geração de códigos repetitivos, como getters, setters, toString, entre outros. Tudo via anotações para o código ficar menos verboso.

Usaremos o banco de dados MySQL para armazenar as informações da API e junto com ele utilizaremos a biblioteca Flyway. Isso para termos o controle do histórico de evolução do banco de dados, um conceito que chamamos de Migration.

A camada de persistência da nossa aplicação será feita com a JPA (Java Persistence API), com o Hibernate como implementação dessa especificação e usando os módulos do Spring Boot, para tornar esse processo o mais simples possível.

Usaremos o Maven para gerenciar as dependências do projeto, e também para gerar o build da nossa aplicação. Por último, como focaremos na API Rest (apenas no Back-end), não teremos interface gráfica, como páginas HTML e nem Front-end e aplicativo mobile.

Mas para testarmos a API, usaremos o Insomnia, sendo uma ferramenta usada para testes em API. Com ela, conseguimos simular a requisição para a API e verificar se as funcionalidades implementadas estão funcionando.

Essas são as tecnologias que usaremos ao longo deste curso.

#Qual é o nosso projeto?
Protótipo do aplicativo que será trabalhado ao longo deste curso. Nele, há três telas mostradas lado a lado, da esquerda para direita. A primeira tela é a tela inicial, em que há a logo do aplicativo no canto superior direito. Abaixo há três botões retangulares grande e azuis que ocupam o resto da tela para escolher as seções. De cima para baixo, a ordem dos botões é: Médicos(as), Pacientes e Consultas. A segunda tela é para pesquisar na seção escolhida anteriormente. No caso, mostra os resultados da seção "Médicos(as)". Se não houver um filtro, todos os resultados aparecerão em ordem alfabética. A terceira e última tela é um formulário de cadastro, com os campos a serem preenchidos. Os campos, de cima para baixo, são: Nome completo, especialidade, CRM, e-mail, telefone ou celular, logradouro, número, complemento e cidade
Trabalharemos em um projeto de uma clínica médica fictícia. Temos uma empresa chamada Voll Med, que possui uma clínica que precisa de um aplicativo para monitorar o cadastro de médicos, pacientes e agendamento de consultas.

Será um aplicativo com algumas opções, em que a pessoa que for usar pode fazer o CRUD, tanto de médicos quanto de pacientes e o agendamento e cancelamento das consultas.

Vamos disponibilizar esse protótipo, mas lembrando que é somente para consultas, para visualizarmos como seria o Front-end. Isso porque o foco deste curso é o Back-end.

A documentação das funcionalidades do projeto ficará em um quadro do Trello com cada uma das funcionalidades. Em cada cartão teremos a descrição de cada funcionalidade, com as regras e validações que vamos implementar ao longo do projeto.

Esse é o nosso objetivo neste curso, aprender a usar o Spring Boot na versão 3 para desenvolvermos o projeto dessa clínica médica, utilizando as tecnologias mencionadas anteriormente.

Transcrição
Boas-vindas ao curso de Spring Boot 3: aplique boas práticas e proteja uma API Rest!

Me chamo Rodrigo Ferreira e serei o seu instrutor ao longo deste curso, em que vamos aprender como usar as ferramentas do Spring Boot, sendo um framework do Java.

Rodrigo Ferreira é uma pessoa de pele clara, com olhos castanhos e cabelos castanhos e curto. Veste camiseta rosa lisa, e está sentado em uma cadeira preta. Ao fundo, há uma parede lisa com iluminação azul gradiente.

No curso anterior...
Este é o segundo curso, é importante que você tenha concluído o anterior Curso de Spring Boot 3: desenvolva uma API Rest em Java. Nele, iniciamos o projeto que daremos continuidade.

Recapitulando, no primeiro curso aprendemos como funciona o Spring Boot, a criar um projeto usando Spring initializr e começamos a desenvolver a API Rest.

No caso, fizemos o CRUD (Create, Read, Update e Delete), implementamos a funcionalidade de cadastro, listagem, remoção e atualização. Aprendemos, também, a fazer validações de formulários utilizando o bean validation. Por fim, focamos na paginação e ordenação.

Desenvolvimento de uma API Rest
CRUD (Create, Read, Update e Delete)
Validações
Paginação e ordenação
Tudo isso foi desenvolvido no curso anterior, e a ideia deste presente curso é dar continuidade ao projeto iniciado. Partiremos do ponto que paramos no curso passado, e aprenderemos novos recursos do framework.

A seguir, vamos relembrar o layout do aplicativo mobile da nossa aplicação:

Protótipo do aplicativo que será trabalhado ao longo deste curso. Nele, há três telas mostradas lado a lado, da esquerda para direita. A primeira tela é a tela inicial, em que há a logo do aplicativo no canto superior direito. Abaixo há três botões retangulares grandes e azuis que ocupam o resto da tela para escolher as seções. De cima para baixo, a ordem dos botões é: Médicos(as), Pacientes e Consultas. A segunda tela é para pesquisar na seção escolhida anteriormente. No caso, mostra os resultados da seção "Médicos(as)". Se não houver um filtro, todos os resultados aparecerão em ordem alfabética. A terceira e última tela é um formulário de cadastro, com os campos a serem preenchidos. Os campos, de cima para baixo, são: Nome completo, especialidade, CRM, e-mail, telefone ou celular, logradouro, número, complemento e cidade.
Lembrando que focamos na parte de back-end, na API Rest, e continuaremos trabalhando nesse projeto da clínica médica. Desenvolvemos o CRUD de médicos e pacientes, e daremos prosseguimento neste curso.

Objetivos
Boas práticas na API
Tratamento de erros
Autenticação/Autorização
Tokens JWT
Os objetivos deste segundo curso são: aprender boas práticas na API referente ao protocolo HTTP. Faremos ajustes na classe controller, para seguir as boas práticas do protocolo HTTP quanto ao retorno dos códigos HTTP e das respostas que a API devolve.

Logo após, realizaremos tratamento de erros. Eventualmente, pode ocorrer um erro na API, e precisamos entender o que o Spring faz ao ocorrer uma exception enquanto o programa é executado, o que é devolvido como resposta para o cliente da API.

Assim, vamos personalizar esses retornos para tratar esses erros da melhor forma possível.

Após isso, focaremos na segurança, no controle de autenticação e de autorização da API. No curso anterior não abordamos isso, logo a nossa API está pública - qualquer pessoa pode enviar requisições para remover, atualizar ou alterar informações da API.

Mas não é dessa forma que desejamos, precisamos ter um controle. Isso será feito na aplicação front-end, porém, na API precisamos ter um código que permite o usuário se autenticar, e também ter um controle de acesso de informações públicas e privadas.

Aprenderemos a aplicar isso com o Spring Security, sendo um módulo do Spring responsável por monitorar esse controle.

No caso, usaremos a autenticação fundamentada em tokens com o padrão JSON Web Token (JWT).

São esses os objetivos do segundo curso, focaremos em boas práticas, tratamento de erros e no controle de acesso, autenticação e autorização, usando tokens.

<p align="center">
  <img alt="MedVoll" src="https://github.com/Julianamcs/medVoll/blob/main/src/main/resources/img/img%20consulta.png" width="100%">
</p>

#Transcrição

Desenvolver uma API Rest;
Desenvolver um CRUD (Create, Read, Update e Delete);
Fazer validações;
Fazer paginação e ordenação das informações;
Usar boas práticas REST;
Tratar erros;
Autenticar e autorizar o controle de acesso com JWT.
O que aprenderemos neste curso
Um dos objetivos deste curso é implementarmos a funcionalidade de agendamento de consultas. Anteriormente, desenvolvemos o CRUD de médicos e o de pacientes. Faltou implementar a funcionalidade mais importante do projeto, o agendamento de consultas.

Também aprenderemos a documentar a nossa API para facilitar a vida de quem precisa consumi-la, ou seja, a equipe que desenvolverá o aplicativo mobile ou a aplicação Front-End da nossa API.

Essas pessoas precisam saber quais as URLs da nossa API, os métodos HTTP suportados, os parâmetros, o formato, o que é devolvido pela API e assim por diante. Geraremos uma documentação automática usando uma biblioteca que se integra com o Spring Boot.

Também aprenderemos a fazer testes automatizados em um projeto com Spring Boot. Já que implementamos repository e controllers, precisaremos fazer testes automatizados destes componentes.

Mas como escrever um teste com a biblioteca JUnit padrão do Java para testar essas classes e componentes que dependem de informações e recursos do Spring? Aprenderemos a fazer isso neste curso.

Por fim, aprenderemos sobre o build do projeto. Imagine que terminamos o nosso projeto e queremos fazer o seu deploy em algum servidor, seja um servidor Cloud ou interno da empresa.

Como geramos o pacote do projeto e fazemos o build? Como funciona o build de uma aplicação que utiliza o Spring Boot? Como executamos o projeto dentro de um servidor independentemente da plataforma utilizada? Também falaremos de tudo isso neste curso.

Além disso, continuaremos trabalhando no projeto da clínica médica, com mesmo quadro Trello com o detalhamento da funcionalidade e aprenderemos a usar esses recursos ao longo do curso.
